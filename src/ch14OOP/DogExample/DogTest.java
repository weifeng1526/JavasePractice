package ch14OOP.DogExample;

public class DogTest {
	public static void main(String[] args) {
		// 建立 Dog 物件
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		// 設定屬性
		String white = dog1.name = "小白";
		int whiteAge = dog1.age = 3;
		
		String black = dog2.name = "小黑";
		int blackAge = dog2.age = 5;
		
		// 呼叫方法
		dog1.bark();
		dog2.bark();
		
		System.out.println(white + "今年" + whiteAge + "歲");
		System.out.println(black + "今年" + blackAge + "歲");
	}
}
