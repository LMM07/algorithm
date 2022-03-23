package level2;

import java.util.Scanner;

public class B9498 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade = ' ';
		
		if(score >= 90) {
			grade = 'A';
			System.out.println(grade);
		} else if(score >= 80) {
			grade = 'B';
			System.out.println(grade);
		} else if(score >= 70) {
			grade = 'C';
			System.out.println(grade);
		} else if(score >= 60) {
			grade = 'D';
			System.out.println(grade);
		} else {
			grade = 'F';
			System.out.println(grade);
		}
		
	}

}
