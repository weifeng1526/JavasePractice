package ch09_1;

public class StringExample {
	public static void main(String[] args) {
		String text = "Hello Java";
		
		System.out.println("原始字串：" + text);
		System.out.println("字串長度：" + text.length());
		System.out.println("第一個字元：" + text.charAt(0));
		System.out.println("大寫版本：" + text.toUpperCase());
		System.out.println("小寫版本：" + text.toLowerCase());
		System.out.println("是否包含 'Java'：" + text.contains("Java"));
		System.out.println("擷取子字串 (6~10)：" + text.substring(6,10)); // "Java"
	}
}
