package ch07;

import java.util.Scanner;

public class GameMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// 顯示選單
		String attack = "攻擊";
		String heal = "回復體力";
		String item = "使用道具";
		String run = "轉身離開";

		System.out.println("你遇到了皮卡丘！");
		System.out.println("請選擇你的行動：");
		System.out.println("1. " + attack);
		System.out.println("2. " + heal);
		System.out.println("3. " + item);
		System.out.println("4. " + run);

		// 使用者輸入
		System.out.print("請輸入選項 (1～4)：");
		int choice = scanner.nextInt();

		// 根據選項判斷
		switch (choice) {
		case 1:
			System.out.println("您選擇了【" + attack + "】，對皮卡丘造成了巨量傷害【-10】");
			break;
		case 2:
			System.out.println("您選擇了【" + heal + "】");
			break;
		case 3:
			System.out.println("您選擇了【" + item + "】");
			break;
		case 4:
			System.out.println("您選擇了【" + run + "】，已逃離。");
			break;
		default:
			System.out.println("無效的選項，請輸入 1～4！ ");
		}
	}
}
