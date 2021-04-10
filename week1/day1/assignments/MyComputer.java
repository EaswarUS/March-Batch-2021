package learnJava;


public class MyComputer {
            
	String brand ="Dell";
	boolean touchscreen = false;
public void brand() {
	System.out.println("the computer brand is "+brand );
}
public void touchscreen() {
	System.out.println("Is it touch screen "+touchscreen);
	
}
public int price() {
	return 50000;
}

	public static void main(String[] args) {
		
		MyComputer methods = new MyComputer();
		methods.brand();
		methods.touchscreen();
		System.out.println("price is "+methods.price());
		
	}

}
