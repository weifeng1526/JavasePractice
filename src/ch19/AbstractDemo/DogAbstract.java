package ch19.AbstractDemo;

public class DogAbstract extends AnimalAbstract{
	@Override
	void makeSound() {
		System.out.println(name + " 汪汪叫！");
	}
}
