package lec13_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Chef chef = new Chef(issac);
		
		Customer minwoo = new Customer(issac, 2, "�ο�");
		Customer jaehun = new Customer(issac, 5, "����");
		Customer eunji = new Customer(issac, 3, "����");
		
		chef.start();
		minwoo.start();
		jaehun.start();
		eunji.start();
	}
}