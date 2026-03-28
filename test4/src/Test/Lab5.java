package Test;

public class Lab5 {

	public static void main(String[] args) {
		System.out.println("짝수는 건너뛰고 홀수만 출력합니다.");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue; // 짝수는 건너뜀
			}
			System.out.println(i);
		}
	}

}
