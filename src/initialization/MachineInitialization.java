package initialization;

public interface MachineInitialization {

	default void getPower(boolean power) {
		if (power == false) {
			System.out.println("This would not do anything, simulates no power");
			System.exit(0);
		}
		System.out.println("Initializing power check.....");
		try {
			Thread.sleep(1000);// simulates an initilaization, heat checks and conveyor checks etc.
			System.out.println("Power check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	default void getConveyorStatus(boolean power) {
		if (power == false) {
			System.out.println("Conveyor check failed");// what do we do if conveyer fails?
			System.exit(0);
		}
		System.out.println("\nInitializing conveyor check.....");
		try {
			Thread.sleep(1000);// simulates an initialization, heat checks and conveyer checks etc.
			System.out.println("Conveyor check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	default void getHeatElementStatus(boolean power) {
		if (power == false) {
			System.out.println("Heat element check failed");// what do we do if conveyer fails?
			System.exit(0);
		}
		System.out.println("\nInitializing heater element check.....");
		try {
			Thread.sleep(1000);// simulates an initialization, heat checks and conveyer checks etc.
			System.out.println("Heat element check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	default void getBatterSensorStatus(boolean power) {
		if (power == false) {
			System.out.println("Batter level sensor check failed");// what do we do if conveyer fails?
			System.exit(0);
		}
		System.out.println("\nInitializing batter sensor check.....");
		try {
			Thread.sleep(1000);// simulates an initialization, heat checks and conveyer checks etc.
			System.out.println("Batter level sensor check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
//	default void //make a method to set and get the qty, which will update something inside poweronpancake as an option 
//	made changes here: JP
	
}
