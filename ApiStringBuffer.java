package lec11_java_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
		// ���ڿ��ϸ� = String
		// String�� ��� �����ϰ� �Ǹ� �� �޸� ������
		// ��� ���ο� String ��ü�� ���������,
		// �׷����� �������÷��Ͱ� �� ���� �������ϴ�.
		
		// 1���� 10������ ���ڸ� ���ڿ��� �� ���ϸ�?
		String strVal = "";
		for(int i=1; i<=10; i++) {
			// �� ���� ���ο� �޸� ������ �Ҵ�
			// ���� �޸� ������ �����ִ� ���� ������ �÷��Ϳ� ����
			// �����ȴ�. (��ȿ��)
			strVal += i;	
		}
		System.out.println(strVal);
		
		String hello = "�ȳ�";
		String hi = "�ȳ�";
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		hello += "�ϼ���";
		hi += "�ϼ���";
		System.out.println(hello.hashCode());
		System.out.println(hi.hashCode());
		
		System.out.println("\n===================================\n");
		
		// StringBuffer �̿�
		StringBuffer strBuff = new StringBuffer("�ȳ�");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());
		
		// ���ڿ� �߰�
		strBuff.append("�ϼ���");
		System.out.println(strBuff);
		System.out.println(strBuff.hashCode());
		
		//StringBuffer�� ���� ���ڿ��� String���� ��ȯ
		String strVar = strBuff.toString();
		System.out.println(strVar);
		
		
		System.out.println("\n====================================\n");
		
		// StringBuilder �̿�
		StringBuilder strBuild = new StringBuilder("�ȳ�");
		System.out.println(strBuild);
		System.out.println(strBuild.hashCode());
		
		// ���ڿ� �߰�
		strBuild.append("�ϼ���");
		System.out.println(strBuild);
		System.out.println(strBuild.hashCode());
		
		// StringBuilder�� ���� ���ڿ��� String���� ��ȯ
		String str = strBuild.toString();
		System.out.println(str);
		
		// ���� ������
		// StringBuffer�� ����ȭ ����
		// StringBuilder�� ����ȭ ������
		
		// ����ȭ��?
		// ��Ƽ ������(Thread) ȯ�濡�� �ش� ��ü�� ��� ������(Thread)���� 
		// ���������� ��� �����ϵ��� �ϴ� ��
		
		// ����ȭ �������� ���
		// ������ a, b, c ���� strBuild�� ����� ��, ������ a����
		// strBuild�� �ٲ� ��� b, c�� �̸� �𸥴�.
		// ���� �����带 �̿��Ѵٸ� ���� ����
		
		// ����ȭ ������ ���
		// ������ a, b, c ���� strBuffer�� ����� ��, ������ a����
		// strBuffer�� �ٲ� ��� b, c�� �̸� �� �� �ִ�.
		// ���� �����带 �̿��Ѵٸ� ��������� ���� ����
		
		
		
		
	}	// main ����
}