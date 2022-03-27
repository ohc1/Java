package lec13_thread.issac;

public class Issac {
	private int toast = 0;

	public synchronized void makeToast() {
		toast += 1;
		System.out.println("�佺Ʈ�� �ϳ� ��������ϴ�. ���: " + toast);

//		notify(); // Wait Set���� ������� ������ �����带 �ϳ� �����.
		notifyAll();		// ������� �����带 ��� �����.

	}

	public synchronized void buyToast(String name, int count) {
		if (toast < count) {
			try {
				// �����带 ���ﶧ����(notify()) �ش� ������� ���
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (toast >= count) {
			toast -= count;
			System.out.println(name + "���� �佺Ʈ�� " + count + "�� �Ⱦҽ��ϴ�. ���: " + toast);
		}else {
			// ����Լ� ���
			// makeToast�� notify()�� �����ؼ� wait()���� ����
			// �����带 ������, toast�� count���� ������
			// �Լ��� �ٽ� �����ؼ� wait()�� �����.
			buyToast(name,count);
		}
		
	}

}