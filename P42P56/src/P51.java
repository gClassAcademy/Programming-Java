/**
* P51 : میانگین ارقام یک عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/03 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P51 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter n: ");
		int n=input.nextInt();  // عددی که از کاربر گرفته میشود
		
		int sum=0; //برای مجموع ارقام
		int count=0; //برای تعداد ارقام عدد
		while (n>0)
		{
			int r=n%10;  //برای رقم یکان
			
			// محاسبات روی رقم یکان عدد
			count++;
			sum=sum+r;
			
			
			// حذف رقم یکان
			n=n/10;
		}// end of while
		
		
		// چاپ نتیجه
		if (count==0)
			System.out.println("Avg is: 0");
		else
			System.out.println("Avg is: " + 1.0*sum/count);

		
		
	}// end of main
}// end of class
