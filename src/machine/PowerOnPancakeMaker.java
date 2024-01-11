package machine;
import java.io.FileNotFoundException;

import initialization.BatterInitialization;
import initialization.MachineInitialization;
import login.Login;
import start.Run;

public class PowerOnPancakeMaker extends Run implements MachineInitialization, BatterInitialization{
	
	public static int currentQty;
		
	public PowerOnPancakeMaker(boolean power) throws FileNotFoundException{	
		if(!power) {
			System.exit(0);
		}
		MachineInitialization.powerOn();
		boolean startUp = Login.login();
		currentQty = getBatterStatus();		
		selectMode(currentQty);
	}	
}
