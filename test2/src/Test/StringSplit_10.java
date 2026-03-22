package Test;

public class StringSplit_10 {

	public static void main(String[] args) {
		String text = "사과,바나나,딸기";
		String[] fruits = text.split(","); // 쉼표로 문자열 나누기
		
		System.out.println("과일 목록:");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
