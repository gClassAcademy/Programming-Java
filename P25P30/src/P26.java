import java.util.Scanner;

public class P26 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;

		
		int sum=0;
		for (int x=1;x<=10;x++)
		{
			n=input.nextInt();
						
			//Calc
			
			sum = sum + n;			
		}
		
		System.out.println("Sum is: " + sum);
		System.out.println("Avg is: " + sum/10.0);
		
		
	}// end of Main
}// end of Class
