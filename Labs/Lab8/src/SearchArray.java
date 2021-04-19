
public class SearchArray {

	int position = -1;

	public int searchValue(int[] numberArray, int num) {

		for (int i = 0; i < numberArray.length; i++) {

			if (numberArray[i] == num) {
				position = i;
			}
		}

		return position;
	}

}
