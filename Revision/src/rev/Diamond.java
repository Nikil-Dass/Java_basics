package rev;

public class Diamond {
	 public static void main(String[] args) {
	        int n = 5;

	        // Upper part of the diamond (same as Star3)
	        for (int i = 1; i <= n; i++) {
	            for (int k = n; k > i; k--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        // Lower part of the diamond (mirror of the upper part)
	        for (int i = n - 1; i >= 1; i--) {
	            for (int k = n; k > i; k--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println(); // Fix: Corrected indentation
	        }
	    }

}
			  
		  
	 

