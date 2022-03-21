package submit03.submit_01;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		BoardDB db = BoardDB.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 2) {
				System.out.print("글 제목을 입력해주세요: ");
				String inputTitle = sc.nextLine();
				System.out.print("글 내용을 입력해주세요: ");
				String inputText = sc.nextLine();
				db.addContent(new Board(inputTitle, inputText));
			}else if(select == 1) {
				db.showList();
			}else if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			
		}
	}
}