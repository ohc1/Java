package lec08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {
		// ��(HashMap)�� ����
		HashMap<String, String> stuMap = new HashMap<String, String>();
		HashMap<String, Integer> stuMap2 = new HashMap<>();
		Map<Integer, String> stuMap3 = new HashMap<Integer, String>();
		
		// .put(Key, Value) �ʿ� ������ �߰�
		stuMap.put("ù°", "�տ���");
		stuMap.put("��°", "�տ���");
		stuMap.put("��°", "�տ�õ");
		System.out.println(stuMap);
		
		stuMap2.put("��Ʈ����", 7000);
		stuMap2.put("�Ｚ",5);
		System.out.println(stuMap2);
		
		stuMap3.put(0, "�ο�");
		stuMap3.put(32132, "����");
		System.out.println(stuMap3);
		
		stuMap.put("ù°","������");
		System.out.println(stuMap);
		
		System.out.println("\n=============================================\n");
		
		// .size()
		System.out.println(stuMap.size());
		
		// .containsKey()
		// �ش� �ʿ� Ű�� �����Ѵٸ� true ���� / ������ false ����
		System.out.println(stuMap.containsKey("��°"));  
		
		// .containsValue()
		// �ش� �ʿ� ���� �����Ѵٸ� true ���� / ������ false ����
		System.out.println(stuMap.containsValue("�տ���"));
		
		// .get(key)
		// Key�� �ش��ϴ� Value�� ����
		System.out.println(stuMap2.get("��Ʈ����")); 
		
		// .remove(Key)
		// Key�� �ش��ϴ� �����͸� ����
		stuMap.remove("ù°");
		System.out.println(stuMap);
		
		System.out.println("\n================================================\n");
		
		// Map ��ȸ
		// 1. KeySet �̿�
		Set<String> keySet = stuMap.keySet();
		
		// set���� ���� �� ���� for�� �̿�
		for(String key : keySet) {
			System.out.println(stuMap.get(key));
		}
		
		// 2. EntrySet �̿�
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value); 
		}
		
		// foreach + ���ٽ�
		stuMap.forEach((key, value) -> System.out.println(key + "=" + value)); 
		
		
		
		
	}
}
