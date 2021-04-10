package assesment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates_PayPal {

	public static void main(String[] args) {
		
		String str ="PayPal India";
		char[] charArray = str.toCharArray();
		
//		Declare set
		Set<Character> ch = new LinkedHashSet<Character>();
		for (Character eachcharacter : charArray) {
			ch.add(eachcharacter);
		}
		for (Character chars : ch) {
//			to remove space
			if (chars!=' ') {
				System.out.print(chars);
			}
			
			
		}

	}

}
