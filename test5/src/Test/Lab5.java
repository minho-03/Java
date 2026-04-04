package Test;

public class Lab5 {

	public static void main(String[] args) {
		// 과일 이름을 저장하는 1차원 배열 선언 및 초기화
		String[] fruits = { "Apple", "Banana", "Orange", "Grape", "Mango" };

		// 배열 요소 출력
		for (int i = 0; i < fruits.length; i++) {
			System.out.println("Fruit " + (i + 1) + ": " + fruits[i]);
		}
	}

}
