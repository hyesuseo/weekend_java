package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pt03 {
	public static void main(String[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력준비
		
		if (ar.length == 0) {//입력시 매개변수를 주지 않았다.
			System.out.println("Usage : java ArrayEx3 subject1 subject2 ... ");
			System.exit(0);// 프로그램 종료
		} 
		
		System.out.print("학생 이름 = ");
		String name = br.readLine();
		
		String[] subject = new String[ar.length];//과목명을 저장할 공간
		// 과목수 = ar.length = subject.length
		for (int i = 0; i < subject.length; i++) {
			subject[i] = ar[i];// ar 배열에 있는 과목명을 subject 배열로 옮겨오기
		} 
		
		int jumsu[] = new int[subject.length + 1]; // 점수 저장 공간 :  +1 총점의 공간
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "과목 점수 = ");
			jumsu[i] = Integer.parseInt(br.readLine());
			jumsu[jumsu.length - 1] += jumsu[i];
		}
		
		float avg = jumsu[jumsu.length - 1] / (float) subject.length;
		avg = (int) ((avg + 0.005) * 100) / 100.f;
		
		char grade = 0;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		
		System.out.println();
		System.out.println("*********************** 성 적 표 ********************");
		
		System.out.print("이름\t");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println("총점\t평균\t학점");
		
		System.out.print(name + "\t");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i] + "\t");
		}
		System.out.println(avg + "\t" + grade);
	}
}
