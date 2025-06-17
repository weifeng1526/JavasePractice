package ch06;

import java.util.Scanner;

public class LoginCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入帳號：");
		String username = scanner.next();
		
		if (username.equals("admin") || username.equals("root")) {
			System.out.println("歡迎管理員登入");
		} else {
			System.out.println("一般使用者登入");			
		}
	}
}
