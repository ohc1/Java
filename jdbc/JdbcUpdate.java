package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdate {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		// 1. ����̹� �ε� ( �� �ѹ��� �ε����ָ� �ȴ�)
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
			stmt = conn.createStatement();
			StringBuffer query = new StringBuffer();
			query.append("UPDATE 					");
			query.append("			students		");
			query.append("SET stu_name = '����'		");
			query.append("WHERE 		1=1			");
			query.append("AND		stu_id = 3		");
			
			int cnt = stmt.executeUpdate(query.toString());
			
			if(cnt > 0) {
				System.out.println(cnt + "�� ���� �Ǿ����ϴ�.");
			}else {
				System.out.println("������Ʈ�� �� �ȵǾ����ϴ�.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
			
		}
		
		

	} // main ����

}