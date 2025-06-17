package ch10_1;

import java.util.Scanner;

public class StringArrayExample {
	public static void main(String[] args) {

		// 1. split()：將字串依指定符號切割成字串陣列
		String sentence = "apple,banana,orange \n";
		String[] fruits = sentence.split(",");

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// 2. join()：將字串陣列合併為一個字串（使用 String.join() 方法）
		String[] names = { "Amy", "Bob", "Cindy" };
		String result = String.join(" & ", names);
		System.out.println(result); // 輸出：Amy & Bob & Cindy

		// 3. 結合輸入處理與分析應用
		Scanner scanner = new Scanner(System.in);
		System.out.print("\n請輸入多個名字 (以逗號分隔)：");
		String input = scanner.nextLine();

		String[] names2 = input.split(",");
		System.out.println("總共有 " + names2.length + " 位名字：");
		
		for (String name : names2) {
			System.out.println(name.trim());
		}
	}
}
