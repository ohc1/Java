package lec10_extends_interface.simple;

public class Parent {
	// 필드
	private String name;
	private int age;
	
	// 생성자
	public Parent(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 메서드
	public void sayHello() {
		System.out.println("안녕하신가, 어른이올시다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}