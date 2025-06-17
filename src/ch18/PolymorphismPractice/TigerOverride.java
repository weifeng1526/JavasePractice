package ch18.PolymorphismPractice;

import ch17.OverridingDemo.AnimalOverride;

public class TigerOverride extends AnimalOverride{
	@Override
	public void makeSound() {
		System.out.println(getName() + "吼吼叫！");
	}
}
