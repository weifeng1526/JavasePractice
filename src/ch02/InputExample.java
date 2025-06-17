package ch02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請輸入你的名字：");
		String name = scanner.nextLine();
		
		System.out.println("請輸入你的年齡：");
		int age = scanner.nextInt();
		
		System.out.println("請輸入你的身高(公分)：");
		double height = scanner.nextDouble();
		
		System.out.println("你是學生嗎? 請輸入true或false：");
		boolean isStudent = scanner.nextBoolean();
		
		System.out.println("\n你好，" + name + "！你今年" + age + "歲，身高" + height + "公分，是個學生：" + isStudent);
//		System.out.printf("\n你好，%s！你今年 %d 歲，身高 %.1f 公分，是個學生：%b\n", name, age, height, isStudent);

	}
}
