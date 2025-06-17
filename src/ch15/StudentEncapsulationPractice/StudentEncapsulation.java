package ch15.StudentEncapsulationPractice;

public class StudentEncapsulation {
	private String name;
	private int age;
	private int score;
	
	public StudentEncapsulation(String name, int age, int score) {
		this.name = name;
		setAge(age);
		setScore(score);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		} else {
			System.out.println(name + "這年齡已經不是人類了！");
			this.age = age;
		}
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		if (score >= 0 && score <= 100) {
			this.score = score;
		} else {
			System.out.println("請填寫0~100分之間的分數。");
		}
	}
	
	public void showInfo() {
		System.out.println("學生：" + name + "\n年紀：" + age + "\n分數：" + score + "\n");
	}
}
