package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		int sum=0;
		double avg = 0.0;
		
		for(int i=0; i <score.length; i++) {
			System.out.print(i+1 + "번째 학생의 점수입력:" );
			score[i]= input.nextInt();
			sum += score[i]; // score 도 더해져야 하므로 for문안에 들어가야함!
			
		}
		// sum = score[0]+score[1]+score[2]+score[3]+score[4]; 이거보다도
		// avg = (score[0]+score[1]+score[2]+score[3]+score[4])/5
		avg = sum/5.0;
		for(int i= 0; i<score.length; i++) {
			System.out.println(i+1+"번째 학생"+ score[i]+"점");
			//위에서 i를 썼어도, i 초기화 하면 되므로 그냥 쓰면됨!
		}
		
		
		
		
		
		System.out.println("점수의 합: " + sum);
		System.out.println("점수의 평균: " + avg);
		
	
		//배열과 for 문을 사용하여 5명 학생의 점수를 입력받아
		//각 배열의 요소에 저장 후 각 학생의 점수를 출력하고
		// 총 점수의 합과 평균을 구한 후 출력한다 --> score에 들어있는 값을 더하고 하는걸 잘 모르겠음
		

	}

}
