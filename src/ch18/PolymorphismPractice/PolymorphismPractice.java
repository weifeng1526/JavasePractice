package ch18.PolymorphismPractice;

import ch17.OverridingDemo.AnimalOverride;
import ch17.OverridingDemo.BirdOverride;
import ch17.OverridingDemo.CatOverride;
import ch17.OverridingDemo.DogOverride;

public class PolymorphismPractice {
	public static void main(String[] args) {
		AnimalOverride[] animalP = new AnimalOverride[5];
		
		animalP[0] = new DogOverride();
		animalP[0].setName("小黃");
		
		animalP[1] = new BirdOverride();
		animalP[1].setName("大毛");
		
		animalP[2] = new CatOverride();
		animalP[2].setName("里歐");
		
		animalP[3] = new TigerOverride();
		animalP[3].setName("大河");
		
		animalP[4] = new SheepOverride();
		animalP[4].setName("小咩");
		
		for (AnimalOverride animals : animalP) {
			animals.makeSound();
			System.out.println();
		}
	}
}
