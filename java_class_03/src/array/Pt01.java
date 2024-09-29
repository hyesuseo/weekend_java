package array;

public class Pt01 {

	public static void main(String[] args) {
		
		char[] ch; //배열선언;
		ch= new char[4]; //배열 초기화;
		//배열 값의 할당

		ch[0]='J';
		ch[1]='A';
		ch[2]='V';
		ch[3]='A';
		
		for (int i = 0; i<ch.length; i++) {
			System.out.println("ch[" +i +"]: "+ ch[i]);
		}

	}

}
