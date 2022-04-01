package lec05_controll;

public class LoopFor {
	public static void main(String[] args) {
		
		System.out.println("�ݺ��� ���� 3");
		System.out.println("�ݺ��� ���� 2");
		System.out.println("�ݺ��� ���� 1");
		System.out.println("�ݺ��� ����~!!");
		
		// �ݺ���
		// for��
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		/*
		 * ����� ���
		 * �ڵ���� ���� �κ��� ����Ŭ���ϸ� breakpoint(�ʷ���)��
		 * ����ϴ�. [����Ű Ctrl + shift + B]
		 * ��� �����̶� ����Ŭ�� Ȥ�� ����Ű�� ����/���� ����
		 * �ڵ带 ���� ���� �����غ���, ������ � ���� ������
		 * Ȯ���� ��, �ַ� ���
		 * ��� Run ��ư ���� ���� ����� ������ Ŭ���ϸ�(�������)
		 * ����� ��� ����
		 * ����� ��忡 ������ ȭ�� ��Ÿ��(Perspective)�� ��ȯ
		 * �ҰųĴ� �޽��� â�� ��ϴ�.
		 * �������Ͻø� ������尡 ����Ǿ� ���� �ڵ����
		 * ���������� ����Ǵٰ� breakpoint�� �ִ� ������ ���缭
		 * ��⸦ �մϴ�. 
		 * ���� ����� Run - step over [����Ű F6] �� �����ϸ�
		 * �������� ������ �˴ϴ�.
		 * ����� ��带 �����Ͻ÷��� Terminate [����Ű Ctrl + F2]
		 * ���� ���� ȭ������ ���ƿ����� ���� ����� Perspective
		 * ��ư���� Java�� Ŭ���Ͻø� �˴ϴ�.
		 */
		
		// �Ǽ��� Ctrl + Shift + F11 �� �ϸ� Coverage Ȱ��ȭ
		// �ڵ� �˻������� �ۼ��� �������� ���, �������� �������� ǥ��
		// ���� view ���� ��� Window - Show view �ȿ� �� ���������
		// ��������� ���̴� Ű�ŵ� �˴ϴ�.
		
		// 1���� 20���� ���ϱ�
		int num = 0;
		for(int i=1; i<=20; i++) {
			num += i;
		}
		System.out.println("1���� 20���� ���ϸ� " + num);
		
		System.out.println("1���� 20���� ���ϸ� " + (20*(20+1))/2);
		
		
		for(int i = 0; i < 10; i = i + 1) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i += 1) {
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i += 2) {
			System.out.println(i);
		}
		
		for(double j = 0; j < 2; j += 0.2) {
			System.out.println(j);
			// �Ǽ��� float�� double�� ������ ��Ȯ���� �����Ƿ�
			// ����õ�Ѵ�. 
		}
		
		// ������ 2��
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 9 = 18
		
		for(int i = 1; i <= 9; i++) {
			System.out.println("2 x " + i + " = " + (2*i));
		}
		
		// ���� Console â�� ����ٴҶ�,
		// �׷��� ���� ��� Perspective ��ư����
		// Java Perspective ��ư ���콺 ��Ŭ�� - Reset
		// Window - Perspective - Reset Perspective
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		System.out.println("\n=====================\n");
		
		// 1���� 10���� �� Ȧ���� ���
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}	// �� 10�� �����
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}	// �� 5�� ����� -> ���� ���� (���α׷� ���� �ӵ� ����)
		
		System.out.println("\n=======================\n");
		
		// �Ʒ��� 5�� ž�� for�� ����Ͽ� ������ּ���.
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		
		String star = "";
		for(int i = 0; i < 5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		System.out.println("\n=======================\n");
		
		// % ������ ���� �ַ� ����� ��
		// for�� ������ ��ȯ�ϴ� ���ڿ� ���� ���
		
		System.out.println("\n=========== ���ѱ� ============\n");
		
		// �������忡�� ���� 20cm �̰� �ִµ�,
		// 5cm���� �߶��ִ� ����
		for(int i = 0; i < 20; i++) {
			System.out.println("||||||||");
			
			// i�� 4, 9, 14 �϶� �߶����
			if((i == 4) || (i == 9) || (i == 14)) {
				System.out.println("--------");
			}
		}
		
		System.out.println("\n============ ��� ==============\n");
		
		// ��� ���忡�� ���� 30cm �̰� �ִµ�,
		// 6cm ���� �߶��־�� �Ѵ�.
		
		for(int i = 1; i <= 30; i++) {
			if(i % 2 == 1) {
				System.out.println("////////");
			}else {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			
			// i�� 6, 12, 18, 24 �� �߶�� �Ѵ�.
			// 6���� ����������, �������� 0�� �༮��
			if(i % 6 == 0) {
				System.out.println("--------");
			}
			
//			try {
//				Thread.sleep(300); // 1�� = 1000�и���
//				// ���� ���α׷��� ��������
//				// �����带 ��ȣ�� �ð�(����: �и���, ms)
//				// ��ŭ ��� ����ٰ� �����ݴϴ�.
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
		}
		
		System.out.println("\n============ �ð� =============\n");
		
		// 0�ø� �������� �� �ð����� �ð��� �ֿܼ� ����Ѵ�.
		// 100 �ð�
		for(int i = 0; i<100; i++) {
			System.out.println(i%24);
		}
		
		System.out.println("\n========= ���� �ð� ===========\n");
		
		// �ð��� �ƴ϶� ���ڵ� ��Ÿ���� �սô�.
		int currentDay = 18;
		int currentTime = 3;
		
		// 100 �ð���, ���� ��ð� �ɱ�?
		for(int i = 0; i < 100; i++) {	
			// �� for���� ���{} ���� ��ɹ��� 100�� ����Ų��.
			int day = currentDay + (currentTime/24);
			int time = currentTime%24;
			System.out.println(day + "�� " + time + "��");
			currentTime++;
		}
		
		// % ������ ������ ��� �� ��~!!
		
		System.out.println("\n=========== �����ڵ� Ž�� =============\n");
		
		// �����ڵ忡�� �ѱ� ����('��' = 44032)����
		// ���� 10���� ����غ��ô�.
		
		char charNum = 44032;
		for(int i = 0; i < 10; i++) {
			System.out.println((i+1) + ". " + charNum);
			charNum++;
		}
		
		System.out.println("\n========== �Ųٷ� for�� ===========\n");
		
		// 10���� 1���� ���
		int hiNum = 10;
		for(int i = 0; i < 10; i++) {
			System.out.println(hiNum);
			hiNum--;
		}
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("\n======================\n");
		
		star = "*****";
		for(int i=0; i<5; i++) {
			System.out.println(star);
			star = star.replaceFirst("\\*", "");
			// *, ?, + �� ���ڷ� ��� ������ �ȳ���.
			// ���ڷ� ������ Ư����ȣ �տ� \\�� ���δ�.
			// regex�� ����ǥ����(Regular Expression)�� �ǹ��Ѵ�.
			// ����ǥ���� ��� ����) ȸ�������� �� ��
			// �̸��� ���� �־����� Ȯ���ϰ� ���!!
			// ����ó�� ���ڸ� �־����� Ȯ��
			// ���̵� ����� ���ڸ� �־����� Ȯ��
			// ��й�ȣ ���� (���� ��ҹ���, ����, Ư����ȣ ���� 1�� �̻�)
		}
		
		System.out.println("\n========== for������ String ������ ��� ============\n");
		
		// ���� ���ڿ��� �� �ڸ����� ���ؼ� ���
		
		String example = "3928459324";
		int result = 0;
		for(int i = 0; i < example.length(); i++) {
//			String strNum = example.substring(i, i+1);
//			int intNum = Integer.parseInt(strNum);
//			result += intNum;
			
			result += Integer.parseInt(example.substring(i, i+1));
		}
		System.out.println("�� �ڸ����� ���� ����� " + result);
		
		
		System.out.println("\n=========== '��'�� � ============\n");
		String sususu = "��������������,.!! ������";
		int countSu = 0;
		for(int i = 0; i < sususu.length(); i++) {
			String strNum = sususu.substring(i, i+1);
			if(strNum.equals("��")) {
				countSu = countSu + 1;
			}
		}
		System.out.println("���� ������ " + countSu);
		
		System.out.println("\n========================\n");
		
		countSu = 0;
		for(int i = 0; i < sususu.length(); i++) {
			String strNum = sususu.substring(i, i+1);
			if(strNum.equals("��")) {
				countSu = countSu + 1;
			}
		}
		System.out.println();
		System.out.println("���� ������ " + countSu);
		
		System.out.println("\n============ break �� ==============\n");
		
		// i�� 0���� 10���� �����ϴ� for������
		// i�� 5���� Ŀ���ԵǸ� �ش� for���� ����
		for(int i = 0; i <= 10; i++) {
			if(i > 5) {
				break;
			}
			System.out.println(i);
		}
		
		// 1���� n���� ���Ѵٰ� ������, 100 �̻��� �Ǵ� n��
		// ���غ��ô�.
		
		int sumNum = 0;
		for(int i = 1; i < 1000; i++) {
			sumNum += i;
			System.out.println(sumNum);
			
			if(sumNum >= 100) {
				System.out.println("100 �̻��� �Ǵ� n�� "
						+ i + "�Դϴ�.");
				break;
			}
		}
		
		System.out.println("\n========== continue �� ============\n");
		
		// ������ 7��
		// �ʹ� ���� 2,3,4 �� �׳� ��� ���ҷ���.
		for(int i = 1; i <= 9; i++) {
			if(i < 5) {
				continue;
			}
			
			System.out.println("7 x " + i + " = " + (7*i));
		}
		
		// ��κ��� ��� ���� continue ���� ���� �ʴ´�.
		for(int i = 1; i <= 9; i++) {
			if(i > 4) {
				System.out.println("7 x " + i + " = " + (7*i));
			}
		}
		
		
		System.out.println("\n============= ������ =============\n");
		
		// 2 x 1 = 2
		// 2 x 2 = 4
		// 2 x 9 = 18
		// 3 x 1 = 3
		// 3 x 2 = 6
		// 3 x 9 = 27
		
		// ���� for�� (���� for��)
		for(int i = 2; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println();
		}
		
		System.out.println("\n=========================\n");
		
		// Ʈ�� �����
		//      *
		//     **
		//    ***
		//   ****
		//  *****
		
		star = "";
		for(int i = 0; i < 5; i++) {
			String blank = "";
			for(int j = 0; j < 5-i; j++) {
				blank += " ";
				// i�� 0�϶�, star�� * 1���� �ǰ�,
				// blank�� ���� 5���� �Ǿ� �Ѵ�.
				// i�� 1�϶�, star�� * 2���� �ǰ�,
				// blank�� ���� 4���� �Ǿ� �Ѵ�.
				// i�� 2�϶�, star�� * 3���� �ǰ�,
				// blank�� ���� 3���� �Ǿ� �Ѵ�.
			}
			star += "*";
			System.out.println(blank + star);
		}
		
		
		
	}
}
