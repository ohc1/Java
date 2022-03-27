package lec13_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		Issac issac = new Issac();
		
		Chef chef = new Chef(issac);
		
		Customer minwoo = new Customer(issac, 2, "¹Î¿ì");
		Customer jaehun = new Customer(issac, 5, "ÀçÈÆ");
		Customer eunji = new Customer(issac, 3, "ÀºÁö");
		
		chef.start();
		minwoo.start();
		jaehun.start();
		eunji.start();
	}
}