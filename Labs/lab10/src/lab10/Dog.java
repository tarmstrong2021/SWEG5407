package lab10;

public class Dog implements Animal {

	@Override
	public void eats(String food) {
		// TODO Auto-generated method stub
		System.out.println("The Dog ate " + food);
	}

	@Override
	public void makesNoise(String noise) {
		// TODO Auto-generated method stub
		
		System.out.println("The Dog made the sound " + noise);
		
		
	}

}
