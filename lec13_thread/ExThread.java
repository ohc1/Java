package lec13_thread;

public class ExThread extends Thread{
	int num;
	
	ExThread(int num, String name){
		super(name);
		this.num = num;
	}
	
	
	
	@Override
	public void run() {
		// ���� �������� Thread�� �̸� ���
		System.out.println(super.getName());
		ThreadMain.printNumbers(num);
	}
}