package ch20.InterfaceDemo;

public class Dog implements Sound{
	@Override
	public void makeSound() {
		System.out.println("狗狗汪汪叫！");
	}
}
