package batter;

public class BatterBag {

	/*
	 * this will need some way to send back an int 
	 */
	static int currentQty;
	
	public static int batterBag(){
		
		int batterQty = ((int) (Math.random() * 100) + 1);

		
		if(batterQty < 2) {
			System.out.println("\nBatter qty is below 2, change batter bag");
		
		}
		
		currentQty = batterQty;
		
		return batterQty;
	}
	
//	public static int changeBatterBag(int currentQty) {
//		
//		
//		
//	}
	
	
	
	
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