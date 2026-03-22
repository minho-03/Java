package Test;

public class StringSubstring_6 {

	public static void main(String[] args) {
		String text = "HanyangCyberUniv!";
		String t1 = text.substring(0,7);	 //0~6
		String t2 = text.substring(7); 		 //
		
		System.out.println("부분 문자열 1: " + t1);
		System.out.println("부분 문자열 2: " + t2);
	}

}
