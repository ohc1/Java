package lec10_extends_interface.ramen;

public class BuldakRamen extends Ramen{

	public BuldakRamen(String name, int price) {
		super(name, price);
	}

	@Override
	public void printRecipe() {
		System.out.println("���� ���� ���� ���� �� �׻����� �־� �񺭵弼��.");
	}

}