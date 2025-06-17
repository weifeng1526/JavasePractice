package ch16.InheritanceDemo;

public class Animal {
	String name;
	int age;
	
	void eat() {
		System.out.println(name + "正在吃東西");
	}
	
	void sleep() {
		System.out.println(name + "正在睡覺");
	}
	
	/**
	 * Animal 是父類別 (superclass)
	 * 有共同屬性 name、age
	 * 有共同方法 eat()、sleep()
	 * */
}
