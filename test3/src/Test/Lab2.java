package Test;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("요일에 해당하는 숫자를 입력하세요(1~7):");
		int day = scanner.nextInt();

		switch (day) {
		case 1:
			System.out.println("월요일입니다.");
			break;
		case 2:
			System.out.println("화요일입니다.");
			break;
		case 3:
			System.out.println("수요일입니다.");
			break;
		case 4:
			System.out.println("목요일입니다.");
			break;
		case 5:
			System.out.println("금요일입니다.");
			break;
		case 6:
			System.out.println("토요일입니다.");
			break;
		case 7:
			System.out.println("일요일입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		scanner.close();
	}

}
