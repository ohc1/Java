package submit_0329;

import java.util.ArrayList;
import java.util.Scanner;

import submit_0329.dao.BoardDao;
import submit_0329.dao.MemberDao;
import submit_0329.model.Board;
import submit_0329.model.Member;
import submit_0329.service.BoardService;
import submit_0329.service.MemberService;

public class Homepage {
	public static void main(String[] args) {
		MemberService memService = MemberService.getInstance();
		BoardService boardService = BoardService.getInstance();
		MemberDao memDao = MemberDao.getInstance();
//		BoardDao boDao = BoardDao.getInstance();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ൿ�� �������ּ���.");
			System.out.println("1. ȸ������ | 2. �α��� | 3. ����");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			// ȸ������
			if(select == 1) {
				System.out.print("���̵� �Է����ּ���: ");
				String id = sc.nextLine();
				System.out.print("��й�ȣ�� �Է����ּ���: ");
				String pw = sc.nextLine();
//				memService.insertMem(id, pw);
				
				Member mem = memService.getMem(id);
				
				if(mem.getId() != null) {
					System.out.println("�ߺ��� ���̵� �Դϴ�.");
				}else {
					int resultCnt = memService.insertMem(id, pw);
					if(resultCnt > 0) {
						System.out.println("ȸ������ �Ϸ�");
					}else {
						System.out.println("������ �߻��߽��ϴ�.");
					}
				}
				
			// �α���
			}else if(select == 2) {
				System.out.print("���̵� �Է����ּ���: ");
				String id = sc.nextLine();
				System.out.print("��й�ȣ�� �Է����ּ���: ");
				String pw = sc.nextLine();
				
				Member mem = memService.getMem(id);
				if(mem.getPw().equals(pw)) {
					System.out.println(mem.getId() + "������ �����߽��ϴ�.");
					
					while(true) {
						System.out.println("1. �۾��� | 2. ����ȸ | 3. �α׾ƿ�");
						System.out.print(">>> ");
						select = Integer.parseInt(sc.nextLine());
						
						 
						if(select == 1) { // �۾���
							System.out.print("�� ������ �Է����ּ���: ");
							String title = sc.nextLine();
							System.out.print("�� ������ �Է����ּ���: ");
							String text = sc.nextLine();
							
							String author = mem.getId();
							boardService.insertBoard(title, author, text);
							
							ArrayList<Board> boardList = boardService.boardList();
							
							for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}
						}else if(select == 2) { // ����ȸ
							System.out.print("�� ��ȣ�� �Է����ּ���: ");
							int num = Integer.parseInt(sc.nextLine());
							
							ArrayList<Board> boardList = boardService.boardList();
							for(int i = 0; i < boardList.size(); i++) {
								if(boardList.get(i).getNo() == num) {
									boardService.showBoard(boardList.get(i).getTitle(), boardList.get(i).getAuthor(),boardList.get(i).getUpdate(),boardList.get(i).getText());
								}
							}
							for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}
							
						}else if(select == 3) {
							System.out.println("�α׾ƿ��ߴ�");
							break;
						}else {
							System.out.println("�߸��Է��ϼ̽��ϴ�.");
						}
					}
					
				}
				
				
			}else if(select == 3) {
				System.out.println("�����Ͽ����ϴ�.");
				break;
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
		
	}
}