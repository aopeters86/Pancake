package initialization;

public interface BatterInitialization {
	
		
	default int getBatterStatus() {
		int batterQty = ((int) (Math.random() * 100) + 1);
		if(batterQty < 3){
			System.out.println("\nBatter qty is below 3, changing batter bag");
			return newBag();
		}
		System.out.println("Power up batter qty is " + batterQty);
		return batterQty;
	}
	
	 static int newBag(){
		return 100;
	}
	
	
	
}
