package MyPackage;

public class multiplesOf3and5 {

	public static void main(String[] args) {
		
		System.out.println("This is the list of numbers multiples of 3 and 5:");
		int result = 0;
		for (int i = 1; i < 1000; i++) {
		    if (((i % 3) == 0) || ((i % 5) == 0)) {
		        result += i;
		        System.out.println(i);
		    }
		}
		System.out.println("this is the final answer = " + result);
	}
}
