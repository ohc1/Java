package lec08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListQuestion {
	
	static final int SONG_NAME = 1;
	static final int SINGER_NAME = 2;
	
	public static void main(String[] args) {
		
		// ���̸�Ʈ ���� ��� -> �迭0
		// ["�����", "��ǳ��", "TV", "��Ʈ��", "��Ź��", "������", "������"]
		
		// �Ƴ��� ��� ���� ���� -> �迭1
		// ["�����", "��Ź��", "������"]
		
		// ������ ��� ���� ���� -> �迭2
		// ["��Ʈ��", "TV", "������"]
		
		// ������ ��ϵ��� �迭�� ����� ��
		// ���� ��� ���� ���� ��� -> �迭3 (1,2 �� ������)
		// ��� ������ �� ��ٰ� �������� ���� ��� -> �迭4 (1,2�� ������)
		
		ArrayList<String> wipeList = new ArrayList<String>();
		wipeList.add("�����");
		wipeList.add("��Ź��");
		wipeList.add("������");
		
		ArrayList<String> husbandList = new ArrayList<String>();
		husbandList.add("��Ʈ��");
		husbandList.add("TV");
		husbandList.add("������");
		
		// ���� �Ű�����(�Ķ����) �޴� �޼ҵ�
		int maxVal = maxValue(1,5,23,31,40,22);
		System.out.println(maxVal);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(122);
		intList.add(551);
		intList.add(41);
		intList.add(11);
		intList.add(21);
		
		maxVal = maxValue(intList);
		System.out.println(maxVal);
		
		System.out.println("\n=========================\n");
		
		// ���� ��� ���� ���� ���
		ArrayList<String> wantBuy = new ArrayList<String>();
		for(int i = 0; i < wipeList.size(); i++) {
			if(husbandList.indexOf(wipeList.get(i)) != -1) {
				wantBuy.add(wipeList.get(i));
			}
		}
		System.out.println(wantBuy);
		
		// ������
		wantBuy = new ArrayList<String>();
		wantBuy.addAll(wipeList);
		wantBuy.retainAll(husbandList);
		System.out.println(wantBuy);
		
		// ���� ���
		ArrayList<String> allBuy = new ArrayList<String>();
		for(String wi : wipeList) {
			allBuy.add(wi);
		}
		for(String hu : husbandList) {
			if(allBuy.indexOf(hu) == -1) {
				allBuy.add(hu);
			}
		}
		System.out.println(allBuy);
		
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: �¿�", "����� �� ������: �ӿ���", "���߰��: ��θ���", "������ �����: ���̽�"
				, "��� ������: MSG���ʺ�", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "ȸ����: sokodomo", "��, ��: ����"
				, "SMILEY: YENA", "ȣ��������: ž��", "������: ���", "RUN2U: STAYC", "���� ���ݾ�: �̹���", "Counting Stars: ���", "��ȣ��: �̹���"
				, "����ó��: ��Ŵ", "�ؾ���: �ӿ���", "���� �� ������: ����", "HERO: �ӿ���", "Can't Control Myself: �¿�", "Next Level: aespa"
				, "strawberry moon: ������", "�ܿ���: ������", "�����: �ӿ���", "���: ������", "Bk Love: �ӿ���", "������ ���� �̺��� �����: ���̽�"
				, "Weekend: �¿�", "Savage: aespa", "Butter: ��ź�ҳ��", "Dynamite: ��ź�ҳ��", "OHAYO MY NIGHT: ����", "����ΰ� ��: ��θ���"
				, "���϶�: ������", "Celebrity: ������", "����: �ǵ�������", "Blueming: ������", "�Ѹ�: �극�̺�ɽ�", "���: ��θ���", "�׷� ��: �¿�"));
		
		System.out.println("������: " + playList.size());
		
		showList(playList);
		
		System.out.println("\n================== ���� ===================\n");
		
		Collections.sort(playList);
		showList(playList);
		
		System.out.println("\n================== �˻� ====================\n"); 
		

		ArrayList<String> search = searchSong("����",playList);
		showList(search);
		
		System.out.println("\n================== �뷡��/���� �˻� ====================\n");
		
		// �뷡�� �˻�
		search = searchSong(SONG_NAME,"ȣ��������",playList);
		showList(search);
		
		// ���� �˻�
		search = searchSong(SINGER_NAME,"����",playList);
		showList(search);
		
	} // main ��
	
	// Alt + Shift + R �ѹ��� �̸��ٲٱ�
	// �˻���(word)�� �Է� ������ �÷��̸���Ʈ���� 
	// �ش� �˻�� �����ϴ� �����͸� ���� ����Ʈ ����
	static ArrayList<String> searchSong(String word, ArrayList<String> inputList){
		ArrayList<String> searchList = new ArrayList<String>();
		
		for(int i = 0; i < inputList.size(); i++) {
			if(inputList.get(i).indexOf(word) != -1) {
				searchList.add(inputList.get(i)); 
			}
		}
		return searchList;
	}
	
	// �޼ҵ� �����ε�
	// type �� 1�� ������ �뷡��
	// type �� 2�� ������ ���� �˻�
	static ArrayList<String> searchSong(int type, String word, ArrayList<String> inputList){
		ArrayList<String> searchList = new ArrayList<String>();
		
		for(int i = 0; i < inputList.size(); i++) {
			String song = inputList.get(i).split(": ")[0];
			String singer = inputList.get(i).split(": ")[1];
			
			if(type == SONG_NAME) {
				if(song.indexOf(word) != -1) {
					searchList.add(inputList.get(i)); 
				}else {
					if(singer.indexOf(word) != -1) {
						searchList.add(inputList.get(i)); 
					}
				}
			}
			if(type == SINGER_NAME) {
				if(song.indexOf(word) != -1) {
					searchList.add(inputList.get(i)); 
				}else {
					if(singer.indexOf(word) != -1) {
						searchList.add(inputList.get(i)); 
					}
				}
			}
		}
		return searchList;
	}
	
	
	// �Ķ���ͷ� �Է� ���� ���ڿ� ����Ʈ��
	// ����¡ ó���ؼ� ������ִ� ��
	static void showList(ArrayList<String> inputList) {
		// �Խ��� ����¡ ����
		int totalCountGul = inputList.size();	// �Խ��ǿ� ���� �� size�� �ִ�.
		int showCountInOnePage = 10; // �� ���������� ������ ���� ��
		
		// �� �������� �� (42 / 10 = 4.2 �� �ø� -> 5)
		//	int countPage = (int)Math.ceil((double)totalCountGul / showCountInOnePage);
		double temp = ((double)totalCountGul / showCountInOnePage);
		int countPage = 0;
		if(temp > (totalCountGul/showCountInOnePage)) {
			countPage = (totalCountGul/showCountInOnePage) + 1;
		}else {
			countPage = totalCountGul/showCountInOnePage;
		}
		
		// ������ �������� �ִ� ���� �� (42 % 10 = 2)
		int countLastPageGul = totalCountGul % showCountInOnePage;
		
		// ����¡
		for(int i = 0; i < countPage; i++) {
			System.out.println("���� ������: " + (i+1));
			// playList�� �ε��� 0~41
			// i�� 0�϶�(������ 1), �ε��� 0~9
			// i�� 1�϶�(������ 2), �ε��� 10~19
			// i�� 2�϶�(������ 3), �ε��� 20~29
			// i�� 4�϶�(������ 5), �ε��� 40~49
			// 40~41 < 42
			int start = i * showCountInOnePage;
			int end = (i * showCountInOnePage) + showCountInOnePage;
			if(i == countPage - 1) {
				// 42
				end = (i * showCountInOnePage) + countLastPageGul;
				end = inputList.size();
			}
			for(int j = start; j < end; j++) {
				System.out.println((j+1) + ". " + inputList.get(j));
			}
			System.out.println("=======================\n");
		}
		
	}
	
	static int maxValue(int...num) {
		int maxVal = 0;
		for(int i = 0; i < num.length; i++) {
			if(maxVal < num[i]) {
				maxVal = num[i];
			}
		}
		return maxVal;
	}
	
	static int maxValue(ArrayList<Integer> num) {
		int maxVal = 0;
		for(int i = 0; i < num.size(); i++) {
			if(maxVal < num.get(i)) {
				maxVal = num.get(i);
			}
		}
		return maxVal;
	}
	
	
}