package submit03.submit_01;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		BoardDB db = BoardDB.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ൿ�� �������ּ���.");
			System.out.println("1. �� ��� | 2. �� ���� | 3. ����");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 2) {
				System.out.print("�� ������ �Է����ּ���: ");
				String inputTitle = sc.nextLine();
				System.out.print("�� ������ �Է����ּ���: ");
				String inputText = sc.nextLine();
				db.addContent(new Board(inputTitle, inputText));
			}else if(select == 1) {
				db.showList();
			}else if(select == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			
		}
	}
}