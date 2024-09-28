package folder;
// package는 관련된 클래스, 인터페이스 등
// 리소스 파일을 그룹화하는데 사용되는 구성요소
public class HelloWorld {
	// class는 객체를 만드는 껍데기- 자바의 모든 코드는 객체화를 시킨다
	// 자바의 모든 코드는 클래스 범위 안에 있어야 한다!
	// hello world 는 클래스 이름
	// {} 중괄호 표시는 범위지정 (여는 중괄호가 있으면 닫는 중괄호가 있어야!)
	
	public static void main(String[] args) {
		// main이라는 이름의 메써드(객체지향적 언어-클래스에 존속적이다)
		// main 메써드는 자바의 가장 기본적인 메쏘드 - 암기!!!
		//public static void는 지금 설명해주셔도 몰라서 나중에 설명예정!
		
		// 주석
				// 주석은 프로그램에 영향을 주지 않는 코드
				// 소스내용 설명을 위한 코드.
				// 한 줄 주석
				/*범위 주석*/
		
		
		System.out.println("Hello World!!");
	// Hello World!!!를 출력해주는 코드
		// System.out 은 System이 가지고 있는 기본 출력장치
		// println은 괄호 안에 있는 내용을 console위에 출력하라
		// 괄호안에 큰따옴표는 "문자열"
		//문자열 안에서는 주석이 안됨
		// 세미콜론은 명령의 끝을 알려주는 표시
		
		System.out.println("/*주석이 될 수 없습니다.*/");
	// 이클립스에서 자주 사용하는 단축키!
		//  tab 들여쓰기
		//  shift tab : 내어쓰기
		// ctrl+shift+c 라인주석 단축키
		// ctrl+ (+,-) 폰트 크기조절 단축키
		// ctrl + space : 자동완성
		// ex) sysout 후 ctrl + space > System.out.println();
		// ctrl + shift + f: 자동정렬
		
			
	}
}
