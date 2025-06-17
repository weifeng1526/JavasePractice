package ch14OOP.StudentPractice;

public class Student {
	String name; // 學生姓名
	int age; // 年齡
	int score; // 成績

	// 有參數建構子：建立物件時直接給資料
	Student(String n, int a, int s) {
		name = n;
		age = a;
		score = s;
	}

	// 方法：印出學生資訊
	void showInfo() {
		System.out.println("姓名" + name + "，年齡" + age + "，成績" + score);
	}
}
