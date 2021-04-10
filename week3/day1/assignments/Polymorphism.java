package assesment;

public class Polymorphism {
	public void add() {
		int a=5;
		int b=10;
		System.out.println("sum;"+(a+b));
	}
	public void add(int a,int b,int c) {
		
		System.out.println("sum;"+(a+b+c));
	}
	public void mul() {
		int a=5;
		int b=10;
		System.out.println("sum;"+(a*b));
	}public void mul(int a,int b,int c) {
		
		System.out.println("sum;"+(a*b*c));
	}
	public void add(double a,double b) {
		System.out.println("double:"+(a+b));
	}
public static void main(String[] args) {
	Polymorphism calc =new Polymorphism();
	calc.add();
	calc.mul(10, 20, 30);
	calc.mul();
	calc.mul(10, 10, 10);
	calc.add(36.5, 50.25);
}

}
