package array;

public class Ex02 {

	public static void main(String[] args) {
		//배열의 기본 초기값 - 바로 암기! 
		
		byte[] byteArray = new byte[1];
		char[] charArray = new char[1];
		short[] shortArray = new short[1];
		int[] intArray = new int[1];
		long[] longArray = new long[1];
		float[] floatArray= new float[1];
		double[] doubleArray = new double[1];
		boolean[] booleanArray = new boolean[1];
		String[] stringArray = new String[1];

		System.out.println(byteArray[0]); //0
		System.out.println((int)charArray[0]); //캐릭터는 정수여서 int 처리하면 0나옴
		System.out.println(shortArray[0]); //0
		System.out.println(intArray[0]); //0
		System.out.println(longArray[0]); //0
		System.out.println(floatArray[0]); //0.0
		System.out.println(doubleArray[0]); //0.0
		System.out.println(booleanArray[0]); //false
		System.out.println(stringArray[0]); //null
		
		
	}

}
