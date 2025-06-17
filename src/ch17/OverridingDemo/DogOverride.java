package ch17.OverridingDemo;

public class DogOverride extends AnimalOverride{
	@Override
	public void makeSound() {
		System.out.println(getName() + "汪汪叫！");
	}
}
