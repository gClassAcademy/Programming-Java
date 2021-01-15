/**
* P65 : تعداد کل ارقام 100 عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/15 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P65 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=0;// عددی که هر مرحله از کاربر دریافت میشود		

		
		int countall=0;
		for (int x=1;x<=100;x++)
		{
			// گرفتن n
			System.out.println("Enter n: ");
			n=input.nextInt();
			
			// محاسبات روی n
			// تعداد ارقام n
			int count=0; // برای محاسبه تعداد ارقام n
			while (n>0)
			{
				//sum = sum + n%10; //جمع رقم یکان n روی sum
				count++;
				n=n/10;			  //حذف رقم یکان n
			}
			
			countall = countall+count;
		}// end of for x
		
		
		System.out.println("Count of All is:" + countall);
		 
		
		
		
		
		
		
		
		
		
	}// end of main
}// end of class
