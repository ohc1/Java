package lec11_java_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class ApiFormat {
	public static void main(String[] args) {
		// ���� ���� DecimalFormat
		
		// �ڸ����� ���� ���� �տ� 0 ���̱�
		// 1�̸� 001, 11�̸� 011, 132�� 132
		DecimalFormat deciFormat = new DecimalFormat("000");
		String strNum = deciFormat.format(1);
		System.out.println(strNum);
		System.out.println(deciFormat.format(11));
		System.out.println(deciFormat.format(132));
		
		System.out.println("\n=======================================\n");
		
		// �ڸ����� ���� �Ҽ� �ڿ� 0 ���̱�
		// 0.1 �̸� 0.100, 0.11�̸� 0.110, 0.132�� 0.132
		deciFormat = new DecimalFormat("0.000");
		System.out.println(deciFormat.format(0.1));
		System.out.println(deciFormat.format(0.11));
		System.out.println(deciFormat.format(0.132));
		
		System.out.println("\n=======================================\n");
		
		// �Ҽ� ��°�ڸ��� �ݿø�
		// 3.141592 -> 3.142
		deciFormat = new DecimalFormat("#.###");
		System.out.println(deciFormat.format(3.141592));
		// ���� ���ڿ��� ����(int)�� �ٲٱ� Integer.parseInt()
		// �Ǽ� ���ڿ��� �Ǽ�(double)�� �ٲٱ� Double.parseDouble()
		double doubVal = Double.parseDouble("3.1415");
		System.out.println(doubVal); 
		
		System.out.println("\n========================================\n");
		
		// õ �������� "," ���̱�
		deciFormat = new DecimalFormat("#,###");
		System.out.println(deciFormat.format(123456790));
		
		
		System.out.println("\n========================================\n");
		
		// ���� ���� MessageFormat
		String formatString = "ID: {0}\n�̸�: {1}\n����ó: {2}";
		String result = MessageFormat.format(formatString, "abc", "����ö", "0101231433");
		System.out.println(result);
		formatString = "ID: %s\n�̸�: %s\n����ó: %s\n";
		System.out.printf(formatString, "abc", "����ö", "0101231433");
		
		// �ι�° ���
		formatString = "ID: {0}\n�̸�: {1}\n����ó: {2}";
		Object[] arguments = {"abc", "����ö", "0101343154"};
		result = MessageFormat.format(formatString, arguments);
		System.out.println(result);
		
		
		
	}

}