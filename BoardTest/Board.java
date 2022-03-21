package submit03.submit_01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int no;			// 글 번호
	private String title;	// 글 제목
	private String update;	// 글 게시일
	private String contents;	// 글 내용
	
	public Board(String title, String contents) {
		super();
		BoardDB db = BoardDB.getInstance();
		this.no = db.sizeBoard();
		this.title = title;
		this.contents = contents;
		Date toDay = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY.MM.dd.HH:mm:ss");
		this.update = dateFormat.format(toDay);
	}
	
	public Board() {

	}

	@Override
	public String toString() {
		return "[" + no + "." + " | " + title + " | " + update + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
	
}