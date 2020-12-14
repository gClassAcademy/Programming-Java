
import java.util.Scanner;
public class P2 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
			
		System.out.print("Please enter n (1..365): ");
		int n=input.nextInt();
		
		
		// month 1..6
		if (n>=1 && n<=186)
		{
			if (n%31==0)
			{
				System.out.println("month No is : " + (n/31));
				System.out.println("day of month is : " + 31);
			}
			else
			{
				System.out.println("month No is : " + (n/31 + 1));
				System.out.println("day of month is : " + n%31);
			}
		}

		// month 6..11
		else if (n>=187 && n<=336)
		{
			int m=n-186;	
			if (m%30==0)
			{
				System.out.println("month No is : " + (m/30 + 6));
				System.out.println("day of month is : " + 30);
			}
			else
			{
				System.out.println("month No is : " + (m/30 + 7));
				System.out.println("day of month is : " + m%30);
			}
		}
		
		// month 12
		else if (n>=337 && n<=366)
			{
				System.out.println("month No is : " + 12);
				System.out.println("day of month is : " + (n-336));
			}
		
		else
			System.out.println("no answer...");
		
	}
}
