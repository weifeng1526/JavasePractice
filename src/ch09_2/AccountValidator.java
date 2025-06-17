package ch09_2;

import java.util.Scanner;

public class AccountValidator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("請輸入帳號：");
		String username = scanner.nextLine();

		System.out.print("請再次輸入帳號確認：");
		String check = scanner.nextLine();

		// 去除前後空白
		String trimmed = username.trim().replace(" ", "_");
		// 處理帳號格式，替換所有空白為底線"_"
		String checkFormatted = check.trim().replace(" ", "_");

		boolean isLengthOK = trimmed.length() >= 8;
		boolean isStartOK = trimmed.startsWith("user_");
		boolean isMatch = trimmed.equalsIgnoreCase(checkFormatted);

		// 長度是否大於 8
		if (isLengthOK) {
			System.out.println("\n帳號長度：" + trimmed.length());
		} else {
			System.out.println("帳號輸入長度請大於8！");
		}

		// 確認開頭是否為"user_"
		if (isStartOK) {
			System.out.println("帳號開頭檢查：正確");
		} else {
			System.out.println("帳號開頭檢查：不正確");
		}
		
		// 輸出正確的帳號格式
		System.out.println("帳號格式處理後：" + trimmed);
		
		// 確認帳號長度、開頭以及比對是否皆正確
		if (isLengthOK && isStartOK && isMatch) {
			System.out.println("帳號比對結果：一致，註冊成功！");
		} else {
			System.out.println("帳號比對結果：不一致，請重新輸入帳號！");			
		}
		
		scanner.close();
	}
}
