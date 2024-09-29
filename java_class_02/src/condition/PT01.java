package condition;

import java.util.Scanner;

public class PT01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a,b,c,d,e,f,g,h,i,num;
		//1. 단순 if 문 실습
		
		System.out.println("--------단순if문 실습--------");
		a = 9;
		if (a>0) {
			System.out.println("a는 양수입니다");
			System.out.println("a = "+ a);
		
		} System.out.println("종료문");
		System.out.println();
		
		//2. 블록 if문 실습
		System.out.println("------블록if문 실습--------");
		b=9;
		if (b>4) {
			System.out.println("단순 if\n b = " + b);
		}
		int value= 8;
		int count = 10;
		int limit =11;
		System.out.println(++value + "+" + ++count);
		if (++value %2 !=0 || ++count <limit ) {
			System.out.println("\nIf문 안의 값");
			System.out.println(value);
			System.out.println(count);
		}
		System.out.println("\n If문 밖의 값");
		System.out.println(value);
		System.out.println(count);
		System.out.println();
		
		//3. 단순 else if문의 실습
		System.out.println("단순 else if 문의 실습: ");
		c = sc.nextInt();
		
		if (c>20) {
			System.out.println("이 문장은 if문장입니다");
		}else {
			System.out.println("이 문장은 else 문장입니다");
		}
		System.out.println(); //다음줄로 제어를 이동하는 문장
	
		
		System.out.println("---->Else if 실습<-----");
		
		num=sc.nextInt();
		
		if(num/2 ==6) 
			System.out.println(num+"/2=6");

		else
			System.out.println(num + "/2 ="+ num/2);
		
		System.out.println("\n블록 Else if 실습");
		System.out.print("e를 입력: ");
		e=sc.nextInt();
		if (e ==0 ) {
			System.out.println("e는 0이므로");
			System.out.println("이 블록을 통과한다");
		} else {
			System.out.println("e는 0이 아니다");
		}
		System.out.println();
		
	
	}

}
