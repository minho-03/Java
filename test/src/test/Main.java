package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next();
		String address = scanner.next();
		int age = scanner.nextInt();
		double score = scanner.nextInt();
		System.out.println("name:"+name);
		scanner.close();
		
	}

}
