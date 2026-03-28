package Test;

import java.util.Scanner;

public class Lab8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean keepPlaying = true;

		System.out.println("===숫자 퀴즈 게임===");
		System.out.println("숫자를 입력하세요(1~5)");
		System.out.println("0을 입력하면 게임이 종료됩니다.");

		while (keepPlaying) {
			System.out.println("\n숫자를 입력하세요: ");
			int userNumber = scanner.nextInt();

			switch (userNumber) {
			case 1:
				System.out.println("1번! 오늘은 행운의 날입니다!");
				break;
			case 2:
				System.out.println("2번! 좋은 일이 곧 생길 거예요.");
				break;
			case 3:
				System.out.println("3번! 웃음을 잃지 마세요!");
				break;
			case 4:
				System.out.println("4번! 새로운 도전을 시작해보세요.");
				break;
			case 5:
				System.out.println("5번! 주변 사람들에게 감사의 마음을 전해보세요.");
				break;
			case 0:
				System.out.println("게임을 종료합니다. 다음에 또 만나요!");
				keepPlaying = false; // 반복문 종료
				break;
			default:
				System.out.println("잘못된 숫자입니다. 1~5 사이의 숫자를 입력해주세요.");
			}
		}
	}
}
