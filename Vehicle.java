package week8;

public class Vehicle {
	
		protected int VIN; //Protected variables allow the variable to be inherited directly by child subclasses
		
		public Vehicle(int VIN) {
			this.VIN = VIN;
			System.out.println("Vehicle");
		}
		
		public Vehicle() {
			VIN = 0;
		}
		
		public int getVIN() {
			return VIN;
		}
		
		public void setVIN(int newVIN) {
			newVIN += 100;
			System.out.println(newVIN);
			VIN = newVIN;
			
			
		}
		

}
