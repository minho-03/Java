package Test;

public class Lab11 {

	public static void main(String[] args) {
		int[][] testArray = new int[3][];
		testArray[0] = new int[2];
		testArray[1] = new int[3];
		testArray[2] = new int[4];

		for (int i = 0; i < testArray.length; i++) {
			System.out.println(testArray[i].length);
		}
	}

}
