package Test;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = scanner.nextInt();

		if (age >= 0 && age < 20) {
			System.out.println("청소년입니다.");
		} else if (age >= 20 && age < 60) {
			System.out.println("성인입니다.");
		} else if (age >= 60) {
			System.out.println("노인입니다.");
		} else {
			System.out.println("올바른 나이를 입력하세요.");
		}
		scanner.close();
	}

}
