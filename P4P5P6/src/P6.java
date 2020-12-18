
import java.util.Scanner;
public class P6 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
					
		System.out.print("Please enter n1: ");
		int n1=input.nextInt();
		
		System.out.print("Please enter n2: ");
		int n2=input.nextInt();
				

		//System.out.println(Math.min(n1,n2));
		
		//max(n1,n2) = (|n1+n2| + |n1-n2|)/2
		
		int max = (Math.abs(n1+n2)+Math.abs(n1-n2))/2;
		
		System.out.println(max);
	}
}
