package dayOne;

public class SumInteger {
public static void main(String[] args) {
	int sum = 0;
	for (int i = 1; i < args.length; i++) 
		{
		int val = Integer.parseInt(args[i]);
		sum = val + sum;
		}
	System.out.println("Sum:"+sum);
}


}
