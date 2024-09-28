package loop;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//while 문
		
		int i = 0;
		
		while(i<5)
		{
			System.out.println("while문 안입니다. i =" + i);
			i++;
		}
		System.out.println("while문을 나왔습니다.. i = " + i);
	
		System.out.println();
		
	Scanner scan = new Scanner(System.in);
	System.out.println("10 + 20의 정답을 입력해주세요");
	System.out.println("정답: ");
	int num = scan.nextInt();
	//정답을 맞출 때까지 계속해서 입력받고 싶을때
	
	while(num !=30) {
		System.out.println("틀렸습니다.");
		System.out.println("10 + 20의 정답을 입력해주세요");
		System.out.println("정답: ");
		num = scan.nextInt();
	}
	System.out.println("정답입니다.");
	System.out.println("입력하신 정답 : " + num);
	}

}
