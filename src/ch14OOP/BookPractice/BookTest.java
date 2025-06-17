package ch14OOP.BookPractice;

public class BookTest {
	public static void main(String[] args) {
		// 建立物件時直接給書名、作者、價格
		Book book1 = new Book("変身", "新堂エル", 250);
		Book book2 = new Book("迷茫管家與膽怯的我", "朝野始", 180);
		
		book1.showInfo();
		book2.showInfo();
		
		if (book1.price > book2.price) {
			System.out.println(book1.name + "的價格較高！");
		} else if (book1.price < book2.price) {
			System.out.println(book2.name + "的價格較高！");
		}else {
			System.out.println("兩本書的價格一樣高！");
		}
	}
}
