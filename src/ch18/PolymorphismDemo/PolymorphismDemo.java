package ch18.PolymorphismDemo;

import ch17.OverridingDemo.AnimalOverride;
import ch17.OverridingDemo.BirdOverride;
import ch17.OverridingDemo.CatOverride;
import ch17.OverridingDemo.DogOverride;

public class PolymorphismDemo {
	public static void main(String[] args) {
		//父類別型別陣列，放不同的子類別物件
		AnimalOverride[] animals = new AnimalOverride[3];
		
		animals[0] = new DogOverride();
		animals[0].setName("黑勾");
		
		animals[1] = new BirdOverride();
		animals[1].setName("八哥");
		
		animals[2] = new CatOverride();
		animals[2].setName("橘胖");
		
		// 使用 for-each 逐一呼叫 makeSound()
		for (AnimalOverride animal : animals) {
			animal.makeSound();
		}
	}
}
