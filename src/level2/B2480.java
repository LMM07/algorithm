package level2;

import java.util.Scanner;

public class B2480 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if(x==y && y==z) {
			System.out.println(10000+(x*1000));
		} else if(x==y || x==z) {
			System.out.println(1000+(x*100));
		} else if(y==z) {
			System.out.println(1000+(y*100));
		} else {
			System.out.println((Math.max(Math.max(x, y),z)*100));
		}
			
		
//		처음 작성한 코드. 답은 맞게 나오지만 너무 지저분하다.
//		if(x==y) {
//			if(x==z) {
//				System.out.println(10000+(x*1000));
//			} else {
//				System.out.println(1000+(x*100));
//			}
//		} else if(x==z) {
//			System.out.println(1000+(x*100));
//		} else {
//			int max = x;
//			if(y>max) {
//				max = y;
//			} else if(z>max) {
//				max = z;
//			}
//			System.out.println(max*100);
//		}
	}
}
