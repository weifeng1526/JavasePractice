package ch14OOP.BookPractice;

public class Book {
	String name;  // 書名
	String author; // 作者
	int price; 	   // 價格
	
	Book(String t, String a, int p) {
		name = t;
		author = a;
		price = p;
	}
	
	// 方法：印出完整書籍資訊
	void showInfo() {
		System.out.println("書名：" + name + "\n作者：" + author + "\n價格：" + price + "\n");
	}
}
