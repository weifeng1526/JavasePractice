package ch14OOP.CarConstructorPractice;

public class CarConstructorTest {
	public static void main(String[] args) {
		CarConstructor car1 = new CarConstructor("CR-V", 2018);
		CarConstructor car2 = new CarConstructor("R34", 1999);
		
		car1.showInfo();
		car2.showInfo();
		
		int car1Age = 2025 - car1.year;
		int car2Age = 2025 - car2.year;
		
		System.out.println(car1.brand + "今年" + car1Age + "歲");
		System.out.println(car2.brand + "今年" + car2Age + "歲");
	}
}


