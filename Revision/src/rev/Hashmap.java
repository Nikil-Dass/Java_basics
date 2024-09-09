package rev;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[]args) {
    	HashMap<String,Integer> ab=new HashMap<String,Integer>();
    	ab.put("no1",1);
    	ab.put("no2",2);
    	ab.put("no3",3);
    	ab.put("no4",4);
    	ab.put("no5",5);
    	ab.put("no6",6);
    	ab.remove("no4");
    	ab.replace("no1",7);
    	System.out.println(ab);
    	System.out.println(ab.get("no3"));
    	
    }
}
