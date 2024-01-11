package initialization;

public interface MachineInitialization {

	default void getPower(boolean power) {
		if (power == false) {
			System.out.println("This would not do anything, simulates no power");
			System.exit(0);
		}
		System.out.println("Initializing power check.....");
		try {
			Thread.sleep(1000);// simulated
			System.out.println("Power check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	default void getConveyorStatus(boolean power) {
		if (power == false) {
			System.out.println("Conveyor check failed");
			System.exit(0);
		}
		System.out.println("\nInitializing conveyor check.....");
		try {
			Thread.sleep(1000);
			System.out.println("Conveyor check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	default void getHeatElementStatus(boolean power) {
		if (power == false) {
			System.out.println("Heat element check failed");
			System.exit(0);
		}
		System.out.println("\nInitializing heater element check.....");
		try {
			Thread.sleep(1000);
			System.out.println("Heat element check good...");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	default void getBatterSensorStatus(boolean power) {
		if (power == false) {
			System.out.println("Batter level sensor check failed");
			System.exit(0);
		}
		System.out.println("\nInitializing batter sensor check.....");
		try {
			Thread.sleep(1000);
			System.out.println("Batter level sensor check good...\n");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static void powerDown() {
		System.out.println("Powering Down....");
		System.exit(0);
	}
	
}
