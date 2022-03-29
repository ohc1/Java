package submit_0329.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.jdbc.ConnectionPool;
import submit_0329.dao.MemberDao;
import submit_0329.model.Member;

public class MemberService {
	private static MemberService instance = new MemberService();
	private MemberDao dao = MemberDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private MemberService() {}
	
	public static MemberService getInstance() {
		if(instance == null) {
			instance = new MemberService();
		}
		return instance;
	}
	
	private ArrayList<Member> memList = new ArrayList<Member>();
	
	// 회원가입
	public int insertMem(String id, String pw) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertMem(conn, id, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		return 0;
	}
	

	
	public Member getMem(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.getMem(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		
		return new Member();
	}

	
	
	
}