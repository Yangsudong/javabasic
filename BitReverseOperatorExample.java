public class BitReverseOperatorExample {
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = ~num1;
		int num3 = num2 + 1;
<<<<<<< HEAD
				
<<<<<<< HEAD
		// java2 conflict..		
=======
		// java add....		
>>>>>>> 8092e53c844a138557a4b20e242a5b685c81acbe
				
=======
						

		System.out.println("Hello World");
		// java add....

>>>>>>> 497ca1809cf14805430e9c8f0264d63560a3862e
		String returnValue = toBinaryString(num1);
		System.out.println(returnValue);

		String returnValue1 = toBinaryString(num2);
		System.out.println(returnValue1);

		String returnValue2 = toBinaryString(num3);
		System.out.println(returnValue2);

	}

	public static String toBinaryString(int val) {

		String str = Integer.toBinaryString(val);
		while (str.length() < 32) {
			str = "0" + str;
		}
		return str;

	}

}