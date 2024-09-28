package loop;

public class Ex09 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i <10) {
			System.out.println(i);
			
			if(i == 5) {
				break; // break를 만나면 반복문이 종료
			}
			
			i++;
		}
		 System.out.println();
		 
		 
		 i = 0;
		 
		 while(i < 10) {
			 i++;
			 
			 if( i ==5 ) {
				 continue; //반복문의 실행흐름을 이동시킬 때
			 }
			 
			 System.out.println(i);
		 }
	}

}
