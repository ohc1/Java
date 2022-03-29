package submit_0329.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Board {
	private int no;
	private String title;
	private String author;
	private String text;
	private String update;
	
	public Board(String title, String author, String text) {
		this.no = no;
		this.title = title;
		this.author = author;
		this.text = text;
		Date toDay = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY.MM.dd.HH:mm:ss");
		this.update = dateFormat.format(toDay);
	}
	
	public Board() {}

	@Override
	public String toString() {
		return "[" + no + " | " + title + " | "+  author + " | "+ update + "]";
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getUpdate() {
		return update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}
	
	
	
	
}