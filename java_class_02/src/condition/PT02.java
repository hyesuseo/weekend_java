package condition;

import java.util.Scanner;

public class PT02 {

	public static void main(String[] args) {
		// 1. nested if 문 = if 문 중첩 // 비규칙적인 요소를 비교하는데 복잡한 환경
		
		Scanner sc= new Scanner(System.in);
		System.out.print("a값을 입력: ");
		int a = sc.nextInt();
		
		if(a>5) {
			if(a%2==0) {
				System.out.println("a는 5보다 큰 짝수입니다");
			} else {
				System.out.println("a는 5보다 큰 홀수입니다");
			}
		} else {
			System.out.println("a는 5보다 크지 않습니다");
			
		}
		
		System.out.println();
		// 2. if else if문은 규칙적인 요소를 제공한다
		System.out.print("지금은 몇 월?");
		int month = sc.nextInt();
		
		String season;
		if (month == 12 || month == 1 || month == 2) {
			season = "겨울";
		} else if (month ==3 || month ==4 || month ==5) {
			season = "봄";
		} else if (month ==6 || month ==7 || month ==8) {
			season = "여름";
		} else if (month == 9 || month ==10 || month ==11) {
			season = "가을";
		}
			else
				season = "계절이 지정 안 됨!";

	System.out.println(month + "월은 "+ season + "입니다.");
	}

}


