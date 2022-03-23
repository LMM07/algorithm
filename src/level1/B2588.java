package level1;

import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		
		int x = B%10;
		int y = (int)((B%100)*0.1);
		int z = B/100;
		
		System.out.println(A*x);
		System.out.println(A*y);
		System.out.println(A*z);
		System.out.println(A*B);
		
	}

}
