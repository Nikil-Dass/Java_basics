package rev;
import java.util.Scanner;

public class Ascending {
    public static void main(String[]args) {
    	int n,temp=0;
    	Scanner ab =new Scanner(System.in);
    	System.out.println("Enter the numbers");
    	n=ab.nextInt();
    	int[] a= new int[n];
    	System.out.println("Enter all the numbers");
    	for(int i=0;i<n;i++) {
    		a[i] =ab.nextInt();
    	}
    		
    	for(int i=0;i<n;i++) {
    		for(int j=i+1;j<n;j++) {
    			if(a[i]>a[j]) {
    				temp=a[i];
    				a[i]=a[j];
    				a[j]=temp;
    			}
    		}
    	}
    	for(int i=0;i<n-1;i++) {
    		System.out.print(a[i]+",");
    	}System.out.println(a[n-1]);
    }
}
