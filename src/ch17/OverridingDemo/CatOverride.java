package ch17.OverridingDemo;

public class CatOverride extends AnimalOverride{
	@Override
	public void makeSound() {
		System.out.println(getName() + "喵喵叫！");
	}
}
