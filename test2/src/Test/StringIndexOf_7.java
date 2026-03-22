package Test;

public class StringIndexOf_7 {
	
	public static void main(String[] args) {
		String text = "Hello, hycu!";
		int index = text.indexOf("hycu");
		
		if(index != -1) {
			System.out.println("\"hycu\"는 " + index + "번째 인덱스에 있습니다.");
		} else {
			System.out.println("문자열에 \"hycu\"가 없습니다.");
		}
	}

}
