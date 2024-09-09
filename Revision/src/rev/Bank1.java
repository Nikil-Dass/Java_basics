package rev;

public class Bank1 extends Banking1{
	public void current() {
		System.out.println("currents");
	}
	public void salary() {
		System.out.println("salarys");
	}
	
	public static void main(String[]args) {
		
		Bank1 obj = new Bank1();
		obj.current();
		obj.salary();
		obj.savings();
		
}
}
