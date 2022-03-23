package level2;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int H = A + ((B+C)/60);
		int M = B + C;
		
		if(H >= 24) {
			H = H-24;
		}
		if(M >= 60) {
			M = (B+C)%60;
		}
		System.out.println(H + " " + M);
	}

}
