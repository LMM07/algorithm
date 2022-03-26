package level4;

import java.util.Scanner;

public class B10818 { //for문 조건식을 잘못줘서 헤맸던 문제. <= 잘쓰기

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int num[] = new int[N];
		
		for(int i=0; i<N; i++) {
			num[i] = scanner.nextInt();
		}

		int max = num[0];
		int min = num[0];
		
		for(int i=1; i<N; i++) {
			
			if(max < num[i]) {
				max = num[i];
			} else if(min > num[i]) {
				min = num[i];
			}
		}
		
		System.out.println(min + " " + max);

	}

}
