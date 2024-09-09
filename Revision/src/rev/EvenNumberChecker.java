package rev;

public class EvenNumberChecker {
	public static String isEven(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        String result = isEven(5);
        System.out.println(result); 
    }


}
