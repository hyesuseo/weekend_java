package loop;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int menu; //반복문 사용해서 주문 받는 것 만들기

		do {
			
			System.out.println("---------------------");
			System.out.println("[1]아메리카노 [2]카페라떼");
			System.out.println("[3]오렌지주스 [4]아이스티");
			System.out.println("[5]아인슈페너 [6]주문종료");
			System.out.println("---------------------");
			System.out.println("메뉴를 입력해주세요");
			menu = scan.nextInt();
		
			switch(menu) {
			case 1 :
				System.out.println("아메리카노 주문되었습니다.");
				break;
			case 2 :
				System.out.println("카페라떼 주문되었습니다.");
				break;
			case 3 :
				System.out.println("오렌지주스 주문되었습니다.");
				break;
			case 4 :
				System.out.println("아이스티 주문되었습니다.");
				break;
				
			case 5 : 
				System.out.println("아인슈페너 주문되었습니다.");
				break;
				
			case 6 :
				System.out.println("주문을 종료합니다.");
				break;
				
			default:
				System.out.println("잘못 주문되었습니다.");
			
				
			}
			
		}while(menu != 6);
	}

}
