package lec08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;

public class CollectionList {
	public static void main(String[] args) {
		// ����Ʈ(ArrayList)�� ����
		// 1.
		ArrayList<String> students = new ArrayList<String>();
		String[] strArray = new String[4];
		
		// 2.
		ArrayList<String> students2 = new ArrayList<>();
		
		int[] intArray = new int[5];
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		// Wrapper class�� �⺻ Ÿ���� �����͸� ��ü�� ����ؾ�
		// �ϴ� ��� ����Ѵ�.
		// �⺻ Ÿ�� = ����, boolean
		int intVal = 12;
		
		// �ڽ�(boxing)
		// �⺻ Ÿ���� ������(12)�� ���� Ŭ������ �ν��Ͻ��� ��ȯ
		Integer num = new Integer(12);
		// ���� �ڽ�(auto boxing)
		Integer num2 = 12;
		
		// ��ڽ�(Unboxing)
		// ���� Ŭ������ �ν��Ͻ��� ����� ���� �⺻ Ÿ���� �����ͷ� ����
		int n = num.intValue();
		// ���� ��ڽ�
		int n2 = num;
		
		System.out.println("\n================================\n");
		
		// ArrayList�� �� ���
		students.add("�����");
		students.add("���Ȱ�");
		students.add("����");
		students.add("�տ���");
		
		// ���ʸ�<> Ÿ�԰� ��ġ�ϴ� �����͸� �߰� ����
//		students.add(1);
		
		System.out.println(students);
		
		System.out.println("\n================================\n");
		
		// .size()
		System.out.println(students.size());
		// ���� �ȳ����� size�� 0
		System.out.println(students2.size());
		
//		System.out.println(strArray.length);
		
		// .add() �� (�ε���, ��) �ֱ�
		students.add(1, "�ο�");
		System.out.println(students);
		
		// .set() �� (�ε���, ��) �ֱ�
		// �ش� ����Ʈ�� �ε��� ���� ����
		students.set(1, "����");
		System.out.println(students);
		
		// contains() ����Ʈ �ȿ� �ش� �����Ͱ� �����ϴ��� �˻�
		// true/false�� ��ȯ
		System.out.println(students.contains("����"));
		System.out.println(students.contains("�ο�"));
		
		// indexOf() ����Ʈ �ȿ� �ش� �����Ͱ� 
		// �����Ѵٸ� �ε��� ����, ���ٸ� -1 ����
		// -1 ���� ���η� contains ó�� ��� ����
		System.out.println(students.indexOf("�տ���"));
		System.out.println(students.indexOf("����"));
		
		// .get() �ش� �ε����� ����� �����͸� ����
		// ����Ʈ�� �ε��� 0���� ����
		System.out.println(students.get(3));
		
		// .isEmpty() ����Ʈ�� ����ִ��� true/false�� ����
		// .size() == 0 üũ�ϴ°Ͱ� �Ȱ���
		System.out.println(students.isEmpty());
		System.out.println(students2.isEmpty());
		System.out.println(students.size() == 0);
		
		
		// .remove() �ش� �ε����� �����͸� ����
		students.remove(1);
		System.out.println(students);
		students.remove("����");	// �ش� �����͸� ����
		System.out.println(students);
		students.remove("���̸�");	// �ش� �����Ͱ� ��� ������.
		
		// .clear() �ش� ����Ʈ�� ��� (size�� 0�� ��)
		students.clear();
		System.out.println(students);

		intVal = 10;
		students = new ArrayList<String>();
		System.out.println(students);
		
		students.add("����");
		students.add("����");
		students.add("���");
		students.add("�뼮");
		
		System.out.println("\n==========================\n");
		
		// for������ ����Ʈ ����
		for(int i = 0; i < students.size(); i++) {
			students.set(i, i + students.get(i));
		}
		System.out.println(students);
		
		System.out.println("\n========== ����Ʈ ���� ============\n");
		
		// �߸��� ���� ���
		ArrayList<String> copyList = students;
		System.out.println(copyList);
		copyList.set(0, "0����");
		System.out.println(students);
		
		// ���� ��� 1
		ArrayList<String> copyList2 = new ArrayList<String>();
		copyList2.addAll(students);
		System.out.println(copyList2);
		copyList2.set(0, "0ö��");
		System.out.println(students);
		
		// ���� ��� 2
		ArrayList<String> copyList3 = new ArrayList<String>(students);
		System.out.println(copyList3);
		
		// ���� ��� 3
		ArrayList<String> copyList4 = new ArrayList<String>();
		for(int i = 0; i < students.size(); i++) {
			copyList4.add(students.get(i));
		}
		System.out.println(copyList4);
		
		// ���� for��, foreach��
		for(String i : students) {
			System.out.println(i);
		}
		// �ε����� �����ϴ� ArrayList������ �� ������ ������ �ƴ�
		
		// Ȧ�� ��°�� copyList4�� ��ƾ� �Ѵٸ�?
		copyList4.clear();
		int idx = 0;
		for(String name : students) {
			if(idx % 2 == 1) {
				copyList4.add(name);
			}
			idx++;
		}
		System.out.println(copyList4);
		
		
		System.out.println("\n=========================\n");
		
		// forEach ��
		students.forEach(new Consumer<String>() {
			@Override
			public void accept(String name) {
				System.out.println(name);
			}
		});
		
		// ���ٽ�
		students.forEach(name -> System.out.println(name));
		students.forEach(name -> {
			System.out.println(name);
			System.out.println(name);
			System.out.println(name);
		});
		
		
		System.out.println("\n============== ���� ===============\n");
		
		// ���� �ָ鼭 ����Ʈ ����
		intList = new ArrayList<Integer>(Arrays.asList(
				30, 15, 20, 13, 11, 40, 22));
//		int[] intArr = {30, 15, 20, 13, 11, 40, 22};
		
		// ���� ����
		for(int i = 0; i < intList.size(); i++) {
			boolean swapped = false;
			
			for(int j = 0; j < intList.size() -1 - i; j++) {
				if(intList.get(j) > intList.get(j+1)) {
					int temp = intList.get(j);
//					intList[j] = intList[j+1];
					intList.set(j, intList.get(j+1));
//					intList[j+1] = temp;
					intList.set(j+1, temp);
					swapped = true;
				}
			}
			
			if(swapped == false) {
				System.out.println("�̹� ���� �Ϸ�");
				break;
			}
			
			System.out.println(i + "ȸ ����");
		}
		
		System.out.println(intList);
		
		intList = new ArrayList<Integer>(Arrays.asList(
				30, 15, 20, 13, 11, 40, 22));
		
		// �����Ǵ� �޼ҵ�� �ѹ濡 �ذ�
		Collections.sort(intList);
		System.out.println(intList); // ��������
		
		Collections.sort(intList, Collections.reverseOrder());
		System.out.println(intList); // ��������
		
		System.out.println("\n==============================\n");
		
		ArrayList<String> strList = new ArrayList<String>(
				Arrays.asList("C", "A", "B", "c", "a"));
		
		Collections.sort(strList);
		System.out.println(strList);
		
		Collections.sort(strList, Collections.reverseOrder());
		System.out.println(strList);
		
		// ��ҹ��� ���о��� ����
		Collections.sort(strList, String.CASE_INSENSITIVE_ORDER);
		System.out.println(strList);
		
		Collections.sort(strList, 
				Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
		System.out.println(strList);
		
		
	}
}