package lec14_jdbc_jsp.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Connection ��ü�� ������ִ� ����(Factory) Ŭ����
 */
public class ConnectionFactory {
	private String driver;
	private String url;
	private String user;
	private String password;
	private int maxConn;
	
	private static ConnectionFactory instance = new ConnectionFactory();
	
	public static ConnectionFactory getInstance() {
		if(instance == null) {
			instance = new ConnectionFactory();
		}
		return instance;
	}
	
	private ConnectionFactory() {
		try {
			Properties prop = new Properties();
			
			// ������Ƽ �о����
			InputStream reader = getClass().getResourceAsStream("../db.properties");
			prop.load(reader);
			
			// ������Ƽ �������� �ʵ庯�� ����
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			maxConn = Integer.parseInt(prop.getProperty("maxConn"));
			
			
			// ����̹� �ε�
			Class.forName(driver);
			System.out.println("����̹� �ε� ����");
		} catch (IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// DB���� Connection ��ü �����ִ� �޼ҵ�
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url,user,password);
		return conn;
	}
	
	public int getMaxConn() {
		return maxConn;
	}
}