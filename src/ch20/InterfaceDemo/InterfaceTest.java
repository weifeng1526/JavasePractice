package ch20.InterfaceDemo;

import java.util.ArrayList;
import java.util.List;

public class InterfaceTest {
	public static void main(String[] args) {
		List<Sound> sounds = new ArrayList<Sound>();
		sounds.add(new Dog());
		sounds.add(new Cat());
		sounds.add(new Bird());
		sounds.add(new Tiger());
		sounds.add(new Robot());
		
		for (Sound sound : sounds) {
			sound.makeSound();
		}
	}
}
