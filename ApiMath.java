package lec11_java_api;

import java.util.Random;

public class ApiMath {
	public static void main(String[] args) {
		final double PI = 3.141592;
		
		// �ݿø�
		double roundPI = Math.round(PI);
		System.out.println(roundPI);
		
		// �Ҽ� ��°�ڸ����� �ݿø��Ͽ� 3.142 �����
		roundPI = Math.round(PI*1000.0)/1000.0;
		System.out.println(roundPI);
		
		// �ø�
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);
		
		// ����(����)
		double floorPI = Math.floor(PI);
		System.out.println(floorPI);
		
		// ���밪
		int minus = -10;
		int absVal = Math.abs(minus);
		System.out.println(absVal);
		// �������� ���밪 ���ϱ�
		if(minus < 0) {
			System.out.println(minus * -1);
		}else {
			System.out.println(minus);
		}
		
		// ����
		// 10�� 8����
		double money = Math.pow(10, 8);
		System.out.println(money);
		// 1.0E8 = 1 ���ϱ� 100000000(10^8) ��� ��
		int intMoney = (int)Math.pow(10, 8);
		System.out.println(intMoney);
		// 7�� 4����
		money = Math.pow(7, 4);
		System.out.println(money);
		// �������� ���� ����
		// 10�� 8����
		long num = 1;
		for(int i = 0; i < 8; i++) {
			num *= 10;
		}
		System.out.println(num);
		// 7�� 4����
		num = 1;
		for(int i = 0; i < 4; i++) {
			num *= 7;
		}
		System.out.println(num);
		
		
		// ������(��Ʈ)
		double sqrtNum = Math.sqrt(num);
		System.out.println(sqrtNum);
		
		
		// ���� ����(����) ����
		// 0 ~ 1 ������ �Ǽ� ���� (1�� ������)
		double randDouble = Math.random();
		System.out.println(randDouble);
		// 0���� 9������ ���� ����
		int randInt = (int)(Math.random() * 10);
		System.out.println(randInt);
		// 10���� 20������ ���� ����
		randInt = (int)(Math.random() * 11) + 10;
		System.out.println(randInt);
		// a���� b������ ���� ����
		int a = 25;
		int b = 63;
		randInt = (int)(Math.random() * (b-a+1)) + a;
		
		System.out.println("\n============================================\n");
		
		// ������ ���� Random Ŭ������ ����
		// ���� ��ü�� �����ؾ� �ϴ� �������� �ִ�.
		Random random = new Random();
		// .nextInt(n) = 0���� n-1���� �� ������ ���� ��ȯ
		// 0 ~ 9 ������ ���� ����
		System.out.println(random.nextInt(10));
		// 10 ~ 20 ������ ���� ����
		System.out.println(random.nextInt(11) + 10);
		// ���� boolean ��
		System.out.println(random.nextBoolean());
		// �õ� ����
		// ���� ������ �����Ҷ� ���������� ���Ǵ� ��
		random.setSeed(7);
		for(int i = 0; i < 6; i++) {
			System.out.print(random.nextInt(45) + 1 + " ");
		}
		
		
		
		
		
		
		
		
	} // main ����
}