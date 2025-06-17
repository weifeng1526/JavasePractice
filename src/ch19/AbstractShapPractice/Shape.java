package ch19.AbstractShapPractice;

public abstract class Shape {
	private String color; // 用 private，並用 Getter/Setter
	
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	abstract double getArea();

	void showInfo() {
		System.out.println("顏色：" + getColor());
		System.out.println("面積：" + getArea());
		System.out.println();
	}
}
