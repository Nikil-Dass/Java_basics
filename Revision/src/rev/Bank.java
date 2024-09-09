package rev;

public class Bank implements Banking{
	public void Saving() {
		System.out.println("account");
		
	}
	public void Money() {
		System.out.println("deposit");
		
	}
	public void Cashier() {
		System.out.println("counting");
		
	}
	
	public static void main(String[]args) {
    Bank obj= new Bank();
    obj.Saving();
    obj.Cashier();
    obj.Money();
	}
}
