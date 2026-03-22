package Test;

import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키(cm)를 입력하세요: ");
		double height = scanner.nextDouble() / 100; //cm -> m 변환
		
		System.out.println("몸무게(kg)를 입력하세요: ");
		double weight = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		if(bmi < 18.5) {
			System.out.println("저체중입니다.");
		} else if(bmi < 24.9) {
			System.out.println("정상 체중입니다.");
		} else if(bmi <29.9) {
			System.out.println("과체중입니다.");
		} else {
			System.out.println("비만입니다.");
		}
		
		scanner.close();
	}

}
