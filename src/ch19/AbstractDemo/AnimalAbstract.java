package ch19.AbstractDemo;

// 抽象類別
public abstract class AnimalAbstract {
	String name;
	
	// 抽象方法
	abstract void makeSound();
	
	// 一般方法 (可以有方法體)
	void eat() {
		System.out.println(name + " 正在吃東西");
	}
}
