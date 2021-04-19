
public class UseSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = { 10, 22, 32, 12, 11 };
		int num = 11;

		SearchArray sarray = new SearchArray();

		if (sarray.searchValue(numArray, num) == -1) {

			System.out.println("The number " + num + " is not present in this array.");
		} else

			System.out.println(
					"The number " + num + " is present at position " + sarray.searchValue(numArray, num) + ".");

	}

}
