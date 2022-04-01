package lec05_controll;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Elevator {
	public static void main(String[] args) {
		// ���������Ͱ� �� �� �ִ� �������� ���������� ��ư��
		// ��������, �� ���� ���������Ͱ� �̵��ϴ� ���α׷� ����
		
		// 1. ������� ���� ��ġ�� Scanner�� �Է��ϸ� ������� ��ġ�� �� ����� ���������Ͱ� �̵��Ѵ�.
		// 2. ������� ��ġ�� �� ������������ ��ġ ���̰� �����ϴٸ� �� �� �� ���� ���������Ͱ� �����´�.
		// 3. ����ڰ� �Է��� ��ġ�� ������������ ��ġ�� �ٲ��ش�.
		// 4. ���������� ���α׷��� �����Ϸ��� q, Q, exit, EXIT, Exit �� �Է�
		
		// �ʹ� ���ٸ�
		// @. ����ڰ� ���������Ϳ� ž���ϰ� ���� �Է��ϸ�, ž�� ���� ���������Ͱ� �ش� ������ �̵��ϵ��� ������
		// @. ����ڰ� ���ڰ� �ƴ� �ٸ� ���� �Է�������, "�߸� �Է��ϼ̽��ϴ�." ��� �� �ٽ� �Է��� �� �ְ� �����
		
		int elevatorA = 10;	// ���������� A�� ��ġ
		int elevatorB = 4;	// ���������� B�� ��ġ
//		boolean boolVar = true;
		Scanner sc = new Scanner(System.in);
		
		// ������ ���������Ͱ� A�� 1, B�� 2 
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		int activeElevator = 0;
		
//		while(boolVar) {
//			System.out.println("");
//			System.out.println("============== �񿵺��� ���������� ==============");
//			System.out.println("�°��� A�� ���� ��ġ:" + elevatorA);
//			System.out.println("�°��� B�� ���� ��ġ:" + elevatorB);
//			System.out.print("������ ��ó���?[�����Ͻ÷��� q �Ǵ� exit �Է�]: ");
//			
//			String inputFloor = sc.nextLine();
//			if(inputFloor == null || inputFloor == "") {
//				inputFloor = "1";
//			}
//			int floorVal = Integer.parseInt(inputFloor);
//			
//			if(inputFloor.equals("q") || inputFloor.equals("Q") || inputFloor.equals("exit") || inputFloor.equals("EXIT") || inputFloor.equals("Exit")) {
//				System.out.println("���α׷��� ����Ǿ����ϴ�.");
//				boolVar = false;
//			}else { 
//				if(Math.abs(elevatorA-floorVal) < Math.abs(elevatorB-floorVal)){
//					System.out.println(floorVal+"������ ���������͸� ȣ���մϴ�.");
//					System.out.println("�°��� B�� "+floorVal+"���� �̵��Ͽ����ϴ�.");
//				}else {
//					System.out.println(floorVal+"������ ���������͸� ȣ���մϴ�.");
//					System.out.println("�°��� A�� "+floorVal+"���� �̵��Ͽ����ϴ�.");
//				}
//				boolVar = true;
//			}
//		}
		
		while(true) {
			System.out.println("\n===================== �񿵺��� ���������� =======================\n");
			System.out.println("�°��� A�� ���� ��ġ: " + elevatorA);
			System.out.println("�°��� B�� ���� ��ġ: " + elevatorB);
			System.out.print("������ ��ó���?[�����Ϸ��� q �Ǵ� exit �Է�] : ");
			
			String inputText = sc.nextLine();
			
			// ���Ḧ �Է��ߴ��� Ȯ���ϰ� �����Ŵ
			if(inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit")) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
			// ���ڸ� �Է��ߴ��� Ȯ��
			// regex
			// ����Ű [Ctrl + H] �ٲ��� (�˻�)
			String regex = "^[0-9]+$";	// ���ڿ��� ����(^)�� ��($) ���̿� ����[0-9]�� �� �� �̻�(+) �����ϴ��� üũ�ϱ� ���� ����ǥ����
			
			// inputText �� ���ڷ� �̷���� ���ڿ��̸� isNum�� true
			boolean isNum = Pattern.matches(regex, inputText);
			if(!isNum) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}
			
			// ����ڰ� �Է��� ������ int�� ��ȯ
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "������ ���������� ȣ��");
			
			// ������� ��ġ�� �� ���������� ������ ���� ���
			int diffFloorA = (custFloor > elevatorA) ? (custFloor - elevatorA) : (elevatorA-custFloor);
			int diffFloorB = Math.abs(custFloor - elevatorB);
			
			// ��ġ ���̿� ���� ���������� �̵�
			if(diffFloorA > diffFloorB) {
				System.out.println("�°��� B�� " + custFloor + "������ �̵��Ͽ����ϴ�.");
				elevatorB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			}else if(diffFloorA < diffFloorB) {
				System.out.println("�°��� A�� " + custFloor + "������ �̵��Ͽ����ϴ�.");
				elevatorA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			}else {
				if(elevatorA > elevatorB) {
					System.out.println("�°��� A�� " + custFloor + "������ �̵��Ͽ����ϴ�.");
					elevatorA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				}else {
					System.out.println("�°��� B�� " + custFloor + "������ �̵��Ͽ����ϴ�.");
					elevatorB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			}
			
			while(true) {
				System.out.print("��� ������ �̵��Ͻðڽ��ϱ�? : ");
				inputText = sc.nextLine();
				
				isNum = Pattern.matches(regex, inputText);
				if(!isNum) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					continue;
				}
				
				int goToFloor = Integer.parseInt(inputText);
				
				if(activeElevator == ACTIVE_ELEVATOR_A) {
					System.out.println("�°��� A�� " + goToFloor + "������ �̵��Ͽ����ϴ�.");
					elevatorA = goToFloor;
				}else if(activeElevator == ACTIVE_ELEVATOR_B) {
					System.out.println("�°��� B�� " + goToFloor + "������ �̵��Ͽ����ϴ�.");
					elevatorB = goToFloor;
				}
				break;
				
			}
			
			
			

			
			
			
			
		}
	}
}
