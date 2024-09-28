package variable;

public class Ex02 {

	public static void main(String[] args) {
		
		int a; //정수타입 변수선언 
		a = 10; //선언 후 저장: 초기화
		// = 표시는 프로그램에서 오른쪽의 값을 왼쪽 변수에 저장한다
		
		// int a; 같은 이름의 변수는 재선언이 불가능하다
		// 같은 이름의 변수 중 무엇을 선택하는지 컴퓨터가 모르므로.
		
		System.out.println(a);
		
		int b = 20; //선언과 동시에 초기화
		System.out.println(b);
		
		System.out.println("-------------");
		// 변수명 알아보기
		int price1 = 100;
		int $price = 200;
		int _price = 300;
		//int #price = 400; // $ 나 _ 외의 다른 특수기호는 사용할 수 없다
		//int 1price = 500; //숫자로시작을 할 수 없다
	
		System.out.println(price1);
		System.out.println($price);
		System.out.println(_price);
	
		String firstname = "JAVA";
		String firstName = "자바";
		//String은 문자열을 저장하는 타입이다.
		// 자바의 변수는 대소문자를 구분한다 //한글로도 지정가능
		
		
		System.out.println(firstname);
		System.out.println(firstName);

		String 한글 ="한글";
		String 韓 = "한자";
		
		System.out.println(한글);
		System.out.println(韓);
		
	}

}
