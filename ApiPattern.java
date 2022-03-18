package lec11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// ����ǥ���� (Regular Expression)
		// Ư���� ��Ģ�� ���� ���ڿ��� ������ ǥ���ϱ� ���� ���� ����
		// ��ȭ��ȣ, �ֹε�Ϲ�ȣ, �̸��� ��� ���� ������ ���Ŀ�
		// ���� ����ǥ���� + Pattern�� �̿��Ͽ� ������ �� �ִ�.
		
		// ���ڸ� �����ϴ��� ����
		String regex = "[0-9]*";
		String example = "123432";
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		// ���� ���� �ι�°
		regex = "\\d*"; // == regex = "[0-9]"*
		example = "783413";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		System.out.println("\n==================================\n");
		
		// ���ĺ��� �����ϴ��� ����
		regex = "[a-zA-Z]*";
		example = "dwdaf dad";		// ���Ⱑ �־ �ȵ�.
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		// ���� ����
		regex = "[a-zA-Z ]*";	
		regex = "[a-zA-Z\\s]*"; 	// ������θ� ������ ��Ÿ���� \\s ����
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		System.out.println("\n==================================\n");
		
		// �ѱ۷θ� �����ϴ��� ����
		regex = "[��-�R]*";
		example = "������";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		System.out.println("\n===================================\n");
		
		
		// ��й�ȣ ����
		// ����� ���ڷθ� ����
		regex = "[a-zA-Z\\d]*";	// == regex = "\\w*";
		regex = "\\w*";
		example = "abc123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		// ����� ���� + Ư������(�ʼ� �ƴ�)
		regex = "[\\w!@#$%^&*)(-_+=]*";
		example = "nextit28850";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		// ����, ���� �ҹ��� �� �빮��, Ư�����ڰ� ���� 1�� �̻�(?=.*[])
		// ���ԵǸ�, ��й�ȣ �ڸ����� 8~20�ڸ�����.{8,20}
//		regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*)(-_=+]).{8,20}$";
		regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*\\W).{8,20}$";
		example = "nextIt1234#";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		// 6�ڸ� ���� ��й�ȣ �� 3�ڸ� �̻� �ݺ� ����
		regex = "^.*(\\d)\\1\\1.*$";
		example = "122234";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		regex = "[\\d]{6}";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		System.out.println("\n========================================\n");
		
		// �̸��� ���� Ȯ��
		regex = "^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-z]+$";		// ���ڿ�ǥ�� \\
		example = "adbad123@gmail.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		// ����ó ���� Ȯ��
		regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		example = "010-9133-4345";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " ��� = " + result);
		
		
		
		
	}	// main ����
}