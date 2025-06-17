package ch20.InterfaceDemo;

public class Robot implements Sound {
	@Override
	public void makeSound() {
		System.out.println("我是機器人！請輸入指令。");
	}
}
