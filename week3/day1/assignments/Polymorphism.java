package assesment;

public class Polymorphism {
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);

	}
	public void sub(int a, int b) {
		int sub = a - b;
		System.out.println(sub);
	}

	public void sub(double a, double b) {
		double sub = a - b ;
		System.out.println(sub);

	}

	public void mult(int a, int b) {
		int mulp = a * b;
		System.out.println(mulp);

	}
	public void mult(int a, double b) {
		double mulp = a * b ;
		System.out.println(mulp);

	}
	public void div(int a, int b) {
		int c=a/b;
		System.out.println(c);


	}
	public void div(int a, double b) {
		double c=b/a;
		System.out.println(c);

	}
	
	
	
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		obj.add(3, 4);
		obj.add(3, 3, 5);
		obj.sub(23.9992, 2.994);
		obj.sub(7, 5);
		obj.mult(2, 3.333);
		obj.mult(5, 74);
		obj.div(5, 555.55);
		obj.div(729, 9);
		
	}
	


}
