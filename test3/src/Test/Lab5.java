package Test;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 (0~100): ");
		
		int score = scanner.nextInt();
		if(score>=90) {
			System.out.println("A 학점입니다.");
		} else if(score>=80) {
			System.out.println("B 학점입니다.");
		} else if(score>=70) {
			System.out.println("C 학점입니다.");
		} else if(score>=60) {
			System.out.println("D 학점입니다.");
		} else {
			System.out.println("F 학점입니다.");
		}
		scanner.close();
	}

}
