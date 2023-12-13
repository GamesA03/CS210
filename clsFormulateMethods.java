package week1;

public class clsFormulateMethods {
	
	public static void safetyCheck() {
		System.out.println("Check Starboard");
		System.out.println("Check Port");
		System.out.println("Check speed");
		System.out.println("Check fuel level");
		System.out.println("Check temperature level");
		System.out.println("Check for debris in water");	
		
		
	}
	
	public static void altDirection() {
		System.out.println("Cruise North");
		System.out.println("Cruise Northeast");
		System.out.println("Accelerate");
		
	}
	
	public static void directNorth(String alternative) {
		System.out.println("Cruise North" + alternative);
		
	}
	
	public static void monitorTraffic() {
		System.out.println("Check VHF channel 16");
		System.out.println("Check for navigational lights");
		System.out.println("Listen for fog horns");
	}

	public static void main(String[] args) 
	{

		// Startup procedure
		System.out.println("Start engine");
		System.out.println("Untie from buoy");
		System.out.println("Move into forward gear");
		System.out.println("Acclerate");
		
		altDirection();
		
		// Safety check
		safetyCheck();
		
		
		directNorth("east");
		// Safety check
		safetyCheck();
				
		
		directNorth("west");
		// Monitor boat traffic
		monitorTraffic();
	
	
		directNorth("west");
		
		// Safety check
		safetyCheck();
				
		// Monitor boat traffic
		monitorTraffic();
		
		altDirection();
		// Safety check
		safetyCheck();
		
	    // Shutdown boat and moor
		System.out.println("Secure boat to buoy");
		System.out.println("Turn off motor");
		System.out.println("Turn off electrical");
		System.out.println("Lock boat motor");
		
		
	}

}
