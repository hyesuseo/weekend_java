package loop;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//반복적으로 입력받는 loop 만들기

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.println(i + "번째 정수를 입력: ");
			num = scan.nextInt();
			sum += num;
			System.out.println(i + "번째 합계 : " + sum);
		}
		
	}

}
