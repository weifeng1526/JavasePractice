package ch10_2;

import java.util.Scanner;

public class NameSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 輸入使用者名字
		System.out.print("請輸入多個名字 (以逗號分隔)：");
		String input = scanner.nextLine();

		// 將全形逗號換成半形，並切割
		String[] names = input.replace("，", ",").split(",");

		// 使用者輸入搜尋條件
//		System.out.print("請輸入搜尋條件 (開頭為哪個字母)：");
//		String condition = scanner.nextLine().trim();
		
		// 搜尋條件二
		System.out.print("請輸入搜尋條件 (包含哪個字母)：");
		String ketword = scanner.nextLine().trim();
		
		// 搜尋並顯示符合條件的名字
		int count = 0;
		System.out.println("符合條件的名字有：");
		for (String name : names) {
			name = name.trim();
//			if (!name.isEmpty() && name.toLowerCase().startsWith(condition.toLowerCase())) {
//				System.out.println(name);
//				count++;
//			}
			if (!name.isEmpty() && name.toLowerCase().contains(ketword.toLowerCase())) {
				System.out.println(name);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("沒有符合條件的名字。");
		}
		
		System.out.println("總共有 " + count + " 位名字符合條件");		
		scanner.close();
	}
}
