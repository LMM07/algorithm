package level4;

import java.util.Scanner;

public class B2577 { //multi 숫자를 하나씩 배열에 넣고 카운트하기??

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] abc = new int[3];
		
		for(int i=0; i<3; i++) {
			abc[i] = scanner.nextInt();
		}
		
		int multi = abc[0]*abc[1]*abc[2];
		
		System.out.println(multi);
		
		for(int i=0; ; i++) {
			
		}
		
	}

}
