package Test;

public class StringCharAt_4 {

	public static void main(String[] args) {
		String text = "hycu_Good";
		char firstChar = text.charAt(0); // 첫 번째 문자
		char lastChar = text.charAt(text.length() - 1); // 마지막 문자
		
		System.out.println("첫 번째 문자: " + firstChar);
		System.out.println("마지막 문자: " + lastChar);
	}

}
