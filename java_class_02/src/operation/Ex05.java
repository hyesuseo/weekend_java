package operation;

public class Ex05 {

	public static void main(String[] args) {
		
		//조건(3항) 연산자
		
		String str = (10 > 20)? "참입니다." : "거짓입니다.";
		
		// ?앞에 조건식에 따라 :의 앞 뒤를 선택하는 연산자
		// 조건식의 결과가 True이면 : 의 앞을 선택
		// 조건식의 결과가 False이면 : 의 뒷부분을 선택
		System.out.println(str);

	}

}
