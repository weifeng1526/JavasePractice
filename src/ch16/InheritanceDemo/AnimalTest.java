package ch16.InheritanceDemo;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.name = "小白";
		dog1.age = 3;
		
		// 呼叫父類別的方法
		dog1.eat();
		dog1.sleep();
		
		// 呼叫子類別的方法
		dog1.bark();
		
		System.out.println();
		
		// 小挑戰練習(鳥Bird)
		Bird bird1 = new Bird();
		
		bird1.name = "阿巴";
		bird1.age = 4;
		
		bird1.eat();
		bird1.sleep();
		bird1.fly();
	}
}
