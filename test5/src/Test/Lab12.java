package Test;

public class Lab12 {

	public static void main(String[] args) {
		int[][] table = new int[3][3];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = i + j;
			}
		}

		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + "");
			}
			System.out.println();
		}
	}

}
