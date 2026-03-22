package Test;

import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("태어난 달을 숫자로 입력하세요(1~12): ");
		int month = scanner.nextInt();
		if (month == 1 || month == 2 || month == 3) {
			System.out.println("새로운 시작이 기다리고 있습니다!");
		} else if (month == 4 || month == 5 || month == 6) {
			System.out.println("행운이 가득한 계절이 다가옵니다.");
		} else if (month == 7 || month == 8 || month == 9) {
			System.out.println("도전과 성취의 시기가 찾아올 거예요.");
		} else if (month == 10 || month == 11 || month == 12) {
			System.out.println("평온과 성찰의 시간이 다가옵니다.");
		} else {
			System.out.println("올바른 달을 입력하세요!");
		}
		scanner.close();
	}

}
