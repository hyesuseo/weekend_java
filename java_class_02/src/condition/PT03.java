package condition;

import java.util.Scanner;

public class PT03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print("당신의 혈액형은: ");
		String type = sc.next();
		
		switch(type) {
		case "A":
			System.out.println("당신은 A형입니다");
			break;
		case "B":
			System.out.println("당신은 B형입니다");
			break;
		case "O":
			System.out.println("당신은 O형입니다");
			break;
		case "AB":
			System.out.println("당신은 AB형입니다");
			break;
		default:
		System.out.println("모든 혈액형은 소중합니다");
			
		}

	}

}
