package lab10;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal spot = new Dog();
		spot.eats("Bone");
		spot.makesNoise("Ruf Ruf!");
		
		
		Animal lucy = new Cat();
		lucy.eats("Fish");
		lucy.makesNoise("Meow Meow!");
	}

}
