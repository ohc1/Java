package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {
	public static void main(String[] args) {
		// ���� ����
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. ����̹� �ε� ( �� �ѹ��� �ε����ָ� �ȴ�)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� ��� ����");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����̹� ��� ����");
			System.exit(0);	// ���α׷� ����
		}
		
		try {
		// 2. �����ͺ��̽� ������ ���� (Connection)�Ѵ�.
		// ip�ּ�(ifconfig �ּ�(��), localhost = 127.0.0.1)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			conn = DriverManager.getConnection(url, id, pw);
		
		// 3. ������ ��ü�� �����Ѵ�.
			stmt = conn.createStatement();
			
		// 4. ������ ����� ���ÿ� ����� ��ü�� ��´�.
			StringBuffer query = new StringBuffer();
			query.append("SELECT			   				");
			query.append("		 stu_id			AS id		");
			query.append("		,stu_name		As name		");
			query.append("		,stu_score		AS score	");
			query.append("FROM								");
			query.append("		students					");
			
			rs = stmt.executeQuery(query.toString());
			
		// 5. ������(rs) ó��
			while(rs.next()) {	// ���� ���� ������ true�� ��ȯ�ϸ�, Ŀ���� ��ĭ ��������.
				int stuId = rs.getInt("id");
				String stuName = rs.getString("name");
				int stuScore = rs.getInt("score");
				System.out.println("���̵�: " + stuId + ", �̸�: " + stuName + ", ����: " + stuScore);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
		// 6. �ڿ� ����(close)
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			// Connection ��ü�� ���߿� �ݰ�, �� �ݾƾ� �ȴ�.(�߿�)
			if(conn != null) try {conn.close();}catch(SQLException e) {}
			
		}
		
		
		
		
		
		
	} // main ����

}