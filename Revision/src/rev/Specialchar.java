package rev;

public class Specialchar {
        public static void main(String[]args) {
        	String s="Welcome to great kirikalan magic show in 225/46  annanagar - at 2.00pm";
        	int count=0,count1=0,count2=0,count3=0;
        	for (int i=0;i<=s.length();i++) {
        		if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
        			count++;
        		}else if(s.charAt(i)>='A'&& s.charAt(i)<='Z') {
        		count1++;
        		}
        		else if(s.charAt(i)>='0'&& s.charAt(i)<='9') {
            		count2++;
            		}else {
            			count3++;
            		}
        	
        	System.out.println(count);
        	System.out.println(count1);
        	System.out.println(count2);
        	System.out.println(count3);
        }}
}
