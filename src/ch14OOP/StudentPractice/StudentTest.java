package ch14OOP.StudentPractice;

public class StudentTest {
	public static void main(String[] args) {
		// 建立物件時直接給姓名、年齡、成績
		Student stu1 = new Student("小明", 18, 95);
		Student stu2 = new Student("小美", 19, 88);
		
		stu1.showInfo();
		stu2.showInfo();
		
		// 額外計算：比對誰分數高
		if (stu1.score > stu2.score) {
			System.out.println(stu1.name + " 的分數比較高！");
		} else if (stu1.score < stu2.score) {
			System.out.println(stu2.name + " 的分數比較高！");
		} else {
			System.out.println("兩位同學分數一樣高！");
		}
	}
}
