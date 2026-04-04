package Test;

public class Lab4 {

	public static void main(String[] args) {
		int testArray[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int sum = 0;
		for (int i = 0; i < testArray.length; i++) {
			for (int j = 0; j < testArray[i].length; j++)
				sum = sum + testArray[i][j];
		}
		System.out.println(sum);
	}

}
