package ch07;

import java.util.Scanner;

public class CafeMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//顯示選單
		System.out.println("歡迎來到NekoParaCafe！");
		System.out.println("請選擇您要的飲料：");
		System.out.println("1. 美式咖啡");
		System.out.println("2. 拿鐵");
		System.out.println("3. 卡布奇諾");
		System.out.println("4. 熱可可");
		System.out.println("5. 離開");
		
		//使用者輸入
		System.out.print("請輸入選項 (1～5)：");
		int choice = scanner.nextInt();
		
		//根據選項判斷
		switch (choice){
		case 1: 
			System.out.println("您選擇了【美式咖啡】，請稍等～");
			break;			
		case 2: 
			System.out.println("您選擇了【拿鐵】，請稍等～");
			break;
		case 3: 
			System.out.println("您選擇了【卡布奇諾】，請稍等～");
			break;
		case 4: 
			System.out.println("您選擇了【熱可可】，請稍等～");
			break;
		case 5: 
			System.out.println("感謝光臨，再見！");
			break;			
		default:
			System.out.println("無效的選項，請輸入 1～5！ ");
		}
	}
}
