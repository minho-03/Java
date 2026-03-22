package PM;

public class Lab4 {

	public static void main(String[] args) {
		int a = 5; //0101
		int result = ~a; //1010(10진수로 -6)
		System.out.println(result); //출력: -6
	}

}

/*
 * a=5(0101)
 * ~a = (1010)
 * -6
 * 1010 -> 2의 보수 -> 10
 * 1) 모두반전
 * 2) +1
 * 0101
 * 0110 => 4*1 + 2*1 => -6
 * */
