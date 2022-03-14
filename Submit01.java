package submit_0314;

import java.util.ArrayList;
import java.util.HashSet;

public class Submit01 {
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int a = (int)(Math.random() * 11) + 10;
			intList.add(a);
		}
		System.out.println(intList);
		
		HashSet<Integer> hashInt = new HashSet<Integer>(intList);
		
		System.out.println(hashInt);
		
		ArrayList<Integer> intList2 = new ArrayList<Integer>(hashInt);
		
		
		// 오름차순
		for(int i = 0; i < intList2.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j < intList2.size() -1 - i; j++) {
				if(intList2.get(j) > intList2.get(j+1)) {
					int temp = intList2.get(j);
					intList2.set(j, intList2.get(j+1));
					intList2.set(j+1, temp);
					swapped = true;
				}
			}
		}
		System.out.println(intList2);
		
		// 내림차순
		for(int i = 0; i < intList2.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j < intList2.size() -1 - i; j++) {
				if(intList2.get(j) < intList2.get(j+1)) {
					int temp = intList2.get(j);
					intList2.set(j, intList2.get(j+1));
					intList2.set(j+1, temp);
					swapped = true;
				}
			}
		}
		System.out.println(intList2);
	}
}