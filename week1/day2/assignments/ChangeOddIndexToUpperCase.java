package learnjava;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
	
				String name = "easwarus";
				char[] charArray = name.toCharArray();
				for (int i = 0; i < charArray.length; i++) {
					if (i%2==1) {
						char upperCase = Character.toUpperCase(charArray[i]);
						System.out.print(upperCase);
					}else {
						System.out.print(charArray[i]);
					}
				}
				
	}
}