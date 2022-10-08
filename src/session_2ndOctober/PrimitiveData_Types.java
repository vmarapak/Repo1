package session_2ndOctober;

public class PrimitiveData_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int

		int i = 1;
		int j = -2;

		// but certain range of numbers for java
		// -2147483648 to 2147483647 (range of int in java)
		int k = 2147483647;
		int l = -2147483648;
		// anything higher will show out of range

		int m = 10; // here the value of m is 10
		m = 11; // here the value has been changed to 11
		m = 12;
		System.out.println(m);
		System.out.println(12);

		// decimals will not work because that is not an integer

		// a data type will not be accomodating to another data type

		// long -9223372036854775808 to 9223372036854775807
		// long is longer version of int

		// short is shorter than int
		// range of short -32678 to 32677

		char c = 'a'; // use ' ' not "" for char
		char c1 = ' '; // even space is a character
		char c2 = '#';
		char c3 = '1'; // but can only do single number for character, cannot do two numbers

		boolean b1 = 1 < 2; // this statement is true
		System.out.println(b1);
		boolean b2 = 191.123 > 190.123;
		System.out.println(b2);

		boolean b3 = true;
		boolean b4 = false;
		boolean b5 = (b3 != b4);// != means is not equal to , (b3==b4) would mean equal to and give false value
								// bc b3 truly does not =b4
		System.out.println(b5);

		// decimals are stored in double
		double d = 1.1;
		System.out.println(d);

	}

}
