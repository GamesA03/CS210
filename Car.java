package week8;

public class Car extends Vehicle {
	
	//public
	//private
	
	//subclasses CANNOT inherit constructors
	public void print() {
		System.out.println("Car");
	}
	
	public int getVIN( ) {
		return super.getVIN() + 10;
	}
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle();
		Vehicle truck = new Vehicle(12345);
		
		Car myCar = new Car();
		int VIN = 42;
		myCar.setVIN(VIN);
		System.out.println(VIN);
	}
 
}
