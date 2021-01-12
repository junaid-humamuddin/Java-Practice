package journal.dev;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

	private List<String> fruitsList;

	/**
	 * @return the fruitsList
	 */
	public List<String> getFruitsList() {
		return fruitsList;
	}

	/**
	 * @param fruitsList the fruitsList to set
	 */
	public void setFruitsList(List<String> fruitsList) {
		this.fruitsList = fruitsList;
	}

	public Fruits(List<String> f1) {
		this.fruitsList = f1;
	}

	public Fruits(Fruits fr) {
		List<String> f1 = new ArrayList<>();
		for (String f : fr.getFruitsList()) {
			f1.add(f);
		}

		this.fruitsList = f1;
	}

}
