package loop;

public class Ex02 {

	public static void main(String[] args) {
		
		//for문을 사용하여 1에서 10까지의 합 구하기
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			
			sum += i;
			System.out.println("1에서 10까지의 합: "+ sum); //sum = sum + i
		}
		
		// 1에서 30까지중에 짝수만 출력하기
		// for문과 if문을 사용하여
		// 위에서 i가 끝났으므로 밑에서 i 다시 선언가능!
		for (int i=1; i <= 30; i++ ) {
		
			if(i % 2 == 0 ) {System.out.println(i);
	}

}
	}
}
