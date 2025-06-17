package ch19.AbstractPractice;

public class BirdAP extends AnimalAP{
	@Override
	void makeSound() {
		System.out.println(name + "嘰嘰喳喳叫！");
	}
}
