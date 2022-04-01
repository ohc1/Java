package lec05_controll;

public class Conditional {
	public static void main(String[] args) {
		// ���ǹ�
		
		// if��
		int intVar = 3;
		if(intVar > 0) {
			System.out.println("intVar�� 0���� Ů�ϴ�.");
		}
		
		if(intVar > 0) {System.out.println("intVar�� 0���� Ů�ϴ�.");}
		
		// ���{}�� ��ɾ �����̸� ����� �����ص� ���������� �۵�
		if(intVar > 0) System.out.println("intVar�� 0���� Ů�ϴ�.");
		
		System.out.println("\n=============================\n");
		
		intVar = 0;
		if(intVar < 0) {
			System.out.println("intVar�� 0���� �۽��ϴ�.");
		}else {
			System.out.println("intVar�� 0���� ũ�ų� �����ϴ�.");
		}
		
		if(intVar < 0) {
			System.out.println("intVar�� 0���� �۽��ϴ�.");
		}else if(intVar == 0) {
			System.out.println("intVar�� 0�Դϴ�.");
		}else {
			System.out.println("intVar�� 0���� Ů�ϴ�.");
		}
		
		// �� ���������� ����ڰ� �α����� �ϸ� 
		// �ش� �������� ���� ���丮���� ������ ������ �Ǵµ�,
		// �� ������ �̿��ؼ� �α��� �� ȭ�� Ȥ��
		// �α������� ���� ȭ���� �����ݴϴ�.
		
		// jsp ���� ���ǿ��� ������ �����´�.
		String loginId = "akow283";	
		
		if(loginId != null) {
			System.out.println("�α��� ������ ȭ���� �����ش�.");
		}else {
			System.out.println("�α��� ȭ������ �̵������ش�.");
		}
		
		// �������� ���� ��ư�� ��� ��ư �ϳ���
		// on/off�� �� �����մϴ�.
		// �ش� ��ư �̺�Ʈ�ȿ� ������ ���¸� üũ�ϴ� ����� �ִ�
		
		boolean isPowerOn = false;
		
		// ���� ��ư�� ���������� ����
		if(isPowerOn) { // isPowerOn �� true�� TV�� �����ִ�.
			System.out.println("TV�� ���ϴ�.");
			isPowerOn = false;
		}else {
			System.out.println("TV�� �մϴ�.");
			isPowerOn = true;
		}
		
		if(isPowerOn) {
			System.out.println("TV�� ���ϴ�.");
			isPowerOn = !isPowerOn;
		}else {
			System.out.println("TV�� �մϴ�.");
			isPowerOn = !isPowerOn;
		}
		
		// boolean�� true/false �� ����ġ�� on/off ó�� ����ϴ� 
		// boolean ������ ���(toggle) Ȥ�� �÷���(flag)��� �մϴ�.
		
		System.out.println("\n================================\n");
		
		// �ֹι�ȣ ���ڸ��� ù��° ���ڷ� ����ã��
		String hisIdBack = "1367423";
		int idNumFirst = Integer.parseInt(hisIdBack.substring(0,1));
		
		if(idNumFirst % 2 == 0) { // ¦��
			System.out.println("�����Դϴ�.");
		}else { // Ȧ��
			System.out.println("�����Դϴ�.");
		}
		
		
		// ���� ���� ������
		int score = 85;
		String grade = "";
		// score�� 90������ ũ�� grade�� A,
		// 80������ ũ�� grade�� B, �������� C
		if(score > 90) {
			grade = "A";
		}else if(score > 80) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println(grade + "��� �Դϴ�.");  
		
		
		// ������ �����ؾ� �ϴ� ���
		score = 92;
		if(score > 80) {
			grade = "B";
		}else if(score > 90) {
			grade = "A";
		}else {
			grade = "C";
		}
		System.out.println(grade + "��� �Դϴ�.");
		
		// ��Ȯ�� �ϰų�, ������ �� �������ּ���.
		if(score > 80 && score <= 90) {	// 80 < score <= 90
			grade = "B";
		}else if(score > 90) {
			grade = "A";
		}else {
			grade = "C";
		}
		System.out.println(grade + "��� �Դϴ�.");  
		
		
		// ����ڰ� ȸ�������� �� ��, 
		// �Է� ������ ���� Ȯ���� ��
		// ȸ������ ��ư�� Ȱ��ȭ ��Ų��.
		String name = "";
		String phone = "";
		String age = "";	// 14�� �̻��̾�� �Ѵ�.
		
		// level 1
		if(name.length() > 0) {	// isNotEmpty �� ����
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					System.out.println("ȸ������ ��ư Ȱ��ȭ");
				}else {
					System.out.println("ȸ������ �Ұ�");
				}
			}else {
				System.out.println("ȸ������ �Ұ�");
			}
		}else {
			System.out.println("ȸ������ �Ұ�");   
		}
		
		// level 2
		boolean isGood = false;
		if(name.length()>0) {
			if(phone.length() == 11 || phone.length() == 10) {
				if(Integer.parseInt(age) >= 14) {
					isGood = true;
				}
			}
		}
		if(isGood) {
			System.out.println("ȸ������ ��ư Ȱ��ȭ");
		}else {
			System.out.println("ȸ������ �Ұ�");
		}
		
		// level 3
		if((name.length()>0) && (phone.length() == 11 || phone.length() == 10) && (Integer.parseInt(age) >= 14)) {
			System.out.println("ȸ������ ��ư Ȱ��ȭ");
		}else {
			System.out.println("ȸ������ �Ұ�");
		}
		
		System.out.println("\n====================\n");
		
		// ���� ��Ī�ϴ� ��찡 ���� ��,
		
		int month = 0;	// �����е��� �����Ⱓ(����: ��)
		if(month == 0) {
			System.out.println("������ ���� �ֽ��ϴ�.");
		}else if(month == 1) {
			System.out.println("����Ŭ DB ������~");
		}else if(month == 2) {
			System.out.println("�ڹ� ������~");
		}else if(month == 3) {
			System.out.println("�ڹٽ�ũ��Ʈ ������");
		}else if(month == 4) {
			System.out.println("JSP ������~");
		}else if(month == 5) {
			System.out.println("��������Ʈ �սô�~");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		
		// switch��
		// switch()��ȣ �ȿ��� char, int, String, Ÿ���� ������ ������ �����ϴ�.
		
		month = 3;
		switch(month) {
			case 0:
				System.out.println("������ ���� �ֽ��ϴ�.");
				break;
			case 1:
				System.out.println("����Ŭ DB ������");
				break;
			case 2:
				System.out.println("�ڹ� ������");
				break;
			case 3:
				System.out.println("�ڹٽ�ũ��Ʈ ������");
				break;
			case 4:
				System.out.println("JSP ������");
				break;
			case 5:
				System.out.println("��������Ʈ");
				break;
			default:
				System.out.println("�����Դϴ�.");
		}
		
		
		
		
		
	
		
		
		
	}
}
