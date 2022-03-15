package lec10_extends_interface.starcraft;

public class HighTemplar extends ProtossUnit{
	private int mp = 225;
	
	public HighTemplar() {
		super("�������÷�", 0, 40, 0, 0, 50, 150, 40);
	}
	
	public void psionicStorm() {
		System.out.println("���̿��� ���� ����!!");
		this.mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("�ҷ�ó��̼� ����!!");
		this.mp -= 100;
	}

	@Override
	public String toString() {
		return "HighTemplar [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + ", shield=" + getShield()
				+ ", attackRange=" + getAttackRange() + ", attackSpeed=" + getAttackSpeed() + ", mineral=" + getMineral() + ", gas="
				+ getGas() + ", mp=" + mp + "]";
	}


	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}
	
	
}