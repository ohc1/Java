package lec07_array;

public class Lotto {
	public static void main(String[] args) {
		// 로또
		// Math.random() : 0부터 1사이의 랜덤 실수를 생성
		// 0~  0.99999999999
		// 로또는 1부터 45까지 6자리의 숫자 배열
		
		// Math.random() * 10 을 하면 0 ~ 9.99 (int 0~9)
		// Math.random() * 100 을 하면 0 ~ 99.99 (int 0~99)
		// Math.random() * 45 을 하면 0 ~ 44.99 (int 0~44)
		
		int lottoNum = (int)((Math.random() * 45) + 1);
		System.out.println(lottoNum);
		
		
		int[] myLotto = new int[6];
//		myLotto[0] = 랜덤로또번호
//		myLotto[1] = 랜덤로또번호
//		myLotto[5] = 랜덤로또번호
		
		// myLotto 에 Math.random()을 이용해서
		// 로또 번호(1~45)를 중복되지 않게 담아주세요.
		
		 
		// i가 myLotto 배열의 길이를 넘지 않을 때까지 반복합니다.
		// 중복이 생긴다면 반복 횟수가 늘어날 수 있습니다.
		for(int i = 0; i < myLotto.length ; i++){
		    // 1. 임의의 수 삽입
		    // Math.random()이 제공하는 0.0~0.999...의 수에 45를 곱해
		    // 0.0~44.xx의 수를 만들고 이를 정수로 바꾼다.
		    // 여기에 1을 더해서 1~45가 되도록 한다.
			myLotto[i] = (int)(Math.random() * 45) + 1;
		 
		    // 2. 중복 검사
		    // 배열의 기존 원소(i 이전까지)를
		    // 방금 삽입한 수와 비교해 같은 수가 있다면 i를 앞으로 밀어
		    // 다음 반복에서 같은 칸에 다른 수를 쓰도록 합니다.
		    for(int j = 0; j < i; j++){
		        if(myLotto[i] == myLotto[j]){
		            i--; // i를 앞으로 민다
		            break; // 다음 것을 검색할 필요가 없으므로 중복검사 반복을 나갑니다.
		        }
		    }
		}
		 
		// 3. 출력하기
		System.out.println("행운의 번호는 아래와 같습니다:");
		for(int i = 0; i < myLotto.length; i ++){
		    if(i > 0){
		        // 맨 처음 원소가 아니라면 앞에 ", "문자열 추가
		        // 1, 2, 3, ..., 6 꼴로 나오게 함
		        System.out.print(", ");
		    }
		    System.out.print(myLotto[i]);
		}

		System.out.println("\n==============================\n"); 
		
//		for(int i = 0; i < myLotto.length; i++) {
//			myLotto[i] = (int)((Math.random() * 45) + 1);
//			
//			for(int j = 0; j < i; j++) {
//				if(myLotto[i] == myLotto[j])
//					i--;
//			}
//		}
//		ArrayStudy.printArray(myLotto);
		
		int[] winLotto = {1, 4, 29, 39, 43, 45};
		
		int[] lottoArr = makeLotto();
		
		ArrayStudy.printArray(winLotto);
		ArrayStudy.printArray(lottoArr);
		
		System.out.println("\n=========================\n");
		// winLotto 와 lottoArr 을 비교해서
		// 당첨 갯수를 리턴하는 함수를 만들어주세요.
		
		System.out.println(compareLotto(winLotto,lottoArr));
		
		long runTime = 0;
		while(true) {
			System.out.println(++runTime + "회 실행");
			if(compareLotto(winLotto, makeLotto())) {
				System.out.println("1등 당첨!!!");
				System.out.println("구매 횟수" + runTime);
				System.out.println("구매 금액: " + runTime * 1000);
				break;
			}
			
		}
		

	} // main 끝
	
	// 두 숫자 배열을 비교하여 6개가 같다면 true를 리턴
	public static boolean compareLotto(int[] winArr, int[] myArr) {
//		int result = 0;
//		for(int i = 0; i < winArr.length; i++) {
//			if(winArr[i] == myArr[i]) {
//				result += 1;
//			}
//		}		
//		return result;
		int result = 0;
		for(int i = 0; i < winArr.length; i++) {
			if(winArr[i] == myArr[i]) {
				result += 1;
			}
		}
//		if(result == 6) {
//			return true;
//		}
//		return false;
		System.out.println(result + "개 일치");  
		return(result == 6); 
	}
	
	
	// 로또 만들어서 숫자 배열 리턴 
	public static int[] makeLotto() {
		// 유용한 단축키
		// [Alt + Shift + R] 변수의 이름을 바꿀때,
		//  변수가 사용되고 있는 부분들까지 한번에 바꿀 수 있다.
		int[] myLotto = new int[6];
		int idx = 0;
		while(true) {
			int lotto =(int)(Math.random() * 45 + 1);
			boolean isEqual = false;
			
			// 중복체크
			for(int i = 0; i < myLotto.length; i++) {
				if(lotto == myLotto[i]) {
					isEqual = true;
				}
			}			
			if(isEqual == false) {
				myLotto[idx] = lotto;
				idx++;
				
				if(idx > 5) {
					break;
				}
			}
			
		}
		ArrayStudy.printArray(myLotto);
		
		// 로또는 정렬도 해야함 (오름차순)
		
		// 정렬 알고리즘
		// 버블 정렬
		for(int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < myLotto.length -1 - i; j++) {
				if(myLotto[j] > myLotto[j+1]) {
					// myLotto의 j와 j+1 자리바꾸기
					myLotto[j] = myLotto[j] + myLotto[j+1];
					myLotto[j+1] = myLotto[j] - myLotto[j+1];
					myLotto[j] = myLotto[j] - myLotto[j+1];					
					swapped = true;
				}
			}
			
			if(swapped == false) {
				break;
			}
			
		}
		
//		ArrayStudy.printArray(myLotto);
		return myLotto;
		
	}
	
	
	
	
	
}
