package journal.dev;

public class MathUtils {

	public int add (int x, int y) {
		return x + y;
	}
	
	public static void main(String args[]) throws Exception {
		MathUtils mu = new MathUtils();
		System.out.println(mu.add(5, 2));
		MathUtils.print("Static Method");
	}
	
	public static void print(String s) {
		//System.out.println(s);
	}
	
}