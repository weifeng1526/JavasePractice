package ch15.StudentEncapsulationPractice;

public class StudentEncapsulationTest {
	public static void main(String[] args) {
		StudentEncapsulation stu1 = new StudentEncapsulation("小明", 160, 90);
		StudentEncapsulation stu2 = new StudentEncapsulation("小美", 17, 90);
		
		stu1.showInfo();
		stu2.showInfo();
		
		if (stu1.getScore() > stu2.getScore()) {
			System.out.println(stu1.getName() + "的成績較高！");
		} else if (stu1.getScore() < stu2.getScore()) {
			System.out.println(stu2.getName() + "的成績較高！");
		} else {
			System.out.println("兩位的的成績一樣高！");
		}
	}
}
