package ch07;

import java.util.Scanner;

public class MenuSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("請選擇功能：");
		System.out.println("1. 查詢帳戶：");
		System.out.println("2. 存款：");
		System.out.println("3. 提款：");
		System.out.println("4. 離開：");
		
		System.out.print("請輸入選項 (1-4)：");
		int choice = scanner.nextInt();
		
		switch (choice){
		case 1: 
			System.out.println("您選擇了【查詢帳戶】");
			break;			
		case 2: 
			System.out.println("您選擇了【存款】");
			break;
		case 3: 
			System.out.println("您選擇了【提款】");
			break;
		case 4: 
			System.out.println("感謝您的使用！");
			break;			
		default:
			System.out.println("輸入錯誤，請輸入 1～4！ ");
//			throw new IllegalArgumentException("輸入錯誤，請輸入 1～4！ ");
		}
	}
}
