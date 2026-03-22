package Test;

public class StringComparison_5 {

	public static void main(String[] args) {
		String str1 = "Hanyang";
		String str2 = "hanyang";
		boolean isEqual = str1.equals(str2); // 대소문자 구분 비교
		boolean isEquallgnoreCase = str1.equalsIgnoreCase(str2); // 대소문자 무시 비교
		System.out.println("같은 문자열인가?(대소문자 구분):" + isEqual);
		// isEqual은 문자열이 같은 경우 true, 다르면 false를 출력함
		System.out.println("같은 문자열인가?(대소문자 무시):" + isEquallgnoreCase);
		// isEquallgnoreCase은 대소문자를 가리지 않고, 문자열이 같은 경우 true, 다르면 false를 출력
	}

}
