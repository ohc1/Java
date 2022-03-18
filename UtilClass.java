package lec09_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 * ������ �Լ����� �����ϴ� Ŭ����
 */
public class UtilClass {
	
	public static String owner = "������: ����ö";
	

	/**
	 * �Է��� �Ǽ��� �Ҽ� n��° �ڸ��� �������ִ� �Լ�
	 * @param douNum �ݿø� �ϰ� ���� �Ǽ�
	 * @param n	   �ݿø� �ϰ� ���� �ڸ�
	 * @return		   �ݿø��� �Ǽ�
	 */
	public static double round(double douNum, int n) {
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}

		double mul = douNum * one;
		long longNum = Math.round(mul);
		double douVal = (double)longNum / one;
		return douVal;
		
	}
	
	/**
	 * ���� �׼�(int, ����: ��)�� ������ �̻۹��ڿ�(String)�� �ٲ㼭 �������ִ� �Լ�
	 */
	public static String formatSalary(int salary) {
		if(salary < 10000) {	// ���� 1�� �̸�
			String str = salary + "";
			return str.substring(0,1) + "," + str.substring(1) + "����";
		}else {
			int ouk = salary / 10000;
			int remain = salary%10000;
			
			if(remain < 1000) {
				return ouk + "�� " + remain + "����";
			}
			
			String temp = remain + "";			
			return ouk + "�� " + temp.substring(0,1) + "," + temp.substring(1) + "����";
			
		}

	}
	/**
	 * int ����Ʈ�� ������, �� ��ҵ��� ������ �����ϴ� �Լ�
	 */
	public static int sumIntList(ArrayList<Integer> intList) {
		int sum = 0;
		for(int i = 0; i < intList.size(); i++) {
			sum += intList.get(i);
		}
		return sum;
	}
	
	/**
	 *  50% Ȯ���� true/false�� �������ִ� �Լ�
	 */
	public static boolean banban() {
		// randInt�� 0�Ǵ� 1
		int randInt = (int)(Math.random() * 2);
//		if(randInt == 1) {
//			return true;
//		}
		return (randInt == 1);
	}
	
	/**
	 * ����ũ�� ���̵� ������ִ� �޼ҵ� 
	 */
	public static String makeUniqueId() {
		Date toDay = new Date();
//		Random random = new Random();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String dateToday = dateFormat.format(toDay);
		for(int i = 0; i < 6; i++) {
			int randInt = (int)(Math.random()*10);
			dateToday += randInt;
		}
//		int a = (int)(Math.random()*10);
//		int b = (int)(Math.random()*10);
//		int c = (int)(Math.random()*10);
//		int d = (int)(Math.random()*10);
//		int e = (int)(Math.random()*10);
//		int f = (int)(Math.random()*10);
		
//		String guestId = dateToday + a + b + c + d + e + f;
		return dateToday;
	}
	
	
}