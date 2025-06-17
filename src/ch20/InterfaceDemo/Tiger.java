package ch20.InterfaceDemo;

public class Tiger implements Sound{
	@Override
	public void makeSound() {
		System.out.println("老虎吼吼叫！");
	}
}
