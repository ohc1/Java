package submit_0314.submit02;

import java.util.ArrayList;

public class Product {
	private String pro_name;
	private int pro_price;
	
	public Product(){
		
	}
	
	
	
//	private static Product instance = new Product();
//	
//	public static Product getInstance() {
//		return instance;
//	}

	public Product(String pro_name, int pro_price) {
		super();
		this.pro_name = pro_name;
		this.pro_price = pro_price;
	}

	@Override
	public String toString() {
		return "Product [��ǰ��: " + pro_name + ", ����: " + pro_price + "]";
	}

	
	public String getPro_name() {
		return pro_name;
	}

	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}

	public int getPro_price() {
		return pro_price;
	}

	public void setPro_price(int pro_price) {
		this.pro_price = pro_price;
	}
	
	
	
}