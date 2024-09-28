package array;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//행과 열의 개수를 입력받아 int타입의 2차원 배열을 생성
		//1부터 하나씩 숫자를 증가하여 배열의 각 요소에 저장 후 출력하기
		//예) 2행, 3열 시
		//1, 2,3,
		//4,5,6,
		
		//int a =input.nextInt();
		//int b =input.nextInt();
		//int array[][] = new int [a][b]; 
		
		System.out.print("행 을 입력하세요: ");
		int row = input.nextInt();
	
		System.out.print("열을 입력하세요: ");
		int col = input.nextInt();
		
		int[][] intArray = new int[row][col]; // 여기까지는 배열 크기를 입력받음
		
		int count = 1;
		
		for(int i = 0; i<intArray.length; i++) {//행의 갯수
			
			for (int j = 0; j<intArray[i].length; j++) {//열의 갯수

				intArray[i][j] = count; // count 값을 열과 행에 저장함
				count++;
				System.out.print(intArray[i][j] + "\t");
		}
			System.out.println();
	}

}}

