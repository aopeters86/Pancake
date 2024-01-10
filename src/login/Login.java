package login;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Login {
	
//	public String user;
	
	public static void login() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your employee ID to continue");
		String userIn = input.nextLine();	
//		this.user = userIn;
		boolean unauth =readFile(userIn);//so far this returns a boolean
		if(unauth==false) {
			login();
		}
	}
	//change below to private after test complete, remove static
	private static boolean readFile(String user) throws FileNotFoundException {
		
		java.io.File file = new java.io.File("users.txt");
		Scanner rootfile = new Scanner(file).useDelimiter("/t");
		String userIn = "";
		boolean returnBool = false;
		
		
		while(rootfile.hasNextLine()) {
			String linein = rootfile.nextLine();
			String[] empid = linein.split("\t");
			if((empid.length == 2 && empid[0].equals(user))) {
				returnBool = true;
				userIn = empid[1];
				int returnNum = Integer.valueOf(empid[0]);
				System.out.println("Welcome to the Pancake Maker 3000 " + userIn);
				
				rootfile.close();
				return returnBool;
				}
			
			
		
		//else return null
	}
		System.out.println("Unauthorized User, returning to login");
		rootfile.close();
//		login();
		return returnBool;
	
	
	
	
	
	}
}



//use path to find the file in the root
//		Path filePath = Paths.get("users.txt");