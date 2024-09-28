package condition;

public class Ex04 {

	public static void main(String[] args) {

		int x = 2;
		//switch문 안에는 정수, 문자, 문자열
		
		switch(x) {
//중괄호 안에 케이스를 작성한다
		
		case 1 :
			System.out.println("정수1 입니다.");
			break;
			
		case 2 :
			System.out.println("정수2 입니다.");
			break;
			
		case 3 :
			System.out.println("정수3 입니다.");
			break;
			
		case 4 :
			System.out.println("정수4 입니다.");
			break;
			
		default : 
			System.out.println("정수 1~4가 아닙니다.");
	}
//주의사항! break를 꼭 써서 switch를 종료시켜주어야 한다!
}
}
