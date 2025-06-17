package ch19.AbstractShapPractice;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[]  shapes = new Shape[2];
		shapes[0] = new Circle("白色", 2);
		shapes[1] = new Rectangle("黃色", 2, 4);
		
		for (Shape shape : shapes) {
			shape.showInfo();
		}
	}
}
