package start;

import initialization.MachineInitialization;

public class Run{

	public static void start(boolean loginauthorized, boolean power) {
		if(loginauthorized && power) {
			MachineInitialization.getConveyorStatus(power);
			MachineInitialization.getHeatElementStatus(power);
			MachineInitialization.getBatterSensorStatus(power);
		}
	}
	
	
	
	
}


////simulates changing bag 
//try {
//	Thread.sleep(2000);
//} catch (InterruptedException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//batterQty = 100;
//System.out.printf("\nBatter bag changed, %d pancakes can be made", batterQty);