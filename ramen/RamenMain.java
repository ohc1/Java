package lec10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		JinRamen jinRamen = new JinRamen("Áø¶ó¸é", 800);
		
		System.out.println(jinRamen);
		jinRamen.printRecipe();
		
		BuldakRamen buldak = new BuldakRamen("ºÒ´ßººÀ½¸é", 1200);
		
		System.out.println(buldak);
		buldak.printRecipe();
		
	}	// main Á¾·á

}