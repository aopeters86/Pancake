package machine;
import java.io.FileNotFoundException;

import initialization.BatterInitialization;
import initialization.MachineInitialization;
import login.Login;

public class PowerOnPancakeMaker implements MachineInitialization, BatterInitialization{
	
	int currentQty;
		
	public PowerOnPancakeMaker(boolean power) throws FileNotFoundException{	
		MachineInitialization.powerOn(power);
		boolean startUp = Login.login();
	}	
}
