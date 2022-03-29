package submit_0329.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit_0329.model.Board;

public class BoardDao {
	private BoardDao() {}
	private static BoardDao instance = new BoardDao();
	
	public static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	
	// 글 목록
	public ArrayList<Board> boardList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT			   		");
		query.append("		 con_no				");
		query.append("		,con_title			");
		query.append("		,con_author			");
		query.append("		,con_text			");
		query.append("		,con_date			");
		query.append("FROM						");
		query.append("		board				");
		query.append("ORDER BY					");
		query.append("		con_no ASC			");
		
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Board> result = new ArrayList<Board>();
		
		while(rs.next()) {
			Board temp = new Board();
			
			temp.setNo(rs.getInt("con_no"));
			temp.setTitle(rs.getString("con_title"));
			temp.setAuthor(rs.getString("con_author"));
			temp.setText(rs.getString("con_text"));
			temp.setUpdate(rs.getString("con_date"));
			
			result.add(temp);
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return result;
	}
	
	// 글 쓰기
	public int insertBoard(Connection conn, String title, String author, String text) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("INSERT INTO							");
		query.append("			board						");
		query.append("VALUES		(						");
		query.append("			   con_seq.NEXTVAL			");
		query.append("			  , ?						");
		query.append("			  , ?						");
		query.append("			  , ?						");
		query.append("			  , ?						");
		query.append("				 )						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		Board temp = new Board(title, author, text);
		
		int idx = 1;
		ps.setString(idx++, temp.getTitle());
		ps.setString(idx++, temp.getAuthor());
		ps.setString(idx++, temp.getText());
		ps.setString(idx++, temp.getUpdate());
		
		int cnt = ps.executeUpdate();
		
		if(ps != null)ps.close();
		
		return cnt;
	}
	
	
	// 글조회
	public ArrayList<Board> searchCon(Connection conn, int no) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT			   		");
		query.append("		 con_title			");
		query.append("		,con_author			");
		query.append("		,con_date			");
		query.append("		,con_text			");
		query.append("FROM						");
		query.append("		board				");
		query.append("WHERE  1=1				");
		query.append("AND   con_no = ?			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		
		ps.setInt(1, no);
		
		ArrayList<Board> result = new ArrayList<Board>();
		
		while(rs.next()) {
			Board temp = new Board();
			
			temp.setTitle(rs.getString("con_title"));
			temp.setAuthor(rs.getString("con_author"));
			temp.setUpdate(rs.getString("con_date"));
			temp.setText(rs.getString("con_text"));
			
			result.add(temp);
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
}