/**
* P68 : حذف صفرهای یک عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/16 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
* 
*/

import java.util.Scanner;

public class P68 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.println("Enter n: ");
		int n=input.nextInt(); // عدد ورودی 
		
		int S=0;
		int P=1;
		while (n>0)
		{
			//محاسبات من روی ارقام
			if (n%10 != 0)
			{
				S = S + P* (n%10);
				P=P*10;			
			}
			
			n=n/10; // حذف رقم یکان
		}
		
		System.out.println(S);
		
		
		
		
	}// end of main
}// end of class









