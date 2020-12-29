import java.util.Scanner;

public class P27 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;

		System.out.println("enter number (" + 1 + ") : ");
		int min = input.nextInt();
		for (int x=2;x<=100;x++)
		{
			System.out.println("enter number(" + x + ") : ");
			n=input.nextInt();
						
			//Calc
			if (n<min)
				min=n;
		}
		
		System.out.println("Min is: " + min);
		
	}// end of Main
}// end of Class
