package Test;

public class Lab15 {

	public static void main(String[] args) {
		double testScore[][] = { { 99, 100 }, { 88, 98 }, { 100, 100 }, { 99, 100 } };
		double totalSum = 0;

		// 전체 점수 합 계산
		for (int i = 0; i < testScore.length; i++) {
			for (int j = 0; j < testScore[i].length; j++) {
				totalSum += testScore[i][j];
			}
		}
		// 행과 열 개수로 학기 수 계산
		int numOfSemesters = testScore.length * testScore[0].length;

		// 평균 계산
		double average = totalSum / numOfSemesters;

		// 결과 출력
		System.out.println("전체 점수의 합: " + totalSum);
		System.out.println("전체 점수의 평균: " + average);

	}

}
