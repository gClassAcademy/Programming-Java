
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
					
		System.out.print("Please enter n: ");
		int n=input.nextInt();
				
		
		// System.out.println(Math.abs(n));
	
		//if (n<0)
		//	n=-n;		
		//System.out.println(n);
		
		
		// n*n = n^2 >=0
		System.out.println((int) Math.sqrt(n*n));
		
		
	}
}
