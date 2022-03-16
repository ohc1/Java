package lec10_extends_interface.rpg;
// Ctrl + Space
public class Warrior extends Character{
	private Jobs job;
	
	public Warrior(String name, int damage, int hp, Jobs job) {
		// �θ� ������(super)�� �ڽ� ������ ���� ���� �־�� �Ѵ�.
		super(name, damage, hp);
		this.job = job;
	}
	
	// ���ݽ� �� ���� �������� �ְ� �ʹٸ� 
	@Override
	public void attack(Enemy enemy) {
		System.out.println(getName() + "��(��) " + enemy.getName() + "�� �����մϴ�.");
		enemy.setHp(enemy.getHp() - (super.getDamage()*2));
		super.setHp(super.getHp() - enemy.getDamage());
		if(enemy.getHp() <= 0) {
			enemy.die();
		}
		
		if(getHp() <= 0) {
			die();
		}
	}

	@Override
	public void skill(Enemy enemy) {
		switch(job) {
			case BERSERKER:
				System.out.println("�Ŀ� ��Ʈ����ũ");
				enemy.setHp(enemy.getHp() - 150);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
			case WARLORD:
				System.out.println("����Ʈ ĳ��");
				enemy.setHp(enemy.getHp() - 200);
				
				if(enemy.getHp() <= 0) {
					enemy.die();
				}
				break;
				
			default:
				System.out.println("������ �����ϴ�.");
				break;
		}
	}
	
	// enum Ŭ����
	// ������ Ŭ����
	// Constants ó�� ���
	
	// inner Ŭ����(Ŭ���� �ȿ��ִ� Ŭ����)
	enum Jobs{
		BERSERKER, 
		WARLORD
	}
	
}