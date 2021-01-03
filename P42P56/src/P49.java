/**
* P49 : حاصل ضرب ارقام روج یک عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/03 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P49 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter n: ");
		int n=input.nextInt();  // عددی که از کاربر گرفته میشود
		
		int p=1; // برای حاصل ضرب ارقام 
		while (n>0)
		{
			int r=n%10;  //برای رقم یکان
			
			// محاسبات روی رقم یکان عدد
			if (r%2==0)
				p=p*r;
			
			// حذف رقم یکان
			n=n/10;
		}// end of while
		
		// چاپ نتیجه
		System.out.println("Product is: " + p);

		
		
	}// end of main
}// end of class
