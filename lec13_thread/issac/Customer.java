package lec13_thread.issac;

public class Customer extends Thread{
	private Issac issac;
	private int count;
	
	Customer(Issac issac, int count, String name){
		super(name);
		this.issac = issac;
		this.count = count;
	}
	
	@Override
	public void run() {
		// �佺Ʈ�� �����Ѵ�.
		issac.buyToast(super.getName(), count);
	}
	
}