/**
* P79 : بررسی کامل بودن عدد بین 100 عدد گرفته شده از کاربر
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/29 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
*/

import java.util.Scanner;

public class P79 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=0;// عددی که هر مرحله از کاربر دریافت میشود		
		int allcount=0;  // تعداد اعدادی که هم اول و هم فیبوناچی هستن
		
		for (int x=1;x<=5;x++)
		{
			// گرفتن n
			System.out.println("Enter n" + x + ": ");
			n=input.nextInt();
			
			// محاسبات روی n
			

			//بررسی کامل بودن n
			int sum=0;
			for (int y=1;y<=n/2;y++)
				if (n%y==0)
					sum+=y;
			
			// عدد n کامل هست
			if (sum==n)
				allcount++;			
			
		}// end of for x
		
		
		System.out.println("All count is: " + allcount);
		
	
		
		
		
	}// end of main
}// end of class
