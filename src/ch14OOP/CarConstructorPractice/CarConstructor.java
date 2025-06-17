package ch14OOP.CarConstructorPractice;

public class CarConstructor {
	String brand;
	int year;
	
	// <<== 新增的建構子
	CarConstructor(String b, int y){
		brand = b;
		year = y;
	}
	
	void showInfo() {
		System.out.println("這台車是" + brand + "，年份是" + year);
	}
}
