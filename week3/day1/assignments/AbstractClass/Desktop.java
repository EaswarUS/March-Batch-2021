package AbstractClass;

public class Desktop implements Hardware,Software {

	public void desktopModel() {
		System.out.println("Dell");
		
	}
	
	public void softwareResources() {
		System.out.println("softwareResources");
		
	}
	public void hardwareResources() {
		System.out.println("hardwareResources");
		
	}
	public static void main(String[] args) {
		Desktop comp = new Desktop();
		comp.desktopModel();
		comp.hardwareResources();
		comp.softwareResources();
	}

}
