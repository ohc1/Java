package lec07_array;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayStudy {
	public static void main(String[] args) {
		// �迭 (Array)
		
		String student1 = "�����";
		String student2 = "����";
		String student3 = "�տ���";
		String student4 = "���Ȱ�";
		
		System.out.println("������ �����ι� " + student1 
				+ student2 + student3 + student4);
		
		System.out.println("\n============ ���� �迭 ==============\n");
		
		// �迭�� ����1
		String[] students = new String[4];
		// String Ÿ���� ������ 4�� ���� �� �ִ� students �迭 ����
		
		// �迭 .length �� �ϸ� �ش� �迭�� ũ�⸦ �����Ѵ�.
		System.out.println("�迭 ũ��: " + students.length);
		
		// �迭�� �� Ȯ��, �ε��� ���
		System.out.println(students[0]);
		
		// 0���� array.length �̸����� ��ȸ�ϸ� �迭��
		// ��� ��ҿ� ������ �����ϴ�.
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i] + ", ");
		}
		
		System.out.println("\n============= ���� �迭 ==============\n");
		int[] intArray = new int[6];
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
		
		// ������ Ÿ���� ��� ���� ���� ������ 0
		// ������ Ÿ���� ��� ���� ���� ������ null
		
		System.out.println("\n============ �迭�� �� �ֱ� =============\n");
		
		students[0] = "�����";
		students[1] = "����";
		students[2] = "�տ���";
		students[3] = "���Ȱ�";
		
		System.out.println(students[0] + ", " + students[2]);
		
		// �迭�� ����
		// ũ�Ⱑ ������ (�־� ���� �־�!!!!!!!!!!!!!!!!!!!!)
//		students[4] = "ũ����";
		// ������ ������ ������ ������, ������ ���غ���
		// ��Ŭ������ ĳġ
		// �������� ��� �߻��ϴ� ������ ��Ÿ�� ����
//		System.out.println(students[4]);
		
		
		// �迭 ���(element) ��ȸ�ϴ� �Լ�
		printArray(students);
		
		int intVal = 12;
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = intVal;
			intVal *= 2;
		}
		
		printArray(intArray);
		
		System.out.println("\n======================\n");
		
		// �迭�� ���� 2
		String[] strArray = {"�����", "����", "�տ���", "���Ȱ�"};
		// �����, ����, �տ���, ���Ȱ��� ���� ������
		// ũ�� 4�� ���ڿ� �迭 ����
		
//		strArray[4] = "ũ����";
		printArray(strArray);
		
		System.out.println("\n========== ���ڿ� ������ ==========\n");
		
		String myInfo = "������, 010-7398-7332, akow283@gmail.com";
		// .split() ��ȣ�� ���ڿ��� �������� �ش� ���ڿ��� ���ڿ� �迭�� ������.
		String[] infoArray = myInfo.split(",");
		System.out.println(infoArray.length);
		System.out.println(infoArray[0]);	// �̸�
		System.out.println(infoArray[1]);	// ����ó
		System.out.println(infoArray[2]);	// �̸���
		printArray(infoArray);
		
		String calStr = "1+4+2";
		String[] calArray = calStr.split("\\+");
		printArray(calArray);
		
		System.out.println("\n========== �迭�� ���� ============\n");
		
		int intValA = 10;
		int intValB = intValA;
		
		intValB = 5;
		System.out.println("A : " + intValA);
		System.out.println("B : " + intValB);
		
		String[] copyArray = strArray;
		printArray(copyArray);
		System.out.println(strArray);
		System.out.println(copyArray);
		System.out.println(strArray.hashCode());
		System.out.println(copyArray.hashCode());
		
		// �ؽ��ڵ�??
		// ��ü�� �޸� �ּҰ��� �̿��Ͽ� �ؽ��� ������ �ڵ�
		// �ؽ���?
		// �ؽ��Լ�(��ȣȭ �˰���)�� �̿��Ͽ� �����͸�
		// ��ȣȭ�ϴ� ��� (RSA, )
		
		copyArray[2] = "�տ���";
		printArray(strArray);
		printArray(copyArray);
		
		// ��ȣȭ, ��ȣȭ
		// ��ȣȭ
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4";
		byte[] passByte = password.getBytes();
		String encryption = new String(base64Encoder.encode(passByte));
		
		System.out.println("��ȣȭ�� ��й�ȣ: " + encryption);
		
		// ��ȣȭ
		Decoder base64Decoder = Base64.getDecoder();
		String decryption 
			= new String(base64Decoder.decode(encryption));
		System.out.println("��ȣȭ�� ��й�ȣ: " + decryption);
		
		
		System.out.println("\n=======================\n");
		
		// �ùٸ� �迭 ����
		String[] copyArray2 = strArray.clone();
		printArray(copyArray2);
		
		System.out.println(strArray.hashCode());
		System.out.println(copyArray2.hashCode());
		
		copyArray2[1] = "ũ����";
		printArray(strArray);
		printArray(copyArray2);
		
		// clone�� ��Ծ����.
		String[] sameStrArray = new String[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			sameStrArray[i] = strArray[i];
		}
		printArray(sameStrArray);
		
		
		System.out.println("\n============= ���� �迭 =============\n");
		
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		// �ڸ� �ٲٱ�
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		printArray(intArr);
		
		System.out.println("\n=========== ���� ===========\n");
		
		// ���� �˰���
		// ���� ����
		for(int i = 0; i < intArr.length; i++) {
			boolean swapped = false;
			
			for(int j = 0; j < intArr.length -1 - i; j++) {
				if(intArr[j] > intArr[j+1]) {
					temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false) {
				System.out.println("�̹� ���� �Ϸ�");
				break;
			}
			
			System.out.println(i + "ȸ ����");
			printArray(intArr);
		}
//		printArray(intArr);
		
		System.out.println("\n=======================================\n");
		
		int[][] doubleArr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] tempArr = doubleArr[0];
		printArray(tempArr);
		
		tempArr = doubleArr[1];
		printArray(tempArr);
		
		System.out.println(tempArr[0]);
		System.out.println(doubleArr[1][0]);
		System.out.println(doubleArr[2][1]); 
		
		int[][][] tripleArr = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
		System.out.println(tripleArr[1][2][0]);
		
		
	}	// main ��
	
	// �迭 ��� ��� �Լ�
	public static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			if(i == strArray.length - 1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");
			}
		}
	}
	
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length - 1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");
			}
		}
	}
	
	
}
