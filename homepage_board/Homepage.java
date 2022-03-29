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
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			// 회원가입
			if(select == 1) {
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = sc.nextLine();
//				memService.insertMem(id, pw);
				
				Member mem = memService.getMem(id);
				
				if(mem.getId() != null) {
					System.out.println("중복된 아이디 입니다.");
				}else {
					int resultCnt = memService.insertMem(id, pw);
					if(resultCnt > 0) {
						System.out.println("회원가입 완료");
					}else {
						System.out.println("오류가 발생했습니다.");
					}
				}
				
			// 로그인
			}else if(select == 2) {
				System.out.print("아이디를 입력해주세요: ");
				String id = sc.nextLine();
				System.out.print("비밀번호를 입력해주세요: ");
				String pw = sc.nextLine();
				
				Member mem = memService.getMem(id);
				if(mem.getPw().equals(pw)) {
					System.out.println(mem.getId() + "님으로 접속했습니다.");
					
					while(true) {
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						select = Integer.parseInt(sc.nextLine());
						
						 
						if(select == 1) { // 글쓰기
							System.out.print("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용을 입력해주세요: ");
							String text = sc.nextLine();
							
							String author = mem.getId();
							boardService.insertBoard(title, author, text);
							
							ArrayList<Board> boardList = boardService.boardList();
							
							for(int i = 0; i < boardList.size(); i++) {
								System.out.println(boardList.get(i));
							}
						}else if(select == 2) { // 글조회
							System.out.print("글 번호를 입력해주세요: ");
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
							System.out.println("로그아웃했다");
							break;
						}else {
							System.out.println("잘못입력하셨습니다.");
						}
					}
					
				}
				
				
			}else if(select == 3) {
				System.out.println("종료하였습니다.");
				break;
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
}