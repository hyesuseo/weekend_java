package operation;

public class Ex01 {

	public static void main(String[] args) {
	
		int i, j;
		i= +100; //부호연산자
		j= -200;
		
		System.out.println(i + j); // 산술연산자
		
		// 증감연산자 (독립사용)
		
		int x = 1;
		int y = 1;
		
		System.out.printf("x : %d, y : %d\n\n", x, y);
		
		x++; // x값을 1만큼 증가
		y = x; 
	 
	 System.out.printf("x : %d, y : %d\n\n", x, y);

	 
	 	--x; //x값을 1만큼 감소시킨다 : 앞에 붙여도 되고 뒤에 붙여도 됨. 다만 독립사용하지 않는 경우 순서에 따라 값이 다름 
	 	//x는 위에서 2가 되었으므로 1 감소 되어 1이 됨
	 	
	 	y = x; 
	 	
	 	System.out.printf("x : %d, y : %d\n\n", x, y);
	 	
	 	//증감연산자 (독립사용하지 않을 경우)
	 	
	 	y = ++x;
	 	// 연산과정: x를 1 증가시킨 후, x를 y에 대입해준다.
	
	 	System.out.printf("x : %d, y : %d\n\n", x, y);
	 	
	 	y = x++;
	 	//연산과정: y=x를 먼저 실행 후 x를 1 증가
	 	
	 	System.out.printf("x : %d, y : %d\n\n", x, y);
	 	
	}

}
