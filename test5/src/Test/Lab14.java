package Test;

public class Lab14 {

	public static void main(String[] args) {
		// 배열 선언 및 초기화
		int[] testArray3 = { 10, 20, 30, 40, 50 };

		// 합계를 저장할 변수
		int sum = 0;

		// 배열의 원소를 더함
		for (int i = 0; i < testArray3.length; i++) {
			sum += testArray3[i];
		}
		// 결과 출력
		System.out.println("배열의 모든 원소의 합: " + sum);
	}

}
