import java.util.Scanner;

public class P30 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		int n=0;
		int max1=0;  //اولین کمترین
		int max2=0;  // دومین کمترین
		
		System.out.println("enter number(" + 1 + ") : ");
		int n1=input.nextInt();
		System.out.println("enter number(" + 2 + ") : ");
		int n2=input.nextInt();
		
		if (n1<n2)
		{
			max1 = n2;
			max2 = n1;
		}
		else
		{
			max1 = n1;
			max2 = n2;
		}
		
		
		
		for (int x=3;x<=6;x++)
		{
			System.out.println("enter number(" + x + ") : ");
			n=input.nextInt();
						
			//Calc
			
			if (n<max1 && n>max2)
				max2=n;
			if (n>max1)
			{
				max2=max1;
				max1=n;
			}
		}// end of for
		
		System.out.println("Max 1 is: " + max1);
		System.out.println("Max 2 is: " + max2);
		
		
	}// end of Main
}// end of Class
