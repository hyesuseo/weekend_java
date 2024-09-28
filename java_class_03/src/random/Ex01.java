package random;

public class Ex01 {

	public static void main(String[] args) {
		
		double a = Math.random()*10;
		//0.0~0.99999사이의 난수 하나를 발생시켜준다
		//*10을 하면 0.0~9.9999 
		
		System.out.println(a);

		int b = (int) (Math.random()*10)+1;
		//0~9사이의 수를 하나 얻을 수 있다.
		// +1을 하면 1~10까지 
		System.out.println(b);
		
	}

}
