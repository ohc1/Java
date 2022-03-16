package lec10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {
	public static void main(String[] args) {
		Warrior minwoo = new Warrior("�ο�", 100, 200, Warrior.Jobs.BERSERKER);
		Creep chanung = new Creep("����", 10, 300);
		
		minwoo.attack(chanung);
		System.out.println(chanung.getHp());
		
//		minwoo.skill(chanung);
		
		System.out.println("\n==============================\n");
		
		Magician jeonyoung = new Magician("����", 50, 150, Magician.Jobs.FIRE);
		
		
//		jeonyoung.skill(chanung);
		
		ArrayList<Character> party = new ArrayList<Character>();
		party.add(minwoo);
		party.add(jeonyoung);
		
		Creep creep = new Creep("���", 30, 200);
		Boss boss = new Boss("�����", 100, 1000);
		
		// ��� Ŭ�������� �⺻������ Object��� Ŭ������ 
		// ��ӹް� �ִ�. (�����Ǿ� extends�� ������ ����)
		
		// Warrior -> Character -> Object
		ArrayList<Object> battleGround = new ArrayList<Object>();
		battleGround.add(minwoo);
		battleGround.add(jeonyoung);
		battleGround.add(creep);
		battleGround.add(boss);
		
		for(int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i));
		}
		
		
//		System.out.println(battleGround.get(0).getClass());
		Object ob = battleGround.get(0);
		
		
		// �ݹ��Լ�
		minwoo.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(minwoo);
			}
		};
		
		jeonyoung.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(jeonyoung);
			}
		};
		
		creep.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(creep);
			}
		};
		
		boss.battle = new Battle() {
			@Override
			public void outOfBattle() {
				battleGround.remove(boss);
			}
		};
		
		jeonyoung.skill(creep);
		
		for(int i = 0; i < battleGround.size(); i++) {
			System.out.println(battleGround.get(i));
		}
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			for(int i = 0; i < battleGround.size(); i++) {
				// ������ battleGround.get(i) ��ҵ���
				// Object�� ����ȯ �� ����
				
				// instanceof �� Character���� üũ �Ŀ�
				// �ൿ�� �Է¹޴´�.
				if(battleGround.get(i) instanceof Character) {
					// �ش� ��ü�� Character�� ��ȯ
					Character player = (Character)battleGround.get(i);
					System.out.println(player.getName() + "�� ���Դϴ�. " + "�ൿ�� �������ּ���.");
					System.out.println("1. ���� | 2. ��ų ");
					System.out.print(">>> ");
					
					int select = Integer.parseInt(sc.nextLine());
					
					if(select == 1) {
						player.attack(boss);
					}else if(select == 2) {
						player.skill(boss);
					}
				}
			}
			
			if(!battleGround.contains(boss)) {
				System.out.println("�������� �¸��Ͽ����ϴ�.");
				break;
			}
			
			if(!battleGround.contains(minwoo) && !battleGround.contains(jeonyoung)) {
				System.out.println("�������� �й��Ͽ����ϴ�.");
				break;
			}
			
		}
		
		
		
		
		
	}// main ����
}