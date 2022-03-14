package submit_0314.submit02;

import java.util.ArrayList;
import java.util.Arrays;

public class Himart {
	public static void main(String[] args) {
//		Product pro = Product.getInstance();
		
		Product pro1 = new Product("냉장고",2000000);
		
		Product pro2 = new Product("TV",1000000);
		
		Product pro3 = new Product("에어컨",800000);
		
		Product pro4 = new Product("컴퓨터",1300000);
		
		Product pro5 = new Product("선풍기",100000);
		
		ArrayList<Product> proList = new ArrayList<Product>();
		
		proList.add(pro1);
		proList.add(pro2);
		proList.add(pro3);
		proList.add(pro4);
		proList.add(pro5);
		
//		System.out.println(proList);
		
		for(int i = 0; i < proList.size(); i++) {
			for(int j = 0; j < proList.size()-1-i; j++) {
				if(proList.get(j).getPro_price() > proList.get(j+1).getPro_price()) {
					Product temp = proList.get(j);
					proList.set(j, proList.get(j+1));
					proList.set(j+1, temp);
				}
			}
		}
		
		for(int i = 0; i < proList.size(); i++) {
			System.out.println(proList.get(i));
		}
		
		for(int i = 0; i < proList.size(); i++) {
			if(proList.get(i).getPro_name().equals("TV")) {
				System.out.println(i);
			}
		}
	}
}