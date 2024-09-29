package condition;

import java.util.Scanner;

public class PT04 {

	public static void main(String[] args) {
		System.out.println("--nested switch문 실습--");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int i = sc.nextInt();
		int j = sc.nextInt();
		switch(i) {
		case 0 :
			switch (j) {
				case 0:
					System.out.println("i=0, j=0"); break;
				case 1:
					System.out.println("i=0, j=1"); break;
				default:
					System.out.println("내포된 default case");
					}
			break;
		default:
			System.out.println("case에서 발견되지 않았음");
		}
			System.out.println();
		
		
	}

}
