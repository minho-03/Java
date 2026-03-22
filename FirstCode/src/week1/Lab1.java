package week1;

import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();			// "hycu"
		String address = scanner.next();		// "seoul"
		int age = scanner.nextInt();			// 23
		double score = scanner.nextDouble();	// 99.9
		boolean gradu = scanner.nextBoolean();	// false
		
		System.out.println("name:"+name+" address:"+address);
		scanner.close();
	}

}
