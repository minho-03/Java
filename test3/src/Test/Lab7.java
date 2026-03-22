package Test;

import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("현재 온도를 입력하세요(C): ");
		int temperature = scanner.nextInt();
		if(temperature >= 30) {
			System.out.println("반팔과 반바지를 추천합니다.");
		} else if(temperature >=20) {
			System.out.println("가벼운 긴팔을 입는 것이 좋겠어요.");
		} else if(temperature >= 10) {
			System.out.println("가디언이나 얇은 자켓을 추천합니다.");
		} else {
			System.out.println("두꺼운 외투와 목도리를 준비하세요.");
		}
		scanner.close();
	}

}
