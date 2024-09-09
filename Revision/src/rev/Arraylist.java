package rev;
import java.util.ArrayList;
public class Arraylist {
      public static void main(String[]args) {
    	  ArrayList<String> ab=new ArrayList<String>();
    	  ab.add("pink");
    	  ab.add("black");
    	  ab.add("red");
    	  ab.add("blue");
    	  ab.remove(1);
    	  ab.add("violet");
    	  ab.add("yellow");
    	  ab.add("brown");
    	  ab.set(1, "grey");
    	  System.out.println(ab);
    	  System.out.println(ab.get(2));
      }
}
