package rev;

public class Inhrit extends Father {
	public void single() {
		System.out.println("hritance");
	}
public static void main(String[]args) {
	Inhrit  obj = new Inhrit();
	obj.single();
	obj.Business();
	obj.Exarmy();
}
}
