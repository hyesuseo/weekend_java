package array;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] intArray = new int[5]; //배열길이가 5개정도면(0~4) 괜찮지만....그 이상이라면? 
		// 반복문을 사용할 수 있다.
		
		//배열의 요소에 정수 10, 20, 30, 40, 50을
		//인덱스를 통해 저장하기
		//배열의 각 요소 출력하기
		
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
				
		//System.out.println(intArray[0]);
		//System.out.println(intArray[1]);
		//System.out.println(intArray[2]);
		//System.out.println(intArray[3]);
		//System.out.println(intArray[4]);
		
		for(int i = 0; i <5; i++) { //i: 제어변수
			System.out.println(intArray[i]);
		}
		System.out.println("배열의 길이: " + intArray.length);
		//배열변수.length = 5

		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}

}
