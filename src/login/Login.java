package login;

import java.io.FileNotFoundException;
import java.util.Scanner;

import initialization.LoginSatisfied;
import initialization.MachineInitialization;

public class Login implements MachineInitialization {

	private static String userName = "";
	private static int wrongLogin = 0;

	public static boolean login() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your employee ID to continue");
		String userIn = input.nextLine();
		boolean auth = readFile(userIn);
		if (auth) {
			LoginSatisfied.userSelection(auth, userName);
		}
		else if (!auth) {
			 wrongLogin += 1;
			 if(wrongLogin < 4) {
			reTry();
		}else {
			System.out.println("Too many attempts, powering off");
			MachineInitialization.powerOff();
		}
		
		}
		return auth;

	}

	private static void reTry() throws FileNotFoundException {
		int wrongInputCount = 0;
		System.out.println("1 to try again, 2 to power off");
		Scanner powerOff = new Scanner(System.in);
		int userIn = powerOff.nextInt();
		if (userIn == 1) {
			login();
		}
		if (userIn == 2) {
			MachineInitialization.powerOff();
		}
		if (userIn != 1 && userIn != 2) {
			reTry();
		}
	}

	private static boolean readFile(String user) throws FileNotFoundException {

		java.io.File file = new java.io.File("users.txt");
		Scanner rootfile = new Scanner(file).useDelimiter("/t");
		boolean returnBool = false;
		while (rootfile.hasNextLine()) {
			String linein = rootfile.nextLine();
			String[] empid = linein.split("\t");
			if ((empid.length == 2 && empid[0].equals(user))) {
				returnBool = true;
				userName = empid[1];
				break;
			}
		}
		rootfile.close();
		return returnBool;
	}
}
