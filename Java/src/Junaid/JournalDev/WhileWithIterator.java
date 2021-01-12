package Junaid.JournalDev;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileWithIterator {

	public static void main(String[] args) {
		List<String> veggies = new ArrayList<>();
		veggies.add("Spinach");
		veggies.add("Potato");
		veggies.add("Tomato");

		Iterator<String> it = veggies.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
