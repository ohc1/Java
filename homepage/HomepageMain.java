package lec09_class.homepage;

import java.util.Scanner;

public class HomepageMain {
	public static void main(String[] args) {
		// �̱����� new�� �����ʴ´�.
		MemberDB memberDB = MemberDB.getInstance();
		BoardDB boardDB = BoardDB.getInstance();
		SessionStorage storage = new SessionStorage();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ൿ�� �������ּ���.");
			System.out.println("1. ȸ������ | 2. ȸ�������ȸ | 3. �α��� | 4. ���� ");
			System.out.print(">>> ");
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {	// ȸ������
				System.out.print("���̵� �Է����ּ���: ");
				String id = sc.nextLine();
				System.out.print("��й�ȣ�� �Է����ּ���: ");
				String pw = sc.nextLine();
				memberDB.addMember(new Member(id,pw));
				
			}else if(command == 2) {	// ȸ�������ȸ
				memberDB.showList();
			}else if(command == 3) {	// �α���
				System.out.print("���̵� �Է����ּ���: ");
				String id = sc.nextLine();
				System.out.print("��й�ȣ�� �Է����ּ���: ");
				String pw = sc.nextLine();
				
				if(memberDB.loginCheck(id, pw)) {
					// �� ��ȸ, �� ����, �α׾ƿ�
					storage.setLoginMember(new Member(id, pw));
					while(true) {
						boardDB.showList();
						System.out.println("�ൿ�� �Է����ּ���.");
						System.out.println("1. �۾��� | 2. ����ȸ | 3. �α׾ƿ�");
						System.out.print(">>> ");
						int select = Integer.parseInt(sc.nextLine());
						
						if(select == 1) {	// �۾���
							System.out.print("�� ������ �Է����ּ���: ");
							String title = sc.nextLine();
							System.out.print("�� ������ �Է����ּ���: ");
							String content = sc.nextLine();
							
							String author = storage.getLoginMember().getId();
							boardDB.addBoard(new Board(title, content, author));
							
						}else if(select == 2) {	// ����ȸ
							System.out.print("�� ��ȣ�� �Է����ּ���: ");
							int no = Integer.parseInt(sc.nextLine());
							
							boardDB.selectBoard(no); 
							
						}else if(select == 3) {	// �α׾ƿ�
							System.out.println("�α׾ƿ� �Ͽ����ϴ�.");
							storage.setLoginMember(null);
							break;
						}else {
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
				}
			}else if(command == 4) {	// ����
				System.out.println("�����Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			
		}
		
	}
}