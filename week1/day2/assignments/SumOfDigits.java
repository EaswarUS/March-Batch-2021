package learnjava;

public class SumOfDigits {

	public static void main(String[] args) {
		int num = 123;
		int sum = 0;
		while (num > 0) {
			int eachDigit = num % 10;
			System.out.println(eachDigit);
			sum = sum + eachDigit;
			num = num / 10;
			System.out.println(num);
		}
		System.out.println(sum);

	}

}
