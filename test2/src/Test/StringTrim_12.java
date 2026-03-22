package Test;

public class StringTrim_12 {

	public static void main(String[] args) {
		String text = " Hello,hycu! ";
		String trimmedText = text.trim(); // 양쪽 공백 제거
		
		System.out.println("원본 문자열 : [" + text + "]");
		System.out.println("공백 제거된 문자열 : [" + trimmedText + "]");
	}

}
