package array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int[] array = new int[5]; // 배열생성

		
		for(int i = 0; i <array.length; i++) {
			System.out.print(i+1 + "번째 정수 입력: ");
			array[i] = input.nextInt(); //반복적으로 입력을 받아서 배열 각 요소에 저장하기
		}
		//for 문을 사용해서 배열의 각 요소를 출력하기 = 3의 배수만 출력하기
		for(int i = 0; i<5; i++) {
			
			if(array[i]%3==0) {
				System.out.println(array[i]);
			}else {
				System.out.println("올바르지 않은 접근입니다");
			}
		}
	}

}
