/**
* P67 : در بین 100 عدد تعداد اعدادی را که با مقلوبشان برابرند
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/15 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P67 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=0;// عددی که هر مرحله از کاربر دریافت میشود		

		
		double sumAvg = 0.0;  // جمع میانگینهای n های دریافتی از کاربر
		int count=0; // تعداد اعدادی را که با مقلوبشان برابرند
		
		for (int x=1;x<=100;x++)
		{
			// گرفتن n
			System.out.println("Enter n (n>0): ");
			n=input.nextInt();
			int n1=n;
			
			// محاسبات روی n
			// محاسبه مقلوب عدد n
			int p=0; // مقلوب n
			while (n>0)
			{
				int r=n%10;  //برای رقم یکان				
				p=p*10+r;
				// حذف رقم یکان
				n=n/10;
			}// end of while

			// p مقلوب n  را دارد
			if (p==n1)
				count++;
		}// end of for x
		System.out.println("Count is: " + count);
		
	
	
	}// end of main
}// end of class
