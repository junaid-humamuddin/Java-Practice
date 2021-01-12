package JSON;

import org.json.simple.JSONArray;
//ENCODE
public class JsonUsingArray {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONArray arr = new JSONArray();
		arr.add("sonoo");
		arr.add(new Integer(27));
		arr.add(new Double(600000));
		System.out.print(arr);

	}

}
