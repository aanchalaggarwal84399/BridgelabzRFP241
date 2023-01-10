package dayOne;
import java.util.Scanner;
public class EqualString {
	
	
	
		public static void main(String[] args) {
		String a1,a2;
	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enter first String");
	    a1 = sc.nextLine();

	    System.out.println("Enter second String");
	    a2 = sc.nextLine();
	 
	    if (a1.equals(a2))
	        System.out.print("Equal Strings");
	    else
	        System.out.print("UnEqual Strings");
	}
	}


