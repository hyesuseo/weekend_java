package loop;

public class Ex05 {

	public static void main(String[] args) {
		
//		for(int i =1; i<10; i++) {
//			
//			for()
//			System.out.printf("2 X %d = %d\n", i, i*2);
		
// 이중 for 문을 사용하여 구구단 2단부터 9단까지 출력하기
	
	int num;
	int dan;
	
	for(dan = 2; dan<10; dan++) {
		
		for(num = 1; num<10; num++) {
			System.out.printf("%d X %d = %d\n", dan, num, dan*num);
	}
System.out.println();
}
}
}