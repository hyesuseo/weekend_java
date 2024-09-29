package loop;

public class Ex09 {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i <10) {
			System.out.println(i);
			
			if(i == 3) {
				break; // break를 만나면 반복문이 종료
			}
			
			i++;
		}
		 System.out.println();
		 
		 
		 i = 0;
		 
		 while(i < 10) {
			 i++;
			 
			 if( i ==6 ) {
				 continue; //i==6 일 때 반복문을 건너뜀
			 }
			 
			 System.out.println(i);
		 }
	}

}
