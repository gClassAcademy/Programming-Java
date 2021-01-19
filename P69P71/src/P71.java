/**
* P71 : چاپ میانگین مقسوم علیه های اول یک عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/19 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
* 
*/

import java.util.Scanner;

public class P71 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.println("Enter n:");
		int n=input.nextInt();  // عددی که از کاربر گرفته می شود
		
		
		int allcount=0; //تعداد مقسوم علیه های اول
		int sum=0;      //جمع مقسوم علیه های اول
		
		for (int x=1;x<=n;x++)
			if (n%x==0)  // اگر x مقسوم علیه بود
			{
				// بررسی اول بودن x
				int count=0;
				for (int y=1;y<=x;y++)
					if (x%y==0)
						count++;
				
				if (count==2)  //x اول هست
				{
					System.out.println(x);
					allcount++;
					sum+=x;
				}
			
			}//end of if n%x==0
		
		System.out.println("Count of Primes is: " + allcount);
		System.out.println("Sum of Primes is: " + sum);
		if (allcount==0)
			System.out.println("تعداد مقسوم علیه های اول صفر است هااا");
		else
			System.out.println("Avg of Primes is: " + 1.0*sum/allcount);
		
		
		
	}// end of main
}// end of class









