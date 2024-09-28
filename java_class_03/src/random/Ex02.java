package random;

public class Ex02 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		//정수 1~45까지 6개 추첨
		//Math.random을 사용하여
		//로또 번호를 뽑아 lotto배열의 각 요소에 저장하기
		
		for (int i=0; i<6; i++ ) {
			
			lotto[i]=(int)(Math.random()*45)+1;
			//중복된 수가 나오면 안되니까...이중 for문을 사용해서 
			//첫 수와 두 번째 수 비교하고 같으면 다시 랜덤 돌린다! 
			
			for (int j = 0 ; j<i; j++) { //j는 i의 아래 수 까지만 반복한다
				if(lotto[i]== lotto[j]) {
					i--;
					break; 
				}
			
			}
			//for(int j = 0 ; i==j; j++) {
			//lotto[i]=(int)(Math.random()*45)+1;
			
			
			
		}
		for (int i : lotto) {
			System.out.print(i+" ");
		}
	
			
	}

}
