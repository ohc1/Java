package lec05_controll;

import java.util.Scanner;

public class ConditionQuestion {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�̸��� �Է����ּ��� >> ");
//		String name = sc.nextLine();
//		System.out.print("����ó�� \"-\" ���� �Է����ּ��� >> ");
//		String phone = sc.nextLine();
//		System.out.print("���̸� �Է����ּ��� >> ");
//		String age = sc.nextLine();
//		
//		if((name.length()>0) && (phone.length() == 11 || phone.length() == 10) && (Integer.parseInt(age) >= 14)) {
//			System.out.println("ȸ������ ��ư Ȱ��ȭ");
//		}else {
//			System.out.println("ȸ������ �Ұ�");
//		}
		
		
		// ����ڷκ��� ����, ����, ���� ������ ����
		// �Է¹޾Ƽ� ��������� ���ϰ�, ����� ������ּ���.
		// ��������� 90�� �̻��̸� A, 80�� �̻��̸� B,
		// 70���̻��� C, ������ D
		
		// ����ڷκ��� �Է¹��� ������
		// �������� int�� ��ȯ�Ͽ� �� ������ ���ϰ� ������ 3
		// if���� ����ؼ� ����� ���
		
//		String kor = "";
//		String eng = "";
//		String math = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ����: ");
		String kor = sc.nextLine();
		System.out.print("���� ����: ");
		String eng = sc.nextLine();
		System.out.print("���� ����: ");
		String math = sc.nextLine();
		
		int resultKor = Integer.parseInt(kor);
		int resultEng = Integer.parseInt(eng);
		int resultMath = Integer.parseInt(math);
		
		double result = (resultKor+resultEng+resultMath) / 3.0;
		
		System.out.println("���"+result+"�Դϴ�.");
		
		int resultInt = (int) Math.round(result);
		System.out.println("�ݿø��� ��: " +resultInt);
		
		if(resultInt >= 90) {
			System.out.println("A��� �Դϴ�.");
		}else if(resultInt >= 80) {
			System.out.println("B��� �Դϴ�.");
		}else if(resultInt >= 70) {
			System.out.println("C��� �Դϴ�.");
		}else {
			System.out.println("D��� �Դϴ�.");
		}
		
		
		
		
		
		
	}
}
