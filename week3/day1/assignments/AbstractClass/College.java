package AbstractClass;

public class College extends University{

	@Override
	public void ug() {
		System.out.println("SMCE");
	}
	public static void main(String[] args) {
		College method = new College();
		method.ug();
		method.pg();
	}

}