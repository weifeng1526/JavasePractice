package ch15.EncapsulationPractice;

public class BookEncapsulation {
	// 欄位設為 private
	private String name;
	private String author;
	private int price;
	
	// 建構子
	public BookEncapsulation(String name, String author, int price) {
		this.name = name;
		this.author =author;
		setPrice(price);
	}

	// Getter & Setter
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		// 這裡可以加判斷，防止負價格
		if (price >= 0) {
			this.price = price;
		} else {
			System.out.println("價格不能是負數，預設設為 0");
			this.price = 0;
		}
	}
	
	// 方法：顯示完整書籍資訊
	public void showInfo() {
		System.out.println("書名" + name + "\n作者：" + author + "\n價格" + price + "\n");
	}
}
