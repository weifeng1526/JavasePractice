package ch17.OverridingDemo;

public class AnimalOverride {
	// 為了讓ch18.PolymorphismDemo可以取用，
	// 加上private封裝提供setter、getter
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println(name + "發出了一般動物的聲音");
	}
}
