package array;

public class Ex10 {

	public static void main(String[] args) {
		// 다차원 배열 (2차원 배열)
		// 배열 안에 배열이 들어있는 구조이다.
		// (2차원 배열은 행과 열로 구성된 배열)

		int[][] array = new int[2][2];
		//행과 열의 길이가 2인 int타입의 배열
		
		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;
	
		System.out.println(array[0]);
		
		//2차원 배열 array는 행의 주소를 갖고 행을 가리키며,
		//각각의 행들은 열의 주소를 가지고 , 열을 가리킨다
	
		
		for(int i=0; i< array.length; i++) {//행의길이
			for (int j = 0; j< array[i].length; j++) {//열의 길이
				System.out.println(array[i][j] + "\t" );
			}
			System.out.println();
		}
		System.out.println();
		// 가변배열 : 2차원 배열을 생성할 때 열의 길이를 명시하지 않음으로
		//			행마다 다른 길이의 배열을 생성할 수 있다.
		
		int[][] array2 = new int[3][];
		
		array2[0] = new int[] {1,2,3};
		array2[1] = new int[] {4};
		array2[2] = new int[] {5,6,7,8,};
		
		for (int i = 0; i<array2.length; i++) {
			for (int j = 0; j< array2[i].length; j++) {
				System.out.println(array2[i][j]+ "\t");
			}
			System.out.println();
		}
	
	}

}
