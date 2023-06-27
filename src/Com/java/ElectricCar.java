package Com.java;
//import Com.java.Automobile;
public class ElectricCar extends Car {
	@Override
	public final String drive() {
		return "Driving electic car";
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
final Car car=new ElectricCar();
	System.out.println(car.drive());
	}

}

