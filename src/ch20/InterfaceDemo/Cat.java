package ch20.InterfaceDemo;

public class Cat implements Sound{
	@Override
	public void makeSound() {
		System.out.println("貓咪喵喵叫！");	
	}
}
