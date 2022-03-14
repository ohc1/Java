package lec09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	// �̱��� ���� ����
	// 1. �⺻ �����ڸ� private���� ���´�.
	private MemberDB() {}
	
	// 2. �ʵ忡 MemberDB�� new�� �̿��ؼ� ��ü�� ����� �д�.
	private static MemberDB instance = new MemberDB();
	
	// 3. ��ü�� ���� instance�� �����ϴ� �Լ� �����
	public static MemberDB getInstance() {
		return instance;
	}
	
	private ArrayList<Member> memberList = new ArrayList<Member>();
	
	// ȸ������
	public void addMember(Member member) {
		// �ߺ�üũ
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(member.getId())) {
				System.out.println("���̵� �ߺ��˴ϴ�.");
				return;
			}
		}
		memberList.add(member);
	}
	
	// �α���
	public boolean loginCheck(String id, String pw) {
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id)) {
				if(memberList.get(i).getPassWord().equals(pw)) {
					return true;
				}
			}
		}
		System.out.println("���̵� Ȥ�� ��й�ȣ�� �ٸ��ϴ�.");
		return false;
	}
	
	// ȸ�� ��� �����ֱ�
	public void showList() {
		System.out.println("ȸ����� =========================");
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
		System.out.println("=================================");
	}

}