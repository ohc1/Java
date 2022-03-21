package submit03.submit_01;

import java.util.ArrayList;

public class BoardDB {
	private BoardDB() {
		
	}
	private static BoardDB instance = new BoardDB();
	public static BoardDB getInstance() {
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	
	public void addContent(Board board) {
		boardList.add(board);
	}
	
	public int sizeBoard() {
		return boardList.size() + 1;
	}
	
	public void showList() {
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));
		}
	}
}