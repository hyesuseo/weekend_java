package array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		int temp =0;
		//5개의 숫자를 입력받아, 작은 수부터 나열하기
		// 배열 for문 if문 scanner 사용
		
		for(int i= 0; i <5; i++) {
			System.out.print(i+1+"번째 숫자: ");
			num[i]=scan.nextInt();
			
		}
		// 이중 for문, if문, temp 변수를 사용하여 --> 0번째와 나머지를 싹 다 비교를 하라는 것
		// 0번째와 1번째 비교해서 0번째가 더 크면, 자리를 바꿔줌 --> 이게 이해가 잘 안됨
		// 배열의 각 요소를 순서대로 작은 순서부터 만들기
		// num[0] 부터 차례대로. -> 문제가 무슨말인지 이해가 안됨ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
		// num 0,1,2,3,4 -> 0을 가장 작은 수로 만들어야?
	for(int i = 0; i <5; i++) {
		for(int j= i+1; j<5; j++ ) //초기화는 i보다 하나 큰 식으로 작성한다
		//	System.out.println("i: "+i+",j: "+j); 여기까지 하면 0가 1이면 j는 1,2,3,4,
			if(num[i]>num[j]) {
				//교환은 temp 변수를 매개체로 사용하여 교환할 수 있다.
				temp = num[i];
				num[i] = num[j];
				num[j] = temp;
			}
		}

	System.out.printf("작은 수로 정렬: %d, %d, %d, %d, %d\n", num[0], num[1], num[2], num[3], num[4]);
	}


	}
	

