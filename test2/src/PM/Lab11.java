package PM;

import java.util.Scanner;

public class Lab11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 학생 이름 입력
		System.out.println("학생 이름을 입력하세요: ");
		String name = scanner.nextLine();
		
		// 각 과목 점수 입력
		System.out.println("국어 점수를 입력하세요: ");
		int korean = scanner.nextInt();
		
		System.out.println("영어 점수를 입력하세요: ");
		int english = scanner.nextInt();
		
		System.out.println("수학 점수를 입력하세요: ");
		int math = scanner.nextInt();
		
		// 총점 계산 (산술 연산자 사용)
		int total = korean + english + math;
		
		// 평균 계산 (산술 연산자 사용)
		float average = total / 3.0f;
		
		// 학점 계산 (조건 연산자 사용)
		char grade = (average >= 90) ? 'A':
					(average >= 80) ? 'B':
					(average >= 70) ? 'C':
					(average >= 60) ? 'D': 'F';
		
		// 출력 (비교 연산자 사용)
		System.out.println("\n=====성적표=====");
		System.out.println("학생 이름: " + name);
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		
		if(grade != 'F') {
			System.out.println("학점: " + grade);
			System.out.println("결과: 합격");
		} else {
			System.out.println("학점: " + grade);
			System.out.println("결과: 불합격");
		}
		scanner.close();
	}

}
