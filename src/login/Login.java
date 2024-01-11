package login;

import java.io.FileNotFoundException;
import java.util.Scanner;

import initialization.LoginSatisfied;
import initialization.MachineInitialization;

public class Login implements MachineInitialization{
	

	private static String userName = "";
	
	public static void login() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your employee ID to continue");
		String userIn = input.nextLine();	
		boolean auth =readFile(userIn);
		if(auth==false) {
			reTry();
		}else {
			LoginSatisfied.userSelection(auth, userName);
		}
		
	}
	private static boolean readFile(String user) throws FileNotFoundException {
		
		java.io.File file = new java.io.File("users.txt");
		Scanner rootfile = new Scanner(file).useDelimiter("/t");
		boolean returnBool = false;
		while(rootfile.hasNextLine()) {
			String linein = rootfile.nextLine();
			String[] empid = linein.split("\t");
			if((empid.length == 2 && empid[0].equals(user))) {
				returnBool = true;
				userName = empid[1];				
				}
	}
		if(returnBool == false) {
		reTry();
		}
		rootfile.close();
		return returnBool;
	}

	private static String reTry() throws FileNotFoundException {
		System.out.println("1 to try again, 2 to power off");
		Scanner powerOff = new Scanner(System.in);
		int userIn = powerOff.nextInt();
		if(userIn == 1) {
			login();
		}
		if(userIn == 2) {
			MachineInitialization.powerDown();
		}
		if(userIn != 1 || userIn != 2) {
			reTry();
		}
		return null;
	}
}
