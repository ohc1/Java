package lec13_thread;

public class ExRunnable implements Runnable{
	int num;
	
	ExRunnable(int num){
		this.num = num;
	}
	
	@Override
	public void run() {
		// ���� ���� ���� �������� �̸� ���
		System.out.println(Thread.currentThread().getName());
		ThreadMain.printNumbers(num);
	}
	
}