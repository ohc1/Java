package lec13_thread.factory;

public class Factory {
	int countRamen = 0;		// ����� �� ����
	int countSoup = 0;		// ����� ���� ����
	int count = 0;			// ����� ��� ����
	public EndFactory endFactory;
	
	
	
	public synchronized void makeRamen() {
		System.out.println("���� ��������ϴ�. �� ����: " + countRamen);
		countRamen++;
		notify();
	}
	
	public synchronized void makeSoup() {
		System.out.println("������ ��������ϴ�. ���� ����: " + countSoup);
		countSoup += 2;
		notify();
	}
	
	public synchronized void packing() {
		if(countRamen > 0 && countSoup >0) {

			
			countRamen--;
			countSoup--;
			count++;
			System.out.println("����� ��������ϴ�. ��ü����: " + count);
			
			if(count == 10) {
				endFactory.theEnd();
				return;
			}

		}else {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		packing();
		
	}
	
}