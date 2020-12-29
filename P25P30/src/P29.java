import java.util.Scanner;

public class P29 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;
		int min1=0;  //اولین کمترین
		int min2=0;  // دومین کمترین
		
		System.out.println("enter number(" + 1 + ") : ");
		int n1=input.nextInt();
		System.out.println("enter number(" + 2 + ") : ");
		int n2=input.nextInt();
		
		if (n1<n2)
		{
			min1 = n1;
			min2 = n2;
		}
		else
		{
			min1 = n2;
			min2 = n1;
		}
		
		
		
		for (int x=3;x<=6;x++)
		{
			System.out.println("enter number(" + x + ") : ");
			n=input.nextInt();
						
			//Calc
			
			if (n>min1 && n<min2)
				min2=n;
			if (n<min1)
			{
				min2=min1;
				min1=n;
			}
		}// end of for
		
		System.out.println("Min 1 is: " + min1);
		System.out.println("Min 2 is: " + min2);
		
		
	}// end of Main
}// end of Class
