package lab10;

public class Cat implements Animal {

	@Override
	public void eats(String food) {
		// TODO Auto-generated method stub
		System.out.println("The Cat ate " + food);
		
	}

	@Override
	public void makesNoise(String noise) {
		// TODO Auto-generated method stub
		System.out.println("The cat made the sound " + noise);
	}

}
