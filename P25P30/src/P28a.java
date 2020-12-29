import java.util.Scanner;

public class P28a {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;

		System.out.println("enter number (" + 1 + ") : ");
		int max = input.nextInt();
		int min = max;
		
		
		for (int x=2;x<=5;x++)
		{
			System.out.println("enter number(" + x + ") : ");
			n=input.nextInt();
						
			//Calc
			if (n>max)
				max=n;
			if (n<min)
				min=n;
		}
		
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
		
	}// end of Main
}// end of Class
