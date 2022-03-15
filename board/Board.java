package lec10_extends_interface.board;

public class Board {
	private int no;			// �۹�ȣ
	private String title;	// ������
	private String content;	// �۳���
	private String author;	// ���ۼ���
	
	public Board(int no, String title, String content, String author) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", author=" + author + "]";
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
}