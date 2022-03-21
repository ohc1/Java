package submit03.submit_01;

public class CartoonBoard extends Board{
	String img;	// 이미지 파일
	
	public CartoonBoard( String title, String contents, String img) {
		super(title, contents);
		this.img = img;
	}

	@Override
	public String toString() {
		return super.toString() +", CartoonBoard [img=" + img + "]";
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}