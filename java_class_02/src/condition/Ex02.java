package condition;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		//정수 하나를 입력받아 if~ else 문을 사용하여
		//짝수인지 홀수인지 출력하기
		
		System.out.println("정수를 입력 :");
		int num = scan.nextInt(); 
		if(num % 2 == 0) {
			System.out.println("짝수입니다");
		}else {
			System.out.println("홀수입니다");
		}

		// if~else~if 문을 사용하여
		// 정수가 3의 배수인지, 5의 배수인지 알아보기
		
		System.out.println();
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수입니다");
		}else {
			System.out.println("3과 5의 배수가 아닙니다.");
		}
		
	}

}
