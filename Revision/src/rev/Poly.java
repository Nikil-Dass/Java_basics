package rev;

public class Poly {
	
	public void StudentID(String name) {
		System.out.println(name);
	}
	public void StudentID(int  age) {
		System.out.println(age);
	}
	public void StudentID(char  Initial) {
		System.out.println(Initial);
	}
	public void StudentID(float  weight) {
		System.out.println(weight);
	}
	
	
	public static void main(String[]args) 
	{
		Poly obj= new Poly();
		obj.StudentID(23);
		obj.StudentID("A");
		obj.StudentID("Nikil");
		obj.StudentID(5.5f);
	}
}
