package lec08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import lec07_array.ArrayStudy;

public class CollectionQuestion {
	
	static HashMap<String, String> infoMap = new HashMap<>();
	
	public static void main(String[] args) {
		// �ߺ� ����
		// makeLotto �� ArrayList�� HashSet�� �̿��ؼ�
		// ��������.
		
		makeLotto();
		
		// ���� Set�� ���� �ʴ���, �ߺ� ���� ������
		// ArrayList�� ó���� �� �ֽ��ϴ�.
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);			
		}
		for(int i = 4; i < 10; i++) {
			intList.add(i);
		}
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i = 0; i < intList.size(); i++) {
			if(intArray.indexOf(intList.get(i)) == -1) {
				intArray.add(intList.get(i));
			}
		}
		System.out.println(intArray);
		
		System.out.println("\n=====================================\n");
		
		
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		// ����ڰ� ���̵�� ��й�ȣ�� �Ķ���ͷ� �־�����,
		// infoMap�� Key(���̵�)�� Value(��й�ȣ)�� ��ġ�ϴ���
		// ��ġ�ϸ� true / �ٸ��� false �� �����ϴ� �Լ���
		// ����� ������.
		
		System.out.println(loginCheck("a001", "dafaewfad"));
		System.out.println(loginCheck("a001", "1234a")); 
		
		
	}// main ����
	
	static boolean loginCheck(String id, String pw) {
//		if(pw.equals(infoMap.get(id))) {
//			return true;
//		}
//		return false;
		return pw.equals(infoMap.get(id));
	}
	
	static void makeLotto() {
		HashSet<Integer> tempSet = new HashSet<Integer>();
		while(tempSet.size() < 6) {
			int rand = (int)(Math.random() * 45) + 1;
			tempSet.add(rand);
		}
		
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		lottoList.addAll(tempSet);
		Collections.sort(lottoList);
		
		System.out.println(lottoList);
		
	}
	
}
