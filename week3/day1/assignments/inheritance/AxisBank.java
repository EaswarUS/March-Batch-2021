package inheritance;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("35,000");
	}
public static void main(String[] args) {
	AxisBank bank = new AxisBank();
	bank.deposit();
	bank.saving();
	bank.fixed();
}
}
