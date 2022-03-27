package lec13_thread;

public class ThreadMain {

	public static void main(String[] args) {
//		printNumbers(1);
//		printNumbers(20);
		// �⺻������ �����带 �������� ������
		// ���������� �ڵ尡 ����ȴ�.
		
		System.out.println("\n===========================================\n");
		
		// 1. Thread�� ���(extends)���� Ŭ������ �̿��ؼ�
		// ��Ƽ �����带 �����ϴ� ���
		ExThread exThread = new ExThread(100,"�ο�");
		exThread.start();
		ExThread exThread2 = new ExThread(200,"����");
		exThread2.start();
		
		// 2. Runnable �������̽��� ����(implements)��
		// Ŭ������ �̿�
		ExRunnable exRunnable = new ExRunnable(300); 
		Thread exThread3 = new Thread(exRunnable, "����");
		exThread3.start();
		
		Thread exThread4 = new Thread(new ExRunnable(400),"����");
		exThread4.start();
		
		// 3. ���ٽ� ���
		Thread exThread5 = new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
			printNumbers(500);
		}  , "����") ;
		exThread5.start();
		
		System.out.println("MainThread : �� ��ƾ��� ������");
		
		
	}	// main ����
	

	// �Է¹��� ���ں��� +5���� �ܼ�â�� ���� ���
	static void printNumbers(int num) {
		for(int i=num; i<num + 5; i++) {
			System.out.println(i);
			
			try {
				// ���࿡ ��(term)�� �ְ� ���� ��� ��� 
				// sleep() �ȿ� ���ڴ� �и��� ����
				// ���� �� �ڵ带 ���� ���� �����带 ���ߴ°�����,
				// �ٸ� ������� ������ ���� �ʽ��ϴ�.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}