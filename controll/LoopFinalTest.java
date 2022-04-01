package lec05_controll;

import java.util.Scanner;

public class LoopFinalTest {
	public static void main(String[] args) {
		// 복습시간
		
		// 팩토리얼 다들 기억하시나요?
		// 수학기호로 4! 는 4 팩토리얼을 의미하며,
		// 그 값은 4x3x2x1 = 24 입니다.
		
		// for문을 사용해서 10팩토리얼의 값을 출력해주세요.
		
		// @ 15 팩토리얼의 값을 출력해주세요.
	
		
		long result = 1;
		for(int i=1; i<=15; i++) {
			// 1x2x3x4x5x6x7x8x9x10
			 result = result * i;
			 
			 System.out.println(result);
		}
		
		
		System.out.println("\n=============== 룰렛 이벤트 =================\n");  
		
		// 룰렛을 아주 힘차게 돌렸더니
		// 5834도가 돌아갓다고 합니다.
		// 한바퀴 당연히 360도 겠죠?
		
		// 그렇다면 룰렛이 멈추고난 각도에 따른 경품이
		// 뭔지 출력을 해주시고, 총 몇바퀴 돌아갔는지도 출력해주세요.
		// 0도 초과 ~ 60도 이하: 사탕
		// 60도 초과 ~ 120도 이하: 초콜릿
		// 120도 초과 ~ 180도 이하: 쿠키
		// 180도 초과 ~ 240도 이하: 콜라
		// 240도 초과 ~ 300도 이하: 아이스크림
		// 300도 초과 ~ 360(0)도 이하: 커피 
		
		//	System.out.println(변수 + "바퀴");
		//	System.out.println("경품: ");
		
		int abc = 5834 / 360;
		int efg = 5834 % 360;
		System.out.println(abc + "바퀴");
		
		if(efg>0 && efg<=60) {
			System.out.println("경품: " + efg + "도" + " 사탕");
		}else if(efg>60 && efg<=120) {
			System.out.println("경품: " + efg + "도" + " 초콜릿");
		}else if(efg>120 && efg<=180) {
			System.out.println("경품: " + efg + "도" + " 쿠키");
		}else if(efg>180 && efg<=240) {
			System.out.println("경품: " + efg + "도" + " 콜라");
		}else if(efg>240 && efg<=300) {
			System.out.println("경품: " + efg + "도" + " 아이스크림");
		}else{
			System.out.println("경품: " + efg + "도" + " 커피");
		}
		
		
		System.out.println("\n================ 로꾸꺼 =================\n");
		
		// 사용자가 입력한 문자열의 순서를 뒤집어서 출력해보세요.
//		Scanner sc = new Scanner(System.in);
//		System.out.print("거꾸로 뒤집을 문자열 입력: ");
//		String inputText = sc.nextLine();
//		
//		// charAt 을 이용한 방법
////		for(int i = inputText.length()-1; i >= 0; i--) {
////			System.out.print(inputText.charAt(i));	
////		}
//		// 문자열 hello에서 charAt(0) 은 h 시작
//
//		// substring 을 이용한 방법
//		String reverse = "";
//		for(int i = inputText.length(); i > 0; i--) {
//			reverse += inputText.substring(i-1,i);
//		}
//		System.out.println("로꾸꺼: " + reverse);
//		
//		sc.close();
		
		// 코드 정렬이 어렵다면??
		// 단축키 [Ctrl + Shift + F] !!
		
		
		System.out.println("\n==================== 2월 달력 ======================\n");  
		
		// 2월 달력을 출력해봅시다.
		// 화요일에 1일 스타트
		// startDay 는 요일을 기준으로 
		// 일요일 0, 월요일 1, 화요일 2, 수요일 3, 목요일 4, 금요일 5, 토요일 6
		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
			// i가 6, 13, 20, 27 인 경우에 줄바꿈
			if(i % 7 == 6) {
				System.out.println();
			}
		}
		
		System.out.println("\n===================== 6월 달력 ========================\n");
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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
