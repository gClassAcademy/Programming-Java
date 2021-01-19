/**
* P72 : اولین عدد دو رقمی از سری فیبوناچی که با مقلوب خود برابر است
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/07 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P72 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
			
		long a=1; //عدد اول در سری فیبوناچی
		long b=1; //عدد دوم در سری فیبوناچی		
		//System.out.println("1: " + a);
		//System.out.println("2: " + b);
		
		long c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
		int count=3;
		
		while (count<=70)
		{
			c=a+b;
			
			//System.out.println(count + ": " + c);
			
			if (c>=10 && c<=99)
			{
				//بدست آوردن مقلوب c
				long n=c;
				long p=0;
				while (n>0)
				{
					long r=n%10;  //برای رقم یکان
					
					// محاسبات روی رقم یکان عدد
					//System.out.print(r);
					p=p*10+r;
								
					// حذف رقم یکان
					n=n/10;
				}// end of while
				
				
				// چاپ نتیجه
				//System.out.println(p);
	
				//بررسی برابری عدد با مقلوب خود
				
				if (c==p)
					System.out.println(count + ": " + c);
			
			}
			

			a=b;
			b=c;
			
			count++;
		}
		
		
		
	}// end of main
}// end of class
