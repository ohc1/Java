package lec05_controll;

import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
		// while��
		
		int i = 1;			//�ʱ�ȭ��
		while(i <= 9) {	// ���ǽ�
			System.out.println("2 x " + i + " = " + (2*i));
			i++;			// ������
		}
		
		// for���� ��Ⱑ
		
		System.out.println("\n==================================\n");
		
		i = 2;
		// ������ for���� �������ô�
		for(; i<=9 ;) {	// ���ǽ�
			System.out.println("2 x " + i + " = " + (2*i));	// ���๮
			i++;			// ������
		}
		
		System.out.println("\n===================================\n");
		
		// level 1
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		
//		while(isRunning) {
//			System.out.print("�ֿܼ� ����� ���� �Է�[���� q�Ǵ� Q]: ");
//			
//			String inputText = sc.nextLine();
//			
//			if(inputText.equals("q") || inputText.equals("Q")) {
//				System.out.println("���α׷��� ����Ǿ����ϴ�.");
//				isRunning = false;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		
		// level 2
		
//		while(true) {
//			System.out.print("�ֿܼ� ����� ���� �Է�[���� q�Ǵ� Q]: ");
//			String inputText = sc.nextLine();
//			
//			// .toLowerCase() �ش� ���ĺ��� �ҹ��ڷ� �ٲ��ش�.
//			if(inputText.toLowerCase().equals("q")) {
//				System.out.println("���α׷��� ����Ǿ����ϴ�.");
//				break;
//			}else {
//				System.out.println(inputText);
//			}
//		}
		
		System.out.println("\n===================================\n");
		
		
		// do - while ��
//		isRunning = false;
//		do {
//			System.out.println("���α׷��� ���۵Ǿ����ϴ�.");
//		}while(isRunning);
//		
//		String inputString = "";
//		do {
//			System.out.print("�ֿܼ� ����� ���� �Է�[���� q�Ǵ� Q]: ");
//			inputString = sc.nextLine();
//			System.out.println(inputString);
//		}while(!inputString.toUpperCase().equals("Q"));
		
		System.out.println("\n====================================\n");
		
		// ����(����) while��
		// ������ 
		
		// 2 x 2 = 4
		// 2 x 3 = 6
		// 2 x 9 = 18
		// 3 x 2 = 6
		int intVal = 2;
		while(intVal <= 9) {
			int rightVal = 2;
			while(rightVal <= 9) {
				System.out.println(intVal + " x " + rightVal + " = " + (intVal*rightVal));
				rightVal ++;
			}
			intVal++;
			System.out.println();
		}
		
		
		System.out.println("\n=================================\n");
		

		
		// ���ϸ���
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("�߻��� �ܵ��⸦ �������ϴ�." + "�ൿ�� �������ּ���.");
			System.out.println("1. ���� | 2. ����");
			System.out.print(">> ");
			
			String inputText = scan.nextLine();
			
			if(inputText.equals("1")) {
				while(true) {
					System.out.println("���� �����?");
					System.out.println("1. �鸸��Ʈ | 2. ������ȭ | 3. ���"); 
					System.out.print(">> "); 
					
					String attack = scan.nextLine();
					if(attack.equals("1")) {
						System.out.println("��ī�� �鸸��Ʈ!!");
					}else if(attack.equals("2")) {
						System.out.println("��ī�� ������ȭ!!");
					}else if(attack.equals("3")) {
						break;	// ���� while���� ���̻� ������� ����
								// �ܺ� while���� ��� ����
					}else {
						System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					}
				}
			}else if(inputText.equals("2")){
				System.out.println("�ܵ��⸦ ���� �����ƽ��ϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		scan.close();		// ����ڷκ��� ���� �Է¹޴� Scanner ��ü�� �����Ѵ�.
		
		//	String inputText = scan.nextLine();
		//	scanner�� ���� ���� �Է� �������ϸ� ������ ����.
		//	��, �� �̻� �Է¹��� ���� ������ close()�� ���ش�.
		//	��� Scanner�� AutoCloseable�� �����ϰ� �ֱ� ������
		//	�ڵ����� close �ǰ� ������, ��������� close()�� ���ָ� ����.
		
		//	Ctrl + ���콺 Ŭ�� -> �ش� ������ ����� ��ġ��, �ش� Ŭ������ �ִ� ��ġ ����� ã�ư��ϴ�. 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
