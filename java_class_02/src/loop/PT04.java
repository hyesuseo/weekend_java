package loop;

public class PT04 {

	public static void main(String[] args) {
		System.out.println("---continue문 실습---");
		outer: for(int i=0; i<10; i++) { //outer라는 레이블 선언
			for(int j=0; j<10; j++) {
				if(j>i) {
					System.out.println();
					continue outer;
				}
			System.out.print(" "+(i+j));
			}
			
		}
		System.out.println("\n");
	}

}
