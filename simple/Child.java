package lec10_extends_interface.simple;

public class Child extends Parent{
	
	public Child(String name, int age) {
		// super()�� �θ� Ŭ������ ������
		super(name, age);
	}
	
	// �θ� ���� �޼ҵ带 �׳� ����� �� ������, ������(Override)�ؼ� ����� ���� �ִ�.
	// �Ը��� �°� Ŀ����(����, �߰�)
	@Override
	public void sayHello() {
		System.out.println("�ȳ��ϼ���. ����Դϴ�.");
	}

	@Override
	public String toString() {
		// super�� �θ�Ŭ������ �ǹ��ϸ� 
		// .�� ������ public�� �ʵ� ������ �޼ҵ带 ����� �� �ִ�.
		return super.toString();
	}
	
	
	
}