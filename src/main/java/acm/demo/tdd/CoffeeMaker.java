package acm.demo.tdd;

import java.util.HashMap;
import java.util.Map;

public class CoffeeMaker {
	
	private Map<String, String> types = new HashMap<>();

	public CoffeeMaker() {
		types.put("mocha", "hot");
		types.put("cappucino", "hot");
		types.put("frappacino", "cold");
		types.put("coollata", "cold");
		
	}
	
	public Coffee make(String ofType) {
		
		if(ofType.equals("hot") || ofType.equals("cold")) {
			return new Coffee(ofType);
		}
		
		return new Coffee(types.get(ofType) + " " + ofType);
	}

}
