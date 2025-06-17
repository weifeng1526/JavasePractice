package ch20.InterfaceDemo;

public class Bird implements Sound{
	@Override
	public void makeSound() {
		System.out.println("鳥兒嘰嘰喳喳叫！");	
	}
}
