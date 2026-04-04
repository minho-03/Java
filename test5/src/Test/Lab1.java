package Test;

public class Lab1 {

	public static void main(String[] args) {
		int[] array2 = new int[] { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int i : array2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);

	}

}
