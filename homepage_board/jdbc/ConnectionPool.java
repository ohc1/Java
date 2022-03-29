package submit_0329.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

/**
 * ConnectionFactory�κ��� maxConn ��ŭ
 * Connection ��ü�� �����ؼ� Ǯ(Pool)�� �����ϴ� Ŭ����
 */
public class ConnectionPool {
	
	// Vector�� ����ȭ(synchronized)�� ����Ǵ� ArrayList�̴�.
	private static Vector<Connection> pool = new Vector<Connection>();
	
	private static ConnectionPool instance = new ConnectionPool();
	
	public static ConnectionPool getInstance() {
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
	
	private ConnectionPool() {
		try {
			initPool();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private synchronized void initPool() throws SQLException {
		destroyPool();
		
		ConnectionFactory factory = ConnectionFactory.getInstance();
		int maxConn = factory.getMaxConn();
		
		for(int i = 0; i < maxConn; i++) {
			pool.add(factory.getConnection());
		}
		
	}
	
	private synchronized void destroyPool() throws SQLException {
		for(Connection conn : pool) {
			conn.close();
		}
		pool.clear();
	}
	
	public synchronized Connection getConnection() {
		if(pool.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Connection conn = pool.remove(pool.size()-1);
		return conn;
	}
	
	public synchronized void releaseConnection(Connection conn) {
		pool.add(conn);
		notify();
	}
	
}