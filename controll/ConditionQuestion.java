package lec05_controll;

import java.util.Scanner;

public class ConditionQuestion {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("이름을 입력해주세요 >> ");
//		String name = sc.nextLine();
//		System.out.print("연락처를 \"-\" 없이 입력해주세요 >> ");
//		String phone = sc.nextLine();
//		System.out.print("나이를 입력해주세요 >> ");
//		String age = sc.nextLine();
//		
//		if((name.length()>0) && (phone.length() == 11 || phone.length() == 10) && (Integer.parseInt(age) >= 14)) {
//			System.out.println("회원가입 버튼 활성화");
//		}else {
//			System.out.println("회원가입 불가");
//		}
		
		
		// 사용자로부터 국어, 영어, 수학 점수를 각각
		// 입력받아서 평균점수를 구하고, 등급을 출력해주세요.
		// 평균점수가 90점 이상이면 A, 80점 이상이면 B,
		// 70점이상은 C, 나머지 D
		
		// 사용자로부터 입력받을 점수들
		// 점수들을 int로 변환하여 세 과목을 더하고 나누기 3
		// if문을 사용해서 등급을 출력
		
//		String kor = "";
//		String eng = "";
//		String math = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수: ");
		String kor = sc.nextLine();
		System.out.print("영어 점수: ");
		String eng = sc.nextLine();
		System.out.print("수학 점수: ");
		String math = sc.nextLine();
		
		int resultKor = Integer.parseInt(kor);
		int resultEng = Integer.parseInt(eng);
		int resultMath = Integer.parseInt(math);
		
		double result = (resultKor+resultEng+resultMath) / 3.0;
		
		System.out.println("평균"+result+"입니다.");
		
		int resultInt = (int) Math.round(result);
		System.out.println("반올림한 값: " +resultInt);
		
		if(resultInt >= 90) {
			System.out.println("A등급 입니다.");
		}else if(resultInt >= 80) {
			System.out.println("B등급 입니다.");
		}else if(resultInt >= 70) {
			System.out.println("C등급 입니다.");
		}else {
			System.out.println("D등급 입니다.");
		}
		
		
		
		
		
		
	}
}
