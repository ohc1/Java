package lec10_extends_interface.rpg;

public class Magician extends Character{
	private Jobs job;
	
	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}
	
//	@Override
//	public void attack(Enemy enemy) {
//		System.out.println(getName() + "이(가) " + enemy.getName() + "를 공격합니다.");
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
				System.out.println("파이어볼");
				enemy.setHp(enemy.getHp() - 200);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
			case ICE:
				System.out.println("아이스볼트");
				enemy.setHp(enemy.getHp() - 150);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
				
			default:
				System.out.println("직업이 없습니다.");
				break;
				
		}
	}

	
	enum Jobs{
		FIRE,
		ICE
	}
}