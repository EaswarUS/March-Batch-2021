package assesment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		int length = input.length;
		System.out.println(length);
		
		Arrays.sort(input);
		for (int i = length-1; i >=0; i--) {
			System.out.println(input[i]);
		}

	}

}
