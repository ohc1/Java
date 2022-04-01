package lec05_controll;

public class LoopWhileQuestion {
	public static void main(String[] args) {
		// while문이랑 for문이랑 표현만 좀 다르고 결국 같은 반복문입니다.
		
		// 그렇다면 크리스마스 트리를 while문으로 출력해주세요.
		
		String star = "*";
		String blank = "";
		
		int i = 0;
		while(i < 5) {
			if(i > 0) {
				star += "**";
			}
			blank = "";
			int j = 1;
			while(j<5-i) {
				blank += " ";
				j++;
			}
			System.out.println(i + ":" + blank + star); 
			i++;
		}
				
//        int i = 0;
//        while(i<10){
//            int j = 0;
//            int k = 0;
//            while(j<10-i){
//                System.out.print(" ");
//                j++;
//            }
//            while(k<(2*i)+1){
//                System.out.print("*");
//                k++;
//            }
//            ++i;
//            System.out.println("");
//        }
		
		
		
		
	}
}
