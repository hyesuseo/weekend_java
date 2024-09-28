package loop;

public class Ex01 {

	public static void main(String[] args) {
		
		
		int i; //선언을 for문 밖에서 선언하면 for문 밖에서도 사용할 수 있다.
		//main이라는 메소드 안에서 사용가능!
		
		for (i = 1; i <= 5; i++) {
			System.out.println("for문 안입니다, i: " + i);
		}
		System.out.println("for문을 나왔습니다... i :" + i);

	System.out.println();
		
	//for 문을 사용하여 2, 4, 6, 8, 10을 출력하기
	

	
	for (int j = 2; j <=10; j+=2)  {
		System.out.println("출력, j: " + j);
	// 변수의 범위 : 중괄호 범위 내에서 사용된다.
	// j는 for문 안에서 선언된 것이므로 중괄호 내에서만 사용가능
	
		
		
	// 반복문 주의사항!
	// 조건이 계속 true가 나오는 상황? -> for문이 무한반복됨: 프로그램이 계속 돌아감 : 빨간색 강제종료해주면됨ㅋㅋ
	}	
	}

}
