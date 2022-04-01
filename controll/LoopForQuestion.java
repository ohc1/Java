package lec05_controll;

public class LoopForQuestion {
	public static void main(String[] args) {
		// �Ųٷ� Ʈ���� 5�� ����� �ּ���
		// *****
		// ****
		// ***
		// **
		// *
		String star = "*****";
		for(int i = 5; i > 0; i--) {
			String subStar = star.substring(0, i);
			System.out.println(subStar);
		}
		
		// �Ųٷ� ������ 2�� ������ּ���.
		// 2 x 9 = 18
		// 2 x 8 = 16
		// 2 x 2 = 4
		for(int i = 9; i > 1; i--) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		System.out.println("\n=============================\n");
		
		// ������ ã�ƶ�!!
		String findWally = "�����︮�ϸ��︮�︮�ϸ�����";
		System.out.println(findWally.length());
		
		// ������ � ����ִ��� �ֿܼ� ������ּ���.
		int countWally = 0;
		for(int i = 0; i < findWally.length()-1; i++) {
			// i�� 0���� 12���� �����Ѵ�.
			String subWally = findWally.substring(i, i+2);
			// errMsg: String index out of range
			// substring �Լ��� ���� �߶� ������ ���̰� 
			// ��� ���
			if(subWally.equals("����")) {
				countWally += 1;
			}
		}
		System.out.println("������ �� " + countWally);
		
		
		System.out.println("\n=======================\n");
		
		
		star = "*";
		String blank = "";
		for(int i=0; i<5; i++) {
			if(i>0) {
				star += "**";
			}
			blank ="";
			for(int j=1; j<5-i; j++) {
				blank += " ";
			}
			System.out.println(i + ":" + blank + star);
		}
		
		
		// ũ���������� ������ �� ���̴��� Ʈ���� �Ųٷ� ���̳׿�
		// �Ųٷ� Ʈ���� ������ּ���
		
		System.out.println("\n================================\n");
		
		blank ="";
		for(int i=0; i<5; i++) {
			if(i>0) {
				blank += " ";
			}
			star ="*";
			for(int j=0; j<4-i; j++) {
				star +="**";
			}
			System.out.println(i + ":" + blank + star);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
