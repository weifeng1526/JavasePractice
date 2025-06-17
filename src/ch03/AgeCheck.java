package ch03;

import java.util.Scanner;

public class AgeCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("請輸入你的年齡：");
		int age = scanner.nextInt();
		
		//第一步判斷年齡是否成年
//		if (age >= 18) {
//			System.out.println("你已經是成年人了！");
//		} else {
//			System.out.println("你還是未成年喔！");
//		}
		
		//第二步使用多重條件(else if)
		if (age >= 65) {
			System.out.println("你是長者，請注意健康！");
		} else if (age >= 18){
			System.out.println("你是成年人，歡迎成為社畜！");
		} else if (age >=13) {
			System.out.println("你是青少年，努力撐過考試！");
		} else {
			System.out.println("你是小朋友，趁現在多玩樂！");
		}

	}
}
