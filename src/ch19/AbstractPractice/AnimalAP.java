package ch19.AbstractPractice;

public abstract class AnimalAP {
	String name;
	
	abstract void makeSound();
	
	void eat() {
		System.out.println(name + "正在吃東西！");
	}
}
