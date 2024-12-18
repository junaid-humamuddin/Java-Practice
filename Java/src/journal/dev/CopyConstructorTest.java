package journal.dev;

import java.util.ArrayList;
import java.util.List;

public class CopyConstructorTest {

	public static void main(String[] args) {
		List<String> fl = new ArrayList<>();
		fl.add("Mango");
		fl.add("Orange");

		Fruits fr = new Fruits(fl);

		System.out.println(fr.getFruitsList());

		fr.getFruitsList().add("Apple");

		System.out.println(fr.getFruitsList());
		Fruits frCopy = fr;
		System.out.println(frCopy.getFruitsList());

		frCopy = new Fruits(fr);
		frCopy.getFruitsList().add("Banana");
		System.out.println(fr.getFruitsList());
		System.out.println(frCopy.getFruitsList());

	}

}
