package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsFinal {
	/**
	 * �ѹ� ����(Run) �Ҷ����� ������� ���븮���� ���� 250������ �۱��Ѵ�. (����� ���� -250���� -> ���븮�� ���� +250����)
	 * ���� ������� ������ �ܾ��� 0�� ���ϰ� �ȴٸ� ������ �Ϸ� �ϰ� �ǵ�����(Rollback) = Ʈ�����
	 */
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� ��� ����");
			System.exit(0); // ���α׷� ����
		}

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			conn = DriverManager.getConnection(url, id, pw);

			// Ʈ�����(Transaction) ����
			// �ڵ����� Ŀ��(commit)�Ǵ� ���� ���� ����
			// ��� DB �۾��� �����ϰ� ����Ǵ� ������
			// ���������� Ŀ���� �ϸ�, ���� ���� �߻���
			// �ѹ�(Rollback)�ϵ��� �ϴ°�
			conn.setAutoCommit(false);

			// �ο쾾 ���¿��� 250���� ����
			StringBuffer query = new StringBuffer();
			query.append("UPDATE 							");
			query.append("		bank						");
			query.append("SET bank_account = bank_account - ?");
			query.append("WHERE 		1=1					");
			query.append("AND		bank_name = ?			");

			ps = conn.prepareStatement(query.toString());

			int idx = 1;
			ps.setInt(idx++, 2500000);
			ps.setString(idx++, "�̹ο�");

			int cnt = ps.executeUpdate();

			if (cnt > 0) {
				System.out.println("�ο쾾 ���¿��� 250������ ����Ǿ����ϴ�.");

				ps.close();
				ps = conn.prepareStatement("SELECT * FROM bank WHERE bank_name = '�̹ο�'");

				rs = ps.executeQuery();

				int minwooAc = 0;
				while (rs.next()) {
					String name = rs.getString("bank_name");
					minwooAc = rs.getInt("bank_account");
					System.out.println(name + "���� �ܾ�: " + minwooAc);
				}

				if (minwooAc <= 0) {
					System.out.println("�̹��� ������ ������ �Ϸ� �սô�..");
					// �ѹ�!!
					conn.rollback();
				} else {
					ps.close();
					StringBuffer sql = new StringBuffer();
					sql.append("UPDATE 									");
					sql.append("		bank							");
					sql.append("SET bank_account = bank_account + ?		");
					sql.append("WHERE 		1=1							");
					sql.append("AND		bank_name = ?					");

					ps = conn.prepareStatement(sql.toString());

					int index = 1;
					ps.setInt(index++, 2500000);
					ps.setString(index++, "����");

					int count = ps.executeUpdate();

					if (count > 0) {
						System.out.println("���ƾ� ���¿� ������ ���Խ��ϴ�!!!");
						// Ŀ��!!
						conn.commit();

						ps.close();
						ps = conn.prepareStatement("SELECT * FROM bank");

						rs.close();
						rs = ps.executeQuery();

						while (rs.next()) {
							System.out.println(rs.getString("bank_name") + ", " + rs.getString("bank_account"));
						}

					}

				}

			} else {
				System.out.println("���� ������ ���������� �̷������ �ʾҽ��ϴ�.");
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException s) {
			}
		} finally {
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
				}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}

		}

	}

}