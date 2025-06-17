package ch19.AbstractPractice;

public class DogAP extends AnimalAP{
	@Override
	void makeSound() {
		System.out.println(name + "汪汪叫！");
	}
}
