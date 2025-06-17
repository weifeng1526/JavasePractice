package ch19.AbstractPractice;

public class AnimalAPTest {
	public static void main(String[] args) {
		
		DogAP dogAP = new DogAP();
		dogAP.name = "小黑";
		dogAP.makeSound();
		dogAP.eat();
		
		System.out.println();
		
		BirdAP birdAP = new BirdAP();
		birdAP.name = "小巴";
		birdAP.makeSound();
		birdAP.eat();
	}
}
