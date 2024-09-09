package rev;

public class Pallindrome {
	public static void main(String[]args) {
		int n=1253521;
		int a,i=0,j=0;
		a=n;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		if(n==j) {
		System.out.println("pallindrome");
		}else {
			System.out.println(" not a pallindrome");
		}
	}
}
