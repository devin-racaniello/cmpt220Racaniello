
public class MyInteger {
	
	private int value;
	
	MyInteger(int newValue) {
		this.value = newValue;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven() {
		if (value%2 == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isOdd() {
		if (value%2 != 0) {
			return true;
		}
		return false;
	}
	
	public boolean isPrime() {
		for (int i = 2; i <= value / 2; i++) {
			if (value % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(int curValue) {
		if (curValue%2 == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isOdd(int curValue) {
		if (curValue%2 != 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isPrime(int curValue) {
		for (int i = 2; i <= curValue / 2; i++) {
			if (curValue % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger myInteger) {
		return myInteger.isEven();
	}
	
	public static boolean isOdd(MyInteger myInteger) {
		return myInteger.isOdd();
	}
	
	public static boolean isPrime(MyInteger myInteger) {
		return myInteger.isPrime();
	}
	
	public boolean equals(int curValue) {
		if (value == curValue) {
			return true;
		}
		return false;
	}
	
	public boolean equals(MyInteger myInteger) {
		if (value == myInteger.value) {
			return true;
		}
		return false;
	}
	
	public static int parseInt(char[] charIntList) {
		String newValue = "";
		for (int i = 0; i < charIntList.length; i++) {
			newValue += charIntList[i];
		}
		return MyInteger.parseInt(newValue);
	}
	
	public static int parseInt(String myString) {
		return Integer.parseInt(myString);
	}
	
	
	

}
