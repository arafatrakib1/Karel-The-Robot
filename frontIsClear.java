import stanford.karel.SuperKarel;

public class frontIsClear extends SuperKarel {
	public void run() {
		while(frontIsClear()){
			if(beepersPresent()){
				;
			} else {
				putBeeper();
			}
			putBeeper();
		}
	}
}