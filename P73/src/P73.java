/**
* P73 : چاپ ستاره های مربع و مثلث و اشکال هندسی با ستاره
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/23 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
* 
*/

import java.util.Scanner;

public class P73 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.println("Enter n:");
		int n=input.nextInt();  //عدد ورودی از کاربر
		
		System.out.println();
		System.out.println("Fig. 1");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n;y++)
				System.out.print("* ");
			System.out.println("");
		}
		

		System.out.println();
		System.out.println("Fig. 1.1");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n;y++)
				if (x==1 || y==1 || x==n || y==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println("");
		}

		
		System.out.println();
		System.out.println("Fig. 1.2");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n;y++)
				if (x==y)
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println("");
		}
		
		
		System.out.println();
		System.out.println("Fig. 2");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=x;y++)
				System.out.print("* ");
			System.out.println("");
		}

		
		System.out.println();
		System.out.println("Fig. 3");
		for (int x=1;x<=n;x++)
		{				
			for (int y=1;y<=x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			System.out.println("");
		}
		
		
		
		System.out.println();
		System.out.println("Fig. 4");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println();
		System.out.println("Fig. 5");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print("  ");
			for (int y=1;y<=x;y++)
				System.out.print(" *");
			System.out.println("");
		}


		System.out.println();
		System.out.println("Fig. 6");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			for (int y=1;y<=x-1;y++)
				System.out.print("*");
			System.out.println("");
		}

		System.out.println();
		System.out.println("Fig. 7");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print("  ");
			for (int y=1;y<=x;y++)
				System.out.print(" *");
			for (int y=1;y<=x-1;y++)
				System.out.print(" *");
			System.out.println("");
		}

		
		
		System.out.println();
		System.out.println("Fig. 8");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			for (int y=1;y<=x-1;y++)
				System.out.print("*");
			System.out.println("");
		}


		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<x;y++)
				System.out.print(" ");
			for (int y=1;y<=n-x;y++)
				System.out.print("*");
			System.out.println("");
		}
		
		
		
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print("*");
			System.out.println("");
		}

		
		System.out.println();
		System.out.println("Fig. 9");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			for (int y=1;y<=x-1;y++)
				System.out.print("*");
			System.out.println("");
		}


		for (int x=2;x<=n;x++)
		{	
			for (int y=1;y<x;y++)
				System.out.print(" ");
			for (int y=1;y<=n-x+1;y++)
				System.out.print("*");
			
			for (int y=1;y<=n-x;y++)
				System.out.print("*");

			System.out.println("");
		}
		

		System.out.println();
		System.out.println("Fig. 10");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=x;y++)
				System.out.print("* ");
			System.out.println("");
		}
		
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print("* ");
			System.out.println("");
		}

		System.out.println();
		System.out.println("Fig. 11");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n-x;y++)
				System.out.print(" ");
			for (int y=1;y<=x;y++)
				System.out.print("*");
			System.out.println("");
		}
		for (int x=2;x<=n;x++)
		{	
			for (int y=1;y<x;y++)
				System.out.print(" ");
			for (int y=1;y<=n-x+1;y++)
				System.out.print("*");
			
			System.out.println("");
		}

		
		System.out.println();
		System.out.println("Fig. 12");
		for (int x=1;x<=n;x++)
		{	
			for (int y=1;y<=n;y++)
			{
				for (int z=1;z<=n/2-x/2;z++)
					System.out.print(" ");

				if (x==y)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println("");
		}

		
	}// end of main
}// end of class









