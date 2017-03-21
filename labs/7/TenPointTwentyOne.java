import java.math.BigInteger;

public class TenPointTwentyOne {

	public static void main(String[] args) {
		
		BigInteger bigI = new BigInteger(String.valueOf(Long.MAX_VALUE));
		
		int i = 0;
		
		BigInteger exFive = new BigInteger("5");
		BigInteger exSix = new BigInteger("6");
		BigInteger exZero = new BigInteger("0");
		
		while (i < 10) {
			bigI = bigI.add(new BigInteger("1"));
			
			if ((bigI.remainder(exSix)).compareTo(exZero) == 0 || (bigI.remainder(exFive)).compareTo(exZero) == 0) {
				System.out.print(bigI+ " ");
				i += 1;
			}
		}
		

	}

}
