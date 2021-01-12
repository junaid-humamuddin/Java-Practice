package JSON;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONValue;
//ENCODE
public class JsonUsingMap {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		  @SuppressWarnings("rawtypes")
		Map obj=new HashMap();    
		  obj.put("name","sonoo");    
		  obj.put("age",new Integer(27));    
		  obj.put("salary",new Double(600000));   
		  String jsonText = JSONValue.toJSONString(obj);  
		  System.out.print(jsonText);  

	}

}
