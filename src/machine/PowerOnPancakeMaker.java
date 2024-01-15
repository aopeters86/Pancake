package machine;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Logger;

import initialization.BatterInitialization;
import initialization.MachineInitialization;
import login.Login;
import start.Run;

public class PowerOnPancakeMaker extends Run implements MachineInitialization, BatterInitialization {

	public static int currentQty;

	Logger logger = Logger.getLogger(PowerOnPancakeMaker.class.getName());

	public PowerOnPancakeMaker() throws FileNotFoundException {
		powerOn();
	}

	public void powerOn() {
		Scanner powerUp = new Scanner(System.in);
		System.out.println("Power on? Y for yes N for No");
		String userIn = powerUp.nextLine();
		if (userIn.equalsIgnoreCase("N")) {
			logger.info("System is off");
			System.exit(0);
		}
		if (userIn.equalsIgnoreCase("Y")) {
//			MachineInitialization.powerOn();
			System.out.println("Powering on...");
			try {
				Login.login();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentQty = getBatterStatus();
			selectMode(currentQty);
		} else {
			powerOn();
		}

	}
}
