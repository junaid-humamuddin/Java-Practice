package journal.dev;

public class AnimalInheritanceExample {

	private boolean vegetarian;

	private String eats;

	private int noOfLegs;

	public AnimalInheritanceExample(){}

	public AnimalInheritanceExample(boolean veg, String food, int legs){
			this.vegetarian = veg;
			this.eats = food;
			this.noOfLegs = legs;
		}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public String getEats() {
		return eats;
	}

	public void setEats(String eats) {
		this.eats = eats;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

}