package lec05_controll;

public class LoopWhileQuestion {
	public static void main(String[] args) {
		// while���̶� for���̶� ǥ���� �� �ٸ��� �ᱹ ���� �ݺ����Դϴ�.
		
		// �׷��ٸ� ũ�������� Ʈ���� while������ ������ּ���.
		
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
