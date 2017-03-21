
public class TenPointThreeTest {

	public static void main(String[] args) {
		MyInteger myInteger = new MyInteger(10);
		
		System.out.println("Value is: "+myInteger.getValue());
		
		System.out.println("Even is: "+myInteger.isEven());
		System.out.println("Odd is: "+myInteger.isOdd());
		System.out.println("Prime is: "+myInteger.isPrime());
		
		System.out.println("5 Even is: "+MyInteger.isEven(5));
		System.out.println("5 Odd is: "+MyInteger.isOdd(5));
		System.out.println("5 Prime is: "+MyInteger.isPrime(5));
		
		MyInteger myInteger2 = new MyInteger(5);
		
		System.out.println("Value is: "+myInteger2.getValue());
		
		System.out.println("Even is: "+MyInteger.isEven(myInteger2));
		System.out.println("Odd is: "+MyInteger.isOdd(myInteger2));
		System.out.println("Prime is: "+MyInteger.isPrime(myInteger2));
		
		System.out.println("Equal is: "+myInteger.equals(10));
		System.out.println("Equal is: "+myInteger.equals(myInteger2));
		
		char charArray[] = {'3','4','5'};
		String number = "543";
		
		System.out.println("char value is: "+myInteger.parseInt(charArray));
		System.out.println("string value is: "+myInteger.parseInt(number));
		

	}

}
