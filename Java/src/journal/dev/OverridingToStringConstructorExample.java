package journal.dev;

class Complex {
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	/*
	 * Returns the string representation of this Complex number. The format of
	 * string is "Re + iIm" where Re is real part and Im is imagenary part.
	 */
	@Override
	public String toString() {
		return String.format(re + " + i" + im);
	}

	// In general, it is a good idea to override toString()
	// as we get get proper output when an object is used in print() or println().
}

public class OverridingToStringConstructorExample {

	public static void main(String[] args) {
		Complex c1 = new Complex(10, 15);
		System.out.println(c1);

	}

}
