package lec10_extends_interface.starcraft;

import java.util.ArrayList;

public class StarCraftMain {
	public static void main(String[] args) {
		Zealot zealot = new Zealot();
		
		System.out.println(zealot.toString());
		
		HighTemplar highTemplar = new HighTemplar();
		
		System.out.println(highTemplar.toString());
		
		highTemplar.psionicStorm();
		
		Zealot zealot2 = new Zealot();
		Zealot zealot3 = new Zealot();
		Zealot zealot4 = new Zealot();
		Zealot zealot5 = new Zealot();
		Zealot zealot6 = new Zealot();
		Zealot zealot7 = new Zealot();
		
		// ������ �巡�׷� ����
		ArrayList<Zealot> zealotList = new ArrayList<Zealot>();
		zealotList.add(zealot);
		zealotList.add(zealot2);
		zealotList.add(zealot3);
		zealotList.add(zealot4);
		zealotList.add(zealot5);
		zealotList.add(zealot6);
		zealotList.add(zealot7);
		
		// ���õ� ������ �̵� ��� ������
		for(int i = 0; i < zealotList.size(); i++) {
			zealotList.get(i).move(20, 30);
		}
		
//		zealot.add(highTemplar);
		
		// ������
		// �ϳ��� ��ü�� ���� ���� Ÿ���� ���� �� �ִ� ��
		// �θ� Ŭ���� Ÿ���� ���� ������(ProtossUnit, StarUnit)
		// �ڽ� Ŭ���� Ÿ���� �ν��Ͻ�(zealot ��ü)�� ���� �� �� �ִ� ��
		
		// �ڽ� ��ü���� �θ� ��ü�� ����ȯ�� �����մϴ�.
		ProtossUnit protossUnit = zealot;	// �ڵ� ����ȯ
//		long longVal = 343135;	// �ڵ� ����ȯ
		ProtossUnit proUnit = (ProtossUnit)zealot;	// ���� ����ȯ
		
		// �ڽ� ��ü���� ���θ� ��ü�� ����ȯ�� �����մϴ�.
		StarUnit starUnit = zealot;
		
		// �巡�� ����
		ArrayList<StarUnit> starList = new ArrayList<StarUnit>();
		
		starList.add(zealot);
		starList.add(zealot2);
		starList.add(zealot3);
		starList.add(zealot4);
		starList.add(zealot5);
		starList.add(zealot6);
		starList.add(zealot7);
		starList.add(highTemplar);
		
		for(int i = 0; i < starList.size(); i++) {
			starList.get(i).move(5, 15); 
		}
		
//		HighTemplar ht = starList.get(7);
		StarUnit su = starList.get(7);
		System.out.println(starList.get(7).getName());
		
		((HighTemplar)su).psionicStorm();
		
		
		StarUnit puma = new StarUnit("ǻ��", 0, 40, 0, 0, 0, 0);
		
		// �Ϲ������� �θ� ��ü�� �ڽ� ��ü�� ����ȯ �� �� �����ϴ�.
		// instanceof > true, false�� �� ����
		System.out.println(puma instanceof ProtossUnit);
		System.out.println(puma instanceof Zealot);
		
		// �ڽ� ��ü�� �θ� ��ü�� ����ȯ�� �����ϴ�.
		System.out.println(highTemplar instanceof ProtossUnit);
		System.out.println(highTemplar instanceof StarUnit);
		
		// �θ� ��ü�� ����ȯ �Ǿ��� �ڽ� ��ü�� �ٽ� �ڽ� ��ü�� ����ȯ�� �����ϴ�.
		System.out.println(starUnit instanceof Zealot);
		System.out.println(starUnit instanceof HighTemplar);
		
		for(int i = 0; i < starList.size(); i++) {
			// �������÷����� üũ �� ���̿��� ���� �޼ҵ� ����
//			if(starList.get(i).getName().equals("�������÷�")) {
//				((HighTemplar)starList.get(i)).psionicStorm();
//			}
			if(starList.get(i) instanceof HighTemplar) {
				((HighTemplar)starList.get(i)).psionicStorm();
			}
		}
		
		SiegeTank siege = new SiegeTank();
		System.out.println(siege.toString());
		siege.siegeMode();
		
		
		
	} // main ����
}