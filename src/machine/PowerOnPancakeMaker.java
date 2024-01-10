package machine;
import java.io.FileNotFoundException;

import initialization.BatterInitialization;
import initialization.MachineInitialization;
import login.Login;

public class PowerOnPancakeMaker implements MachineInitialization, BatterInitialization {
	
	int currentQty;
		
	public PowerOnPancakeMaker(boolean power) throws FileNotFoundException{	

		getPower(power);
		getConveyorStatus(power);
		getHeatElementStatus(power);
		getBatterSensorStatus(power);
		this.currentQty = getBatterStatus();
		Login.login();
		//after login i need a way to have a selecton or 
		
		//100 pancakes is the array or whatever starting qty is, one is printed as a 'O'
		
		//single, 3 rd burst, full auto
		//change batterbag random stuff, dont need to divide etc..
		//login for pancake maker, use hashmap or binary search tree?? cool for dsa
		//change sensor check fail to reset the check, or rerun the check, not system exit
	}	
}
