/**
* P64 : حاصل جمع کل ارقام 100 عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/15 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P64 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=0;// عددی که هر مرحله از کاربر دریافت میشود		

		
		int sumall=0;
		for (int x=1;x<=100;x++)
		{
			// گرفتن n
			System.out.println("Enter n: ");
			n=input.nextInt();
			
			// محاسبات روی n
			// حاصل جمع ارقام n
			int sum=0; // برای محاسبه مجموع ارقام n
			while (n>0)
			{
				sum = sum + n%10; //جمع رقم یکان n روی sum
				n=n/10;			  //حذف رقم یکان n
			}
			
			sumall = sumall+sum;
		}// end of for x
		
		
		System.out.println("Sum of All is:" + sumall);
		 
		
		
		
		
		
		
		
		
		
	}// end of main
}// end of class
