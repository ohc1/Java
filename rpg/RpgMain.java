package lec10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {
	public static void main(String[] args) {
		Warrior minwoo = new Warrior("민우", 100, 200, Warrior.Jobs.BERSERKER);
		Creep chanung = new Creep("찬웅", 10, 300);
		
		minwoo.attack(chanung);
		System.out.println(chanung.getHp());
		
//		minwoo.skill(chanung);
		
		System.out.println("\n==============================\n");
		
		Magician jeonyoung = new Magician("전영", 50, 150, Magician.Jobs.FIRE);
		
		
//		jeonyoung.skill(chanung);
		
		ArrayList<Character> party = new ArrayList<Character>();
		party.add(minwoo);
		party.add(jeonyoung);
		
		Creep creep = new Creep("잡몹", 30, 200);
		Boss boss = new Boss("데블몬", 100, 1000);
		
		// 모든 클래스들은 기본적으로 Object라는 클래스를 
		// 상속받고 있다. (생략되어 extends에 보이지 않음)
		
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
		
		
		// 콜백함수
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
				// 각각의 battleGround.get(i) 요소들은
				// Object로 형변환 된 상태
				
				// instanceof 로 Character인지 체크 후에
				// 행동을 입력받는다.
				if(battleGround.get(i) instanceof Character) {
					// 해당 객체를 Character로 변환
					Character player = (Character)battleGround.get(i);
					System.out.println(player.getName() + "의 턴입니다. " + "행동을 선택해주세요.");
					System.out.println("1. 공격 | 2. 스킬 ");
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
				System.out.println("전투에서 승리하였습니다.");
				break;
			}
			
			if(!battleGround.contains(minwoo) && !battleGround.contains(jeonyoung)) {
				System.out.println("전투에서 패배하였습니다.");
				break;
			}
			
		}
		
		
		
		
		
	}// main 종료
}