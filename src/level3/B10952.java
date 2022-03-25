package level3;

import java.util.Scanner;

public class B10952 { //A와 B를 입력받아 A+B를 출력하기 -> 반복문을 몇번 돌려야할 지 모르겠음

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int A;
		int B;
		
		while(true) {
			A = scanner.nextInt();
			B = scanner.nextInt();
			
			if(A==0 && B==0) {
			break; 
			}
		System.out.println(A+B);
		} 
		
	}

}
