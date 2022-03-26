package level4;

import java.util.Scanner;

public class B2562 { //변수 maxNum만들기 + 배열의 범위

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[9];
		
		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}
		
		int max = array[0];
		int maxNum = 1;
		
		for(int i=1; i<array.length; i++) {
			
			if(max < array[i]) {
				max = array[i];
				maxNum = 1+i;
			}
		}
		System.out.println(max);
		System.out.println(maxNum);
		
	}

}
