package Test;

public class StringExample_13 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("hycu");
		
		String result = str1 + " "+ str2;
		System.out.println(result);
		
		boolean isEqual = str1.equals("Hello");
		System.out.println("문자열이 동일한가? " + isEqual);
		System.out.println("문자열 길이: " + str2.length());
		System.out.println("첫 번째 문자: " + str2.charAt(0));
	}

}
