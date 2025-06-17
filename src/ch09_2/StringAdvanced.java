package ch09_2;

import java.util.Scanner;

public class StringAdvanced {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入你的全名：");
		String name = scanner.nextLine();

		// 1. 去除前後空白
		String trimmed = name.trim();
		System.out.println("去除空白後：" + trimmed);

		// 2. 是否以 Mr. 或 Ms. 開頭
		if (trimmed.startsWith("Mr.")) {
			System.out.println("您好，先生！");
		} else if (trimmed.startsWith("Ms.")) {
			System.out.println("您好，女士！");
		}

		// 3. 是否以特定姓氏結尾（例如：Lin）
		if (trimmed.endsWith("Lin")) {
			System.out.println("您可能是林先生/女士。");
		}

		// 4. 找出空白的位置
		int spaceIndex = trimmed.indexOf(" ");
		if (spaceIndex != -1) {
			System.out.println("名字中的第一個空白位置在：" + spaceIndex);
		}

		// 5. 替換名稱中的空白為底線
		String replaced = trimmed.replace(" ", "_");
		System.out.println("改為帳戶用戶名格式：" + replaced);

		// 6. 拆分姓與名
		String[] parts = trimmed.split(" ");
		if (parts.length >= 2) {
			System.out.println("姓氏：" + parts[0]);
			System.out.println("名字：" + parts[1]);
		}

		// 7. 忽略大小寫比較
		System.out.println("請再輸入一次你的名字來比對：");
		String check = scanner.nextLine();

		if (trimmed.equalsIgnoreCase(check.trim())) {
			System.out.println("名字一致！");
		} else {
			System.out.println("名字不一致！");
		}
	}
}
