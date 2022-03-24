package level3;

import java.util.Scanner;

public class B11021 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int T = scanner.nextInt();
		int sum = 0;
		
		for(int x = 1; x<=T; x++) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();
			sum = A + B;
			System.out.printf("Case #%d: %d\n", x, sum);
		}
	}

}
