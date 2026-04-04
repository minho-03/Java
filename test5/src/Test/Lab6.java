package Test;

public class Lab6 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 }; // 1
		String[] fruits = { "Apple", "Banana", "Orange", "Grape", "Mango" }; // 2
		int[] scores; // 3
		scores = new int[5]; // 크기만 지정(5개의 요소)

		int[] evenNumbers = new int[5]; // 4
		for (int i = 0; i < evenNumbers.length; i++) {
			evenNumbers[i] = i * 2;
		}
		System.out.println();
	}

}
