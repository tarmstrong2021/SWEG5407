
public class TestClock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Clock clock1 = new Clock();
		clock1.setTime(23, 59, 59);
		
		Clock clock2 = new Clock(12, 59, 58);
		
		clock1.printTime();
		clock2.printTime();
		
		clock2.incrementSecs();
		clock1.printTime();
		
		System.out.println(clock1.equals(clock2));
		
		clock2.makeCopy(clock1);
		
		clock2.printTime();
	}

}
