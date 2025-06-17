package ch19.AbstractDemo;

public class AnimalAbstractTest {
	public static void main(String[] args) {
		// AnimalAbstract animalAbstract = new AnimalAbstract(); // ❌ 錯誤！抽象類別不能 new
		
		DogAbstract dogAbstract = new DogAbstract();
		dogAbstract.name = "小黃";
		dogAbstract.makeSound();
		dogAbstract.eat(); // 繼承到一般方法
	}
}
