package machine;
import java.io.FileNotFoundException;

import initialization.BatterInitialization;
import initialization.MachineInitialization;
import login.Login;

public class PowerOnPancakeMaker implements MachineInitialization, BatterInitialization{
	
	int currentQty;
		
	public PowerOnPancakeMaker(boolean power) throws FileNotFoundException{	

		getPower(power);
		getConveyorStatus(power);
		getHeatElementStatus(power);
		getBatterSensorStatus(power);
		this.currentQty = getBatterStatus();
		Login.login();
	}	
}
