package array;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] intArray1 = {1,2,3};
		//실제 값을 알고 있을 때
		//선언과 동시에 배열을 생성하면 new 연산자 생략 가능, 써도 됨
		
		//System.out.println(intArray1); //배열 변수는 주소를 가지고 있어서 주소값을 보여줌
		
		System.out.println(intArray1[0]);
		System.out.println(intArray1[1]);
		System.out.println(intArray1[2]);
		//배열 사용은 []안에 인덱스를 이용하여 표시한다.
		
		
		System.out.println();
		
		int[] intArray2= null; //이미 배열을 선언했을 경우에는
		//intArray2 = {10, 20, 30} 그냥 중괄호만으로는 생성 불가
		intArray2 = new int[] {10, 20, 30}; // new 연산자를 사용해야함 -> 헷갈리면 new연산자를 그냥 쓰면됨

	System.out.println(intArray2[0]);
	System.out.println(intArray2[1]);
	System.out.println(intArray2[2]);
	System.out.println();
	
	//배열 요소의 길이만 지정하여 배열생성을 할 수 있다.
	int[] intArray3 = new int[3]; // 3 길이만큼의 배열이 생성됨
	
	// index를 사용하여 배열의 요소에 값을 저장할 수 있다.
	
	intArray3[0] = 100;
	intArray3[1] = 200;
	intArray3[2] = 300;
	
	System.out.println(intArray3[0]);
	System.out.println(intArray3[1]);
	System.out.println(intArray3[2]);
	
	}

}
