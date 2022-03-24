package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsDelete {

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

			StringBuffer query = new StringBuffer();
			query.append("DELETE								");
			query.append("			students				");
			query.append("WHERE	1=1							");
			query.append("AND stu_id IN (?,?) 				");

			
			ps = conn.prepareStatement(query.toString());

			// PrePareStatement�� setString�� �ε����� 1���� ����
			int idx = 1;
			ps.setInt(idx++, 4);
			ps.setInt(idx++, 5);

			int cnt = ps.executeUpdate();

			if (cnt > 0) {
				System.out.println(cnt + "���� �����Ǿ����ϴ�.");

				// ���޾� ������ �����ϱ� (����õ)
				ps.close();
				ps = conn.prepareStatement("SELECT * FROM students");

				rs = ps.executeQuery();

				while (rs.next()) {
					int stuId = rs.getInt("stu_id");
					String stuName = rs.getString("stu_name");
					int stuScore = rs.getInt("stu_score");

					System.out.println("���̵�: " + stuId + ", �̸�: " + stuName + ", ����: " + stuScore);
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
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
	}	// main ����

}