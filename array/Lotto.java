package lec07_array;

public class Lotto {
	public static void main(String[] args) {
		// �ζ�
		// Math.random() : 0���� 1������ ���� �Ǽ��� ����
		// 0~  0.99999999999
		// �ζǴ� 1���� 45���� 6�ڸ��� ���� �迭
		
		// Math.random() * 10 �� �ϸ� 0 ~ 9.99 (int 0~9)
		// Math.random() * 100 �� �ϸ� 0 ~ 99.99 (int 0~99)
		// Math.random() * 45 �� �ϸ� 0 ~ 44.99 (int 0~44)
		
		int lottoNum = (int)((Math.random() * 45) + 1);
		System.out.println(lottoNum);
		
		
		int[] myLotto = new int[6];
//		myLotto[0] = �����ζǹ�ȣ
//		myLotto[1] = �����ζǹ�ȣ
//		myLotto[5] = �����ζǹ�ȣ
		
		// myLotto �� Math.random()�� �̿��ؼ�
		// �ζ� ��ȣ(1~45)�� �ߺ����� �ʰ� ����ּ���.
		
		 
		// i�� myLotto �迭�� ���̸� ���� ���� ������ �ݺ��մϴ�.
		// �ߺ��� ����ٸ� �ݺ� Ƚ���� �þ �� �ֽ��ϴ�.
		for(int i = 0; i < myLotto.length ; i++){
		    // 1. ������ �� ����
		    // Math.random()�� �����ϴ� 0.0~0.999...�� ���� 45�� ����
		    // 0.0~44.xx�� ���� ����� �̸� ������ �ٲ۴�.
		    // ���⿡ 1�� ���ؼ� 1~45�� �ǵ��� �Ѵ�.
			myLotto[i] = (int)(Math.random() * 45) + 1;
		 
		    // 2. �ߺ� �˻�
		    // �迭�� ���� ����(i ��������)��
		    // ��� ������ ���� ���� ���� ���� �ִٸ� i�� ������ �о�
		    // ���� �ݺ����� ���� ĭ�� �ٸ� ���� ������ �մϴ�.
		    for(int j = 0; j < i; j++){
		        if(myLotto[i] == myLotto[j]){
		            i--; // i�� ������ �δ�
		            break; // ���� ���� �˻��� �ʿ䰡 �����Ƿ� �ߺ��˻� �ݺ��� �����ϴ�.
		        }
		    }
		}
		 
		// 3. ����ϱ�
		System.out.println("����� ��ȣ�� �Ʒ��� �����ϴ�:");
		for(int i = 0; i < myLotto.length; i ++){
		    if(i > 0){
		        // �� ó�� ���Ұ� �ƴ϶�� �տ� ", "���ڿ� �߰�
		        // 1, 2, 3, ..., 6 �÷� ������ ��
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
		// winLotto �� lottoArr �� ���ؼ�
		// ��÷ ������ �����ϴ� �Լ��� ������ּ���.
		
		System.out.println(compareLotto(winLotto,lottoArr));
		
		long runTime = 0;
		while(true) {
			System.out.println(++runTime + "ȸ ����");
			if(compareLotto(winLotto, makeLotto())) {
				System.out.println("1�� ��÷!!!");
				System.out.println("���� Ƚ��" + runTime);
				System.out.println("���� �ݾ�: " + runTime * 1000);
				break;
			}
			
		}
		

	} // main ��
	
	// �� ���� �迭�� ���Ͽ� 6���� ���ٸ� true�� ����
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
		System.out.println(result + "�� ��ġ");  
		return(result == 6); 
	}
	
	
	// �ζ� ���� ���� �迭 ���� 
	public static int[] makeLotto() {
		// ������ ����Ű
		// [Alt + Shift + R] ������ �̸��� �ٲܶ�,
		//  ������ ���ǰ� �ִ� �κе���� �ѹ��� �ٲ� �� �ִ�.
		int[] myLotto = new int[6];
		int idx = 0;
		while(true) {
			int lotto =(int)(Math.random() * 45 + 1);
			boolean isEqual = false;
			
			// �ߺ�üũ
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
		
		// �ζǴ� ���ĵ� �ؾ��� (��������)
		
		// ���� �˰���
		// ���� ����
		for(int i = 0; i < myLotto.length; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < myLotto.length -1 - i; j++) {
				if(myLotto[j] > myLotto[j+1]) {
					// myLotto�� j�� j+1 �ڸ��ٲٱ�
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
