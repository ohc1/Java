package lec10_extends_interface.rpg;

public class Magician extends Character{
	private Jobs job;
	
	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}
	
//	@Override
//	public void attack(Enemy enemy) {
//		System.out.println(getName() + "��(��) " + enemy.getName() + "�� �����մϴ�.");
//		enemy.setHp(enemy.getHp() - super.getDamage());
//		super.setHp(super.getHp() - enemy.getDamage());
//		if(enemy.getHp() <= 0) {
//			enemy.die();
//		}
//		
//		if(getHp() <= 0) {
//			die();
//		}
//	}

	@Override
	public void skill(Enemy enemy) {
		switch(job) {
			case FIRE:
				System.out.println("���̾");
				enemy.setHp(enemy.getHp() - 200);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
			case ICE:
				System.out.println("���̽���Ʈ");
				enemy.setHp(enemy.getHp() - 150);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
				
			default:
				System.out.println("������ �����ϴ�.");
				break;
				
		}
	}

	
	enum Jobs{
		FIRE,
		ICE
	}
}