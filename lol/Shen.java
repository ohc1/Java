package lec10_extends_interface.lol;

// �������̽��� ����(implement) �ϱ� ���ؼ��� extends�� �ƴ�
// implements�� ����Ѵ�.
// �ڹٿ����� �⺻������ ���� ����� �Ұ����ϴ�.
// (extends �ڿ� �Ѱ��� Ŭ������ ���)
// �������̽��� ���� ������ �����ϴ�.
// (implements �ڿ� �������� Ŭ���� ���)
public class Shen extends Champion implements LolInterface, VoiceInterface{

	public Shen(String name, int hp, int damage) {
		super(name, hp, damage);
	}

	@Override
	public void skillQ() {
		System.out.println("��Ÿ 3�� ��ȭ");
	}

	@Override
	public void skillW() {
		System.out.println("��ȣ�� Ȱ��ȭ");
	}

	@Override
	public void skillE() {
		System.out.println("����");
	}

	@Override
	public void skillR() {
		System.out.println("���� ��ȣ�� �ֱ�");
	}

	@Override
	public void speak() {
		System.out.println("�� �̹� �׾��ִ�. ���� ���� ������ ��������");
	}
	
}