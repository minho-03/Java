package Test;

public class Lab6 {

	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) { // 단을 반복 (2단~9단)
			System.out.println(i + "단:");

			for (int j = 1; j <= 9; j++) { // 각 단의 곱셈 반복(1~9)
				System.out.println(i + "x" + j + "=" + (i * j));
			}

			System.out.println(); // 각 단 사이에 줄바
		}
	}

}
