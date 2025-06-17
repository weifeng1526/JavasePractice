package ch18.PolymorphismPractice;

import ch17.OverridingDemo.AnimalOverride;

public class SheepOverride extends AnimalOverride{
	@Override
	public void makeSound() {
		System.out.println(getName() + "咩咩叫！");
	}
}
