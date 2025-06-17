package ch15.EncapsulationPractice;

public class BookEncapsulationTest {
	public static void main(String[] args) {
		// 建立物件時直接給書名、作者、價格
		BookEncapsulation book1 = new BookEncapsulation("史萊姆Lv.Max", "史萊姆", 190);
		BookEncapsulation book2 = new BookEncapsulation("旋風管家", "我忘了", 200);
		
		book1.showInfo();
		book2.showInfo();
		
		if (book1.getPrice() > book2.getPrice()) {
			System.out.println(book1.getName() + "的價格較高！");
		} else if (book1.getPrice() < book2.getPrice()) {
			System.out.println(book2.getName() + "的價格較高！");
		}else {
			System.out.println("兩本書的價格一樣高！");
		}
	}
}
