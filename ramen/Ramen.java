package lec10_extends_interface.ramen;

// �߻� �޼ҵ带 ������ �ִ� Ŭ������
// ������ �߻�Ŭ����(abstract)�� �����ؾ� �Ѵ�.
public abstract class Ramen {
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	// ����� �����Ǹ� ������ִ� �Լ�
	// ��鸶�� �����ǰ� �ٸ��� ������
	// �߻� �޼ҵ�� �����.
	public abstract void printRecipe();
	

	@Override
	public String toString() {
		return "Ramen [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}