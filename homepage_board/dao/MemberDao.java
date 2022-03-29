package submit_0329.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit_0329.model.Board;
import submit_0329.model.Member;

public class MemberDao {
	private MemberDao() {}
	
	private static MemberDao instance = new MemberDao();
	
	public static MemberDao getInstance() {
		if(instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}
	

	
	
	public Member getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT			   			");
		query.append("		 mem_id					");
		query.append("		,mem_pw					");
		query.append("FROM							");
		query.append("		mem_1					");
		query.append("WHERE 	1=1					");
		query.append("AND		mem_id =  ?			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		Member temp = new Member();
		
		while(rs.next()) {
			temp.setId(rs.getString("mem_id"));
			temp.setPw(rs.getString("mem_pw"));
			
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return temp;
		
	}
	
	
	
	// 회원가입
	public int insertMem(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO							");
		query.append("			mem_1						");
		query.append("VALUES		(						");
		query.append("			     ?						");
		query.append("			   , ?						");
		query.append("			 	)						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		Member temp = new Member(id,pw);
		
		int idx = 1;
		ps.setString(idx++, temp.getId());
		ps.setString(idx++, temp.getPw());
		
		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	

}