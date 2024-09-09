package rev;
import java.util.HashSet;
public class Hashset {
	
	
	    public static void main(String[]args) {
	    	HashSet<String> ab=new HashSet<String>();
	    	ab.add("no1");
	    	ab.add("no2");
	    	ab.add("no3");
	    	ab.add("no4");
	    	ab.add("no5");
	    	ab.add("no6");
	    	ab.remove("no4");
	    	
	    	System.out.println(ab);
	    	System.out.println(ab.contains("no3"));
	    }
	}


