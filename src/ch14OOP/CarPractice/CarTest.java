package ch14OOP.CarPractice;

public class CarTest {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.brand = "CR-V";
		car1.year = 2018;
		
		car2.brand = "R34";
		car2.year = 1999;
		
		car1.showInfo();
		car2.showInfo();
		
		int car1Age = 2025 - car1.year;
		int car2Age = 2025 - car2.year;
		
		
		System.out.println(car1.brand + "今年" + car1Age + "歲");
		System.out.println(car2.brand + "今年" + car2Age + "歲");
	}
}
