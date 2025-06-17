package ch09_1;

import java.util.Scanner;

public class StringPractice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 1. 請使用者輸入一個英文句子
		System.out.print("請輸入一個英文句子：");
		String input = scanner.nextLine();

		// 2. 印出句子長度
		System.out.println("句子長度為： " + input.length());

		// 3. 印出第一個字元
//		System.out.println("第一個字元是： " + input.charAt(0));
		// 保護措施
		if (input.length() > 0) {
		    System.out.println("第一個字元是： " + input.charAt(0));
		} else {
		    System.out.println("輸入為空，無法取得第一個字元。");
		}
		
		// 4. 判斷該句是否包含單字"Java"
		if (input.toLowerCase().contains("java")) {
			System.out.println("有包含 Java！");
		} else {
			System.out.println("沒有 Java 這個單字");
		}

		// 5. 整句轉成大寫
		System.out.println("全部大寫：" + input.toUpperCase());

		// 6. 判斷字串長度是否大於 5，印出2~6字元
		if (input.length() > 5) {
			System.out.println("第2~6個字元：" + input.substring(1, 6));
		} else {
			System.out.println("此句字串長度小於 6");
		}
	}
}
