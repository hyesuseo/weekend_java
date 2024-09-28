package loop;

public class Ex04 {

	public static void main(String[] args) {
		//반복문 안에 반복문 : 이중 for문 (중첩 for문)
		
		for (int i = 0; i <10; i++) {
			
			for(int j = 0; j<10; j++) {
				
				System.out.println("i: " + i + ", j: "+ j);
			}
			
			
		}

	}

}
