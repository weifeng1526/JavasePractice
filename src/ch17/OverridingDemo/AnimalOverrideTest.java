package ch17.OverridingDemo;

public class AnimalOverrideTest {
	public static void main(String[] args) {
		DogOverride dogOverride = new DogOverride();
		BirdOverride birdOverride = new BirdOverride();
		CatOverride catOverride = new CatOverride();
		
		dogOverride.setName("小黑");
		dogOverride.makeSound();
		
		birdOverride.setName("八歌");;
		birdOverride.makeSound();
		
		catOverride.setName("小橘");;
		catOverride.makeSound();
	}
}
