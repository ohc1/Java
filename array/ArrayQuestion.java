package lec07_array;

public class ArrayQuestion {
	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		// intArr�� �ִ��� ������ּ���.
		// �翬�� for���� �̿��ؾ߰�����.
		
		int maxVal = intArr[0];
		for(int i = 1; i < intArr.length; i++) {
			if(maxVal < intArr[i]) {
				maxVal = intArr[i];
			}
		}
		System.out.println("�ִ�: " + maxVal);
		
		// �迭�� ��� �ڸ� �ٲٴ� �Լ�
		
		System.out.println("\n========================\n");
		
		// ��������
		// 1. �ش� �迭���� �ִ��� ã�� �ش� ��ġ�� ����
		// �迭�� ������ ���� swap �Ѵ�.
		// 2. �迭�� �������� ������ ������ ���� ��
		// �ִ��� ã�� �ش� ��ġ�� ���� �迭�� ������ �ι�°
		// ���� swap �Ѵ�.
		// 3. �� ������ �ݺ��ϸ� ������ �� �ɰ̴ϴ�.
		
		// @. �ִ��� �̿��ؼ� ���������� �غ�����.
		// �Ź� �ִ��� ã�Ƽ�, �� �տ������� �ٲ㰡�� �˴ϴ�.
		
		int[] intArray = {23, 456, 213, 32, 464, 1, 2, 4};
		// intArray �� length = 8
		// intArray �� ������ �ε��� = 7
		
		for(int i = 0; i < intArray.length-1; i++) {
			// �ִ� ���ϱ�
			int maxValue = intArray[0];
			int maxIdx = 0;
			for(int j = 1; j < intArray.length-i; j++) {
				if(maxValue < intArray[j]) {
					maxValue = intArray[j];
					maxIdx = j;
				}
			}
			
			// swap, �ִ��� maxValue�� �ε�����
			// �ٲ��ڸ��� �ε����ڸ�
			swap(intArray, maxIdx, intArray.length-1-i);		
		}
		System.out.println(intArray);
		ArrayStudy.printArray(intArray);
		
		
		// ��������
		for(int i = 0; i < intArray.length-1; i++) {
			// �ִ� ���ϱ�
			int maxVar = intArray[intArray.length-1];
			int maxIdex = intArray.length-1;
			for(int j = i; j < intArray.length-1; j++) {
				if(maxVar < intArray[j]) {
					maxVar = intArray[j];
					maxIdex = j;
				}
			}
			
			//swap
			swap(intArray, maxIdex, i);														
		}
		ArrayStudy.printArray(intArray);
		
		
		
	} // main ��

	/**
	 * �ش� intArray�� �ε��� idxA�� idxB�� ���� ��ȯ�Ѵ�.
	 * @param intArray ���� ��ȯ�� ���� �迭
	 * @param idxA ���� ��ȯ�� �ε��� ù��°
	 * @param idxB ���� ��ȯ�� �ε��� �ι�°
	 */
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
	}
	
	
}
