package lec05_controll;

import java.util.Scanner;

public class LoopFinalTest {
	public static void main(String[] args) {
		// �����ð�
		
		// ���丮�� �ٵ� ����Ͻó���?
		// ���б�ȣ�� 4! �� 4 ���丮���� �ǹ��ϸ�,
		// �� ���� 4x3x2x1 = 24 �Դϴ�.
		
		// for���� ����ؼ� 10���丮���� ���� ������ּ���.
		
		// @ 15 ���丮���� ���� ������ּ���.
	
		
		long result = 1;
		for(int i=1; i<=15; i++) {
			// 1x2x3x4x5x6x7x8x9x10
			 result = result * i;
			 
			 System.out.println(result);
		}
		
		
		System.out.println("\n=============== �귿 �̺�Ʈ =================\n");  
		
		// �귿�� ���� ������ ���ȴ���
		// 5834���� ���ư��ٰ� �մϴ�.
		// �ѹ��� �翬�� 360�� ����?
		
		// �׷��ٸ� �귿�� ���߰� ������ ���� ��ǰ��
		// ���� ����� ���ֽð�, �� ����� ���ư������� ������ּ���.
		// 0�� �ʰ� ~ 60�� ����: ����
		// 60�� �ʰ� ~ 120�� ����: ���ݸ�
		// 120�� �ʰ� ~ 180�� ����: ��Ű
		// 180�� �ʰ� ~ 240�� ����: �ݶ�
		// 240�� �ʰ� ~ 300�� ����: ���̽�ũ��
		// 300�� �ʰ� ~ 360(0)�� ����: Ŀ�� 
		
		//	System.out.println(���� + "����");
		//	System.out.println("��ǰ: ");
		
		int abc = 5834 / 360;
		int efg = 5834 % 360;
		System.out.println(abc + "����");
		
		if(efg>0 && efg<=60) {
			System.out.println("��ǰ: " + efg + "��" + " ����");
		}else if(efg>60 && efg<=120) {
			System.out.println("��ǰ: " + efg + "��" + " ���ݸ�");
		}else if(efg>120 && efg<=180) {
			System.out.println("��ǰ: " + efg + "��" + " ��Ű");
		}else if(efg>180 && efg<=240) {
			System.out.println("��ǰ: " + efg + "��" + " �ݶ�");
		}else if(efg>240 && efg<=300) {
			System.out.println("��ǰ: " + efg + "��" + " ���̽�ũ��");
		}else{
			System.out.println("��ǰ: " + efg + "��" + " Ŀ��");
		}
		
		
		System.out.println("\n================ �βٲ� =================\n");
		
		// ����ڰ� �Է��� ���ڿ��� ������ ����� ����غ�����.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�Ųٷ� ������ ���ڿ� �Է�: ");
//		String inputText = sc.nextLine();
//		
//		// charAt �� �̿��� ���
////		for(int i = inputText.length()-1; i >= 0; i--) {
////			System.out.print(inputText.charAt(i));	
////		}
//		// ���ڿ� hello���� charAt(0) �� h ����
//
//		// substring �� �̿��� ���
//		String reverse = "";
//		for(int i = inputText.length(); i > 0; i--) {
//			reverse += inputText.substring(i-1,i);
//		}
//		System.out.println("�βٲ�: " + reverse);
//		
//		sc.close();
		
		// �ڵ� ������ ��ƴٸ�??
		// ����Ű [Ctrl + Shift + F] !!
		
		
		System.out.println("\n==================== 2�� �޷� ======================\n");  
		
		// 2�� �޷��� ����غ��ô�.
		// ȭ���Ͽ� 1�� ��ŸƮ
		// startDay �� ������ �������� 
		// �Ͽ��� 0, ������ 1, ȭ���� 2, ������ 3, ����� 4, �ݿ��� 5, ����� 6
		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				if(currentDay < 10) {
					System.out.print(" ");
				}
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			// i�� 6, 13, 20, 27 �� ��쿡 �ٹٲ�
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		System.out.println("\n===================== 6�� �޷� ========================\n");
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for(int i = 0; i < 42; i++) {
			if(i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 6) {
				System.out.println("");
			}
			if(currentDay < 10) {
				System.out.print(" ");
			}
			
		}
		
		
		
//		System.out.println(6 % 7);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
