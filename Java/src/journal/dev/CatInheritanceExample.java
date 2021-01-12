package journal.dev;

public class CatInheritanceExample extends AnimalInheritanceExample {
	private String color;

	public CatInheritanceExample(boolean veg, String food, int legs) {
		super(veg, food, legs);
		this.color = "White";
	}

	public CatInheritanceExample(boolean veg, String food, int legs, String color) {
		super(veg, food, legs);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}