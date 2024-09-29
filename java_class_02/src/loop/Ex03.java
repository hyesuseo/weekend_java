package loop;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//반복적으로 입력받는 loop 만들기

		Scanner scan = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i <= 5; i++) {
			
			System.out.print(i + "번째 정수를 입력: ");
			num = scan.nextInt();
			sum += num; //num+sum해서 sum에 대입하라는 뜻!
			//num= 1,2,3,4,5일 경우
			//1번째 정수: 1 ->sum = 0+1=1
			//2번째 정수: 2 -> sum= 1+2=3
			//3번째 정수: 3 -> sum = 3+3=6
			//4번째 정수: 4 -> sum = 6+4 =10
			//5번째 정수: 5 -> sum = 10 +5= 15
			System.out.println(i + "번째 합계 : " + sum);
		}
		
	}

}
