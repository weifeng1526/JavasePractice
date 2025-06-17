package ch19.AbstractShapPractice;

public class Circle extends Shape{
	double radius;
	
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return Math.PI * radius * radius; // 圓面積公式：π * 半徑²
	}
}
