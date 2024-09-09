package rev;
import java.util.Scanner;

public class Scn {
	public static void main(String[]args) {
     Scanner  ab = new Scanner(System.in);
     System.out.println("Enter a number");
     int a= ab.nextInt();
     for(int i=1;i<=a;i++) {
     if(i%2!=0) {
    	 System.out.println(i);
     }
     }
	}
}
