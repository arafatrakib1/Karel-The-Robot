import stanford.karel.SuperKarel;

public class try1 extends SuperKarel {
	public void run() {
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
		turnLeft();
		move();
		turnLeft();
		pickBeeper();
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
		turnRight();
		move();
		turnRight();
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
		turnLeft();
		move();
		turnLeft();
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
		west();
	}
	private void west() {
		turnRight();
		move();
		turnRight();
		for (int k = 0; k < 9; k++) {
			move();
			if (beepersPresent()) {
				pickBeeper();
			}
		}
	}
}