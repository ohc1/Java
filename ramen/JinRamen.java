package lec10_extends_interface.ramen;

public class JinRamen extends Ramen{

	public JinRamen(String name, int price) {
		super(name, price);
	}

	// ��ӹ��� �߻� Ŭ������ �߻� �޼ҵ带 �ݵ�� 
	// ������(Override)�ؾ� �Ѵ�.
	@Override
	public void printRecipe() {
		System.out.println("���� ���� ��� ������ �ְ� 3�� �� �弼��.");
	}
	
}