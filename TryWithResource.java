package lec12_exception;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// finally���� ����ϴ� close
		try {
			System.out.print("�ƹ����̳� �Է�: ");
			System.out.println(sc.nextLine());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		
		// try-with-resource ����
		// �ݾƾ��� ��ü�� try() ��ȣ �ȿ� ���� �� 
		// try ���{} ������ ���
		// ��ü�� Ŭ������ AutoCloseable �������̽��� �����ϰ� �־�� ��
		try(Scanner sca = new Scanner(System.in)){
			System.out.print("�ƹ� ���̳� �Է� �ι�°: ");
			System.out.println(sca.nextLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// try-with-resource�� ���, catch�� ������ �ʾƵ� �ȴ�.
		try(Scanner sca = new Scanner(System.in)){
			System.out.print("�ƹ� ���̳� �Է� �ι�°: ");
			System.out.println(sca.nextLine());
		}
		
		// try() ��ȣ �ȿ� ��ü ������ ����(���̻��̿� ; �� �ٿ��ش�)
		try(Scanner scan = new Scanner(System.in); Scanner scann = new Scanner(System.in)){
			System.out.print("�ƹ� ���̳� �Է� ����°: ");
			System.out.println(scan.nextLine());
			System.out.print("�ƹ� ���̳� �Է� �׹�°: ");
			System.out.println(scann.nextLine());
		}
		
		
		
	}
}