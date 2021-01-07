/**
* P60 : 20 امین عدد اول سری فیبوناچی
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/07 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P60 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
			
		long a=1; //عدد اول در سری فیبوناچی
		long b=1; //عدد دوم در سری فیبوناچی		
		System.out.println("1: " + a);
		System.out.println("2: " + b);
		
		long c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
		int count=3; //برای شمارش اعداد فیبوناچی
		int primeCount=0; //برای شمارش تعداد اعداد اول
		
		while (primeCount<10)
		{
			c=a+b;
			
			System.out.print(count + ": " + c);

			// بررسی اول بودن c
			int cc=0; // برای شمارش تعداد مقسوم علیه های c
			for (long x=2;x<=Math.sqrt(c);x++)
				if (c%x==0)
				{
					cc++;
					break;
				}
			
			if (cc==0)
			{
				primeCount++;
				System.out.print("   is Prime" + primeCount);
				
			}
			
			System.out.println();
			a=b;
			b=c;
			
			count++;
		}
		
		
		
	}// end of main
}// end of class
