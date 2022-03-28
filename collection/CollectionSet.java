package lec08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		// ����(HashSet)�� ����
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<>();
		Set<String> stuSet3 = new HashSet<String>();		// ������
		
		// .add() ������ �߰�
		stuSet.add("���");
		stuSet.add("�ּ�");
		stuSet.add("����");
		
		System.out.println(stuSet);
		
		stuSet.add("���");
		// �ߺ��� add�ȵ�
		System.out.println(stuSet);
		
		// .contains() �ش� �����Ͱ� Set �ȿ� ������ true,
		// ������ false
		System.out.println(stuSet.contains("�ּ�"));
		
		// .size() Set�� �������� ������ ����
		System.out.println(stuSet.size());
		
		System.out.println("\n====================================\n");
		
		// Set ��ȸ
		// while�� ���
		Iterator<String> iterator = stuSet.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		for(int i = 0; i < 100; i++) {
			stuSet.add(i+"");
		}
		System.out.println("for�� ���� ����");
		// ���� for�� = foreach��
		for(String name : stuSet) {
			if(name.length() == 1) {
				System.out.println(name);
			}
			System.out.println(name);
		}
		
		// .foreach ���
		stuSet.forEach(name -> System.out.println(name));
		stuSet.forEach(name -> {
			System.out.println(name);
			System.out.println(name);
		});
		
		System.out.println("\n==================================\n"); 
		
		// Set�� ������ ���� ��찡 �ƴ϶�� �� ���� ������,
		// �׳��� Set�� ���ٸ� �ߺ��� ���� �ʴ� �Ӽ��� �̿��ϴ� ���
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			intList.add(i);			
		}
		for(int i = 4; i < 10; i++) {
			intList.add(i);
		}
		System.out.println(intList);
		
		// ArrayList���� HashSet���� ��ȯ
		HashSet<Integer> tempSet = new HashSet<Integer>();
		tempSet.addAll(intList);
		System.out.println(tempSet);
		
		// HashSet���� ArrayList�� ��ȯ
		intList.clear();
		intList = new ArrayList<Integer>();
		intList.addAll(tempSet);
		System.out.println(intList);
		
		
		
		
		
		
	} // main ����
}
