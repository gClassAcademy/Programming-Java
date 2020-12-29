import java.util.Scanner;

public class P28 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;

		System.out.println("enter number (" + 1 + ") : ");
		int max = input.nextInt();
		for (int x=2;x<=100;x++)
		{
			System.out.println("enter number(" + x + ") : ");
			n=input.nextInt();
						
			//Calc
			if (n>max)
				max=n;
		}
		
		System.out.println("Max is: " + max);
		
	}// end of Main
}// end of Class
