package start;

import java.util.Scanner;

import initialization.BatterInitialization;
import initialization.MachineInitialization;

public class Run implements BatterInitialization{
	static int runQty;

	public static void start(boolean loginauthorized, boolean power) {
		if (loginauthorized && power) {
			MachineInitialization.getConveyorStatus(power);
			MachineInitialization.getHeatElementStatus(power);
			MachineInitialization.getBatterSensorStatus(power);
		}
	}

	public static void selectMode(int qty) {
		runQty = qty;
		Scanner mode = new Scanner(System.in);
		System.out.println("Choose a mode: \n1 for Single\n2 for 3 round burst\n3 for full auto\n");
		int selectMode = mode.nextInt();
		if(selectMode == 1|| selectMode == 2||selectMode == 3) {
		switch (selectMode) {
		case 1:
			single();
			break;
		case 2:
			threeRoundBurst();
			break;
		case 3:
			fullAuto();
			break;
		}
	}else {
		selectMode(qty);
	}
		
	}

	private static void single() {
//		System.out.println(runQty);
		System.out.println("Here comes your pancake:\n\nO");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		runQty -= 1;
		System.out.println("\n" + runQty + " Pancakes left\n");
		endOfRun();

	}

	private static void threeRoundBurst() {
//		System.out.println(runQty);
		System.out.println("\nHere comes your three pancakes\n");
		for (int i = 0; i < 3; i++) {
			System.out.print("O ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		runQty -=3;//update after loop
		System.out.println("\n"+runQty + " Pancakes left\n");
		endOfRun();
	}

	private static void fullAuto() {
		
		System.out.println("Here comes your "+runQty+" pancakes!\n");
		for (int i = 0; i < runQty; i++) {
			System.out.print("O ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		runQty = 0;
		System.out.println("\n");
		endOfRun();
	}

	private static void endOfRun() {
		if(runQty < 3) {
			runQty = BatterInitialization.newBag();
		}
		System.out.println("You can make "+ runQty +" pancakes\n");
		Scanner end1 = new Scanner(System.in);
		System.out.println("Enjoy your pancake(s), select 1 to make more or 2 to power off");
		int userIn = end1.nextInt();
		if (userIn == 1) {
			selectMode(runQty);
		}
		if (userIn == 2) {
			MachineInitialization.powerOff();
		}
		
		if(userIn != 1 || userIn != 2) {
			endOfRun();
		}
	}

}
