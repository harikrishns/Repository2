package Com.java;

public class Electric extends Car {
	@Override
	public final String drive() {
		return "Driving electic car";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Car car=new Car();
	System.out.println(car.drive());
	}

	

}
