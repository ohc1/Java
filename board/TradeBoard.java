package lec10_extends_interface.board;

public class TradeBoard extends Board{
	private String image;	// ��ǰ �̹���
	private int price;		// ��ǰ ����
	
	public TradeBoard(int no, String title, String content, String author, String image, int price) {
		super(no, title, content, author);
		this.image = image;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", image=" + image + ", price=" + price + "]";
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}