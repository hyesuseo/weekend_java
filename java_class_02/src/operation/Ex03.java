package operation;

public class Ex03 {

	public static void main(String [] args) {
		int a, b, c;
		
		a = b = c = 100;
		//= 단순 대입연산자: 오른쪽의 값을 왼쪽 변수에 저장
		
		System.out.printf("a, b, c,의 값: %d, %d, %d\n\n", a, b, c);


		//복합 대입연산자
	
		a +=100; // a = a + 100; a에 100을 더한 값을 a에 대입함 
		b -=100; // b = b - 100; b에 100을 뺀 값을 대입
		c *=100; // c = c * 100; c에 100 곱한 값을 대입
	
		System.out.printf("a, b, c,의 값: %d, %d, %d\n\n", a, b, c);
		
		a = b = 10; //a와 b의 값을 초기화
		
		System.out.printf("a, b의 값 : %d, %d\n\n", a, b);
		
		a /= 5; // a = a/5; 
		b %= 3; // b = b%3; 나머지를 대입해줌
		
		System.out.printf("a, b의 값: %d, %d\n\n", a, b);
	
		String str = "홍길동" +" "+ "성춘향\n";
		// + : 한쪽이 문자열일때 문자열 결합 연산자로 사용된다.
		System.out.println(str);
		
		System.out.println(2 + "학년" + 10 + "반");
		// 한 쪽이 문자열일 때 +연산자는 문자열 결합 연산자로 사용되어
		// 다른 피연산자를 문자열로 변환 후 결합한다.
	
		System.out.println("홍길동 나이: " + (2 + 10 + 5) + "살");
		// 정수정수정수를 먼저 덧셈 연산하기 위해서는 소괄호를 사용해준다.
		
		
	}
	
}
