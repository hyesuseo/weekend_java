package array;

public class Ex04 {

	public static void main(String[] args) {
		// 정수타입의 배열을 길이가 5로 지정하여 생성 후
		// 인덱스를 사용하여 각 배열의 요소에 
		// 정수 100부터 500까지 저장하기(100,200,300,400,500)
		// for 문을 사용하여 배열의 각 요소 출력하기
		
		int[] testscore /*배열변수*/ = new int[5];
		
		testscore[0]= 100;
		testscore[1]= 200;
		testscore[2]= 300;
		testscore[3]= 400;
		testscore[4]= 500;
		
		for(int i=0; i<testscore.length; i++) { 
			
			System.out.println(testscore[i]);
		}
		
				

	}

}
