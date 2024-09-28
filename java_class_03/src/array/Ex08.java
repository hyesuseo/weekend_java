package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] total = new int[3];
		int[] rank = new int[3];
		
		//0번째가 홍길동이면, kor의 0 번째는 홍길동의 국어/eng는 영어 /total은 국+영점수/ rank는 홍길동 순위가 되도록
		for (int i = 0; i <3; i++) {
			System.out.print(i+1+"번째 학생의 이름: ");
			name[i]= scan.next();
			
			System.out.print(i+1 + "번째 학생의 국어점수: ");
			kor[i] = scan.nextInt();
			
			System.out.print(i+1 + "번째 학생의 영어점수: ");
			eng[i] = scan.nextInt();
			
			total[i] = kor[i] + eng[i]; //입력받을 때마다 더할 수 있도록 for 문안에 넣어준다
			
		}
		//순위구하기 : 이중 for문 , if문을 사용해서
		//우선 rank를 1등으로 초기화를 한 후
		//다른 학생과 현재 학생 성적의 총점을 비교하여
		//총점이 더 낮다면 순위를 하나 올려준다
		
		for (int i = 0; i<3; i++) {
			rank[i] = 1; //1로 초기화가 필요하다!
			for (int j = 0; j<3; j++) {
				if (total[i] < total[j]) {
					rank[i]++ ;
				}
			}
			
		}
		for (int i = 0; i<3; i++) {
			System.out.printf("%s님의 총점은 %d점이고, 순위는 %d등입니다.\n",
					name[i], total[i], rank[i]);
		}

	}

}
