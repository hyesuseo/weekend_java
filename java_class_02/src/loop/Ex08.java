package loop;

public class Ex08 {

	public static void main(String[] args) {
		
		int i = 100;
				
		while (i == 200) {
			System.out.println("while 문 안입니다.");
		}
		System.out.println("while문 밖 입니다.");

		System.out.println();
		
		do {
			System.out.println("do~ while문 안입니다."); //우선 실행 후 조건검사를 한다!
			//한번은 실행 후 조건검사해야한다면 do while문을 실행하면 된다.
			
		} while (i ==200); //세미콜론
		
		System.out.println("do~ while문 밖입니다. ");
	}

}
