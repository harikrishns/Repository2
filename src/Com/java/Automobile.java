package Com.java;

public class Automobile {

	private String drive() {
		return "Driving vehicle";
	}
}
class Car extends Automobile{
	protected String drive() {
		return "Driving car";
	}
}

	