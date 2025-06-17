package ch10_1;

import java.util.Scanner;

public class StringArrayScannerPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入多個名字 (以逗號分隔)：");
		String input = scanner.nextLine();

		// 將全形逗號換成半形，並切割
		String[] names = input.replace("，", ",").split(",");

		// 過濾掉空白元素
		int count = 0;
		for (String name : names) {
			name = name.trim();
			if (!name.isEmpty()) {
				System.out.println(name);
				count++;
			}
		}
		System.out.println("總共有 " + count + " 位名字：");		
		scanner.close();
	}
}
