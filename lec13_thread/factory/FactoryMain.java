package lec13_thread.factory;

public class FactoryMain {
	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.endFactory = new EndFactory(){
			@Override
			public void theEnd() {
				System.out.println("���� ������ �����մϴ�.");
			}
		};
		
		Ramen ramen = new Ramen(factory);
		Thread thread1 = new Thread(ramen, "��");
		thread1.start();
		
		Thread thread2 = new Thread(new Soup(factory), "����");
		thread2.start();
		
		new Thread(new Packing(factory), "����").start();
		
		
	}	// main ����
}