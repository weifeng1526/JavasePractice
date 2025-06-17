package ch17.OverridingDemo;

public class BirdOverride extends AnimalOverride{
	@Override
	public void makeSound() {
		System.out.println(getName() + "嘰嘰喳喳叫！");
	}
}
