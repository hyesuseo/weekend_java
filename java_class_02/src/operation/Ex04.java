package operation;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] agrs ) {
		
		Scanner scan = new Scanner(System.in);
		
		int money, c500, c100, c50, c10;
		
		System.out.print("동전으로 교환할 돈은: ");
		money = scan.nextInt();
		
		c500 = money / 500;
		money %= 500; //500 나눈 다음에 머니 값을 다시 나머지로 설정해주면 아래에서 나머지로만 갖고 계산가능!^^
		c100 = money / 100;
		money %= 100;
		c50 = money / 50;
		money %= 50; 
		c10 = money / 10; 
		money %= 10;
		
		
		
		System.out.println("오백원 동전 : " + c500 + "개");
		System.out.println("백원 동전 : " + c100 + "개");
		System.out.println("오십원 동전 : " + c50 + "개");
		System.out.println("십원 동전 : " + c10 + "개");
		System.out.println("바꾸지 못한 잔돈 : " + money + "원");
		
	}
}
