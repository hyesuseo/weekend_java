package random;

public class Ex01 {

	public static void main(String[] args) {
		
		double a = Math.random()*10;
		//0.0~0.99999사이의 난수 하나를 발생시켜준다 - double 타입의 수
		//*10을 하면 0.0~9.9999 
		
		System.out.println(a);

		int b = (int) (Math.random()*10)+1; // int캐스팅을 하면 소수점이하가 버려진다!
		//0~9사이의 수를 하나 얻을 수 있다.
		// +1을 하면 1~10까지 
		System.out.println(b);
		
		
		//주사위 수 하나 뽑기
		int c = (int)(Math.random()*6+1);
		System.out.println(c);
		
        }		
				
	}


