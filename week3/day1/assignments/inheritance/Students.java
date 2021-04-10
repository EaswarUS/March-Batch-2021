package inheritance;

public class Students {
	
	public void getStudentsInfo(int id) {
		System.out.println("Student = "+id);
		
	}
	public void getStudentsInfo(String name,int age) {
		System.out.println("StudentInfo = "+ name + age );
		
	}
	public void getStudentsInfo(String email) {
		System.out.println("StudentsMail = "+ email);
		
	}
	public void getStudentsInfo(long phonenumber) {
		System.out.println("StudentsPhoneNumber = "+ phonenumber);
		
	}
	public static void main(String[] args) {
		Students method = new Students();
		method.getStudentsInfo(5647);
		method.getStudentsInfo("Easwar.U.S", 23);
		method.getStudentsInfo(8680083969l);
	} 
}
