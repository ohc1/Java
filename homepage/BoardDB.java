package lec09_class.homepage;

import java.util.ArrayList;

public class BoardDB {
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	private ArrayList<Board> boardList = new ArrayList<Board>();
	
	// �۾���
	public void addBoard(Board board) {
		boardList.add(board);
	}
	
	// ������ ����
	public int sizeBoard() {
		return boardList.size() + 1;
	}
	
	// �Խñ� ��� ��ȸ
	public void showList() {
		System.out.println("�Խ��� ============================");
		for(int i = 0; i < boardList.size(); i++) {
			System.out.println(boardList.get(i).toString());
		}
		System.out.println("==================================");
	}
	
	// �Խñ� ��ȸ
	public void selectBoard(int no) {
		for(int i = 0; i < boardList.size(); i++) {
			if(boardList.get(i).getNo() == no) {
				boardList.get(i).showBoard();
			}
		}
	}
	
	
}