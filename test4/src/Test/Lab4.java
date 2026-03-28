package Test;

public class Lab4 {

	public static void main(String[] args) {
		System.out.println("숫자 출력(7을 만나면 멈춥니다.");

		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				System.out.println("7을 만났습니다! 반복을 종료합니다.");
				break; // 반복 종료
			}
			System.out.println(i);
		}
	}

}
