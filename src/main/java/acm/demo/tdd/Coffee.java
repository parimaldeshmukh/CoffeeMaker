package acm.demo.tdd;

public class Coffee {

	String type;
	
	public Coffee(String ofType){
		type = ofType;
	}
	
	public boolean isReady() {
		return true;
	}

	public String descritption() {
		return "yummy, " + type + " coffee";
	}

}
