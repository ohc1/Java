package lec12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		int[] intArray = {1,2,3};
		
		// ������ �߻��ϸ� ���α׷��� ��� ����Ǳ� ������ 
		// �� ��������� ������ ��������, ���� ��� ����ȴ�.
		try {
			System.out.println("�ε��� ����");
			System.out.println(intArray[3]);
			System.out.println("�ε��� ��");
		}catch(Exception e) {
			e.printStackTrace();
			// ������ �ܼ�â�� ��µǴ� ������
			// syso�� �ܼ�â�� ��µǴ� ������ �ٸ���.
			System.err.println("�� �����");
			System.out.println("���̰� ���ߴ�!");
			// ������Ʈ�� ��� ���� ����Ʈ�� �̵������ش�.
		}
		
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e){
			// ��ü���� ���ܸ� ������ ���� �ִ�.
			System.out.println("�ε��� 3�� �����ϴ�.");
		}catch(Exception e) {
			System.out.println("���� �𸣴� ����");
		}
		
		
		System.out.println("�迭�� ����: " + intArray.length);
		
		System.out.println("\n========================================\n");
		
		int intA = 3;
		int intB = 0;
		
		try {
			System.out.println(intArray[2]);
			System.out.println(intA/intB);
		}catch(ArithmeticException a) {
//			a.printStackTrace();
			System.out.println("0���� ��������!!");
		}catch(ArrayIndexOutOfBoundsException e) {
			// �� ���ܿ� ���� �ٸ� ó���� �� �� �ִ�.
			System.out.println("�ε��� �ѱ�����!!");
		}catch(Exception e) {
			System.out.println("���� �𸣴� ����");
		}
		
		// ����� ����Ǵ� ������ ��� ���� Exception Ŭ������
		// ���� ó���Ѵ�. -> BizException
		
		try {
			System.out.println(ExMethod.divide(5, 0));
		}catch(BizException e) {
			System.out.println("������ �����߻�");
			// �� Ÿ�ֿ̹� ������ ���� �ڵ�� ���� �޽����� �����ϴ�.
//			e.printStackTrace();
			// ���� �޽��� �б�
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("���� �𸣴� ����");
		}
		
		System.out.println("\n==========================================\n");
		
		try {
			ExMethod.showName("243234");
		}catch(BizException b) {
			System.out.println("�����ڵ�: " + b.getErrCode());
			System.out.println("�����޽���: " + b.getMessage());
		}catch(Exception e) {
			System.out.println("���� �𸣴� ����");
		}
		
		
		System.out.println("\n===================================\n");
		
		try {
			ExMethod.dateMillSec("20220322");
		}catch(ParseException p) {
			System.out.println("��¥ ������ yyyy.MM.dd�� �����ּ���.");
		}catch(Exception e) {
			System.out.println("���� �𸣴� ����");
		}finally{
			// ���ܰ� �߻��ϵ� ���� ������ ��ɾ� �Է�
			// �Ϲ����� ��ɹ��� ��� finally�� ���� ������ ����
			// �ַ� try������ ���� ��ü�� close�Ҷ� �̿�
			System.out.println("������ �߻��ϴ� ���� �����");
		}
		
		
		
		
		
		
	}

}