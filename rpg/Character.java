package lec10_extends_interface.rpg;

public abstract class Character {
	private String name;
	private int damage;
	private int hp;
	
	public Battle battle;
	
	public Character(String name, int damage, int hp) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
	}
	
	// °ø°Ý
	public void attack(Enemy enemy) {
		enemy.setHp(enemy.getHp() - this.damage);
		this.hp -= enemy.getDamage();
		
		if(enemy.getHp() <= 0) {
			enemy.die();
		}
		
		if(this.hp <= 0) {
			die();
		}
		
	}
	
	// Á×À½
	public void die() {
		System.out.println(this.name + "ÀÌ(°¡) »ç¸ÁÇÏ¼Ì½À´Ï´Ù.");
		battle.outOfBattle();
	}
	
	public abstract void skill(Enemy enemy);

	@Override
	public String toString() {
		return "Character [name=" + name + ", damage=" + damage + ", hp=" + hp + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
}