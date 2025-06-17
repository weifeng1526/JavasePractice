package ch16.InheritanceDemo;

public class Dog extends Animal {
	void bark() {
		System.out.println(name + "汪汪叫");
	}
	
	/**
	 * Dog 使用 extends Animal 表示繼承
	 * Dog 自己多了 bark() 方法*/
}
