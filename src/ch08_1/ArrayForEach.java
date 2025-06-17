package ch08_1;

public class ArrayForEach {
	public static void main(String[] args) {
		String[] names = {"小明", "小美", "阿志"};
		
		for (String name : names) {
			System.out.println("Hello, "+name);
		}
	}
}
