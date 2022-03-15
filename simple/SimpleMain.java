package lec10_extends_interface.simple;

public class SimpleMain {
	public static void main(String[] args) {
		Parent daddy = new Parent("¹Î¿ì",32);
		
		System.out.println(daddy.getName());
		System.out.println(daddy.getAge()); 
		daddy.sayHello();
		System.out.println(daddy.toString());
		
		Child child = new Child("À¯Áø",20);
		
		System.out.println(child.getName());
		System.out.println(child.getAge());
		child.sayHello();
		System.out.println(child.toString());
	}
}