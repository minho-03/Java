package Test;

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();

		System.out.println("연산자를 입력하세요: ");
		char op = scanner.next().charAt(0);
		int re;

		switch (op) {
		case '+':
			re = n1 + n2;
			break;
		case '-':
			re = n1 - n2;
			break;
		case '*':
			re = n1 * n2;
			break;
		case '/':
			if (n2 != 0) {
				re = n1 / n2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				scanner.close();
				return;
			}
			break;
		default:
			System.out.println("error");
			scanner.close();
			return;
		}
		System.out.println("결과: "+ re);
		scanner.close();
	}

}
