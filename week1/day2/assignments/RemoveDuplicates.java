package learnjava;

public class RemoveDuplicates {

	public static void main(String[] args) {
     
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		int length = split.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (split[i].equals(split[j])) {
					
					split[j]="";	
				}
				
			}
			System.out.print(split[i]+ " ");
		}
		
		
		
	}

}
