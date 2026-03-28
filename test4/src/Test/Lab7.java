package Test;

import java.util.Random;
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int targetNumber = random.nextInt(100) + 1; // targetNumber(1~100)
		int userGuess = 0;
		int attempts = 0;
		System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다!");
		System.out.println("1부터 100까지의 숫자 중에서 하나를 맞춰보세요.");

		while (userGuess != targetNumber) {
			System.out.println("숫자를 입력하세요: ");
			userGuess = scanner.nextInt();
			attempts++;
			if (userGuess < targetNumber) {
				System.out.println("더 큰 숫자입니다!");
			} else if (userGuess > targetNumber) {
				System.out.println("더 작은 숫자입니다!");
			} else {
				System.out.println("정답입니다! 시도 횟수: " + attempts);
			}
		}
		scanner.close();
	}

}
