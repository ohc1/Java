package submit_0329.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.jdbc.ConnectionPool;
import submit_0329.dao.BoardDao;
import submit_0329.model.Board;

public class BoardService {
	private BoardService() {}
	
	private static BoardService instance = new BoardService();
	private BoardDao dao = BoardDao.getInstance();
	private ConnectionPool pool = ConnectionPool.getInstance();
	
	public static BoardService getInstance() {
		if(instance == null) {
			instance = new BoardService();
		}
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	// 글 목록조회
	public ArrayList<Board> boardList(){
		Connection conn = pool.getConnection();
		
		try {
			return dao.boardList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)pool.releaseConnection(conn);
		}
		
		return new ArrayList<Board>();
	}
	
	// 글 쓰기
	public int insertBoard(String title, String author, String text) {
		Connection conn = pool.getConnection();
		
		try {
			return dao.insertBoard(conn, title, author, text);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)pool.releaseConnection(conn);
		}
		
		return 0;
	}
	
	
	public void showList() {
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
	
	// 글 조회
	public ArrayList<Board> searchCon(int no){
		Connection conn = pool.getConnection();
		
		try {
			return dao.searchCon(conn, no);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null)pool.releaseConnection(conn);
		}
		
		return new ArrayList<Board>();
	}
	
	
	
	public void showBoard(String title, String author, String update, String text) {
		System.out.println("--------------------");
		System.out.println("제목: " + title);
		System.out.println("작성자: " + author);
		System.out.println("작성일: " + update);
		System.out.println("글내용: " + text);
		System.out.println("---------------------");
	}
	
	
	
	
	
	
}