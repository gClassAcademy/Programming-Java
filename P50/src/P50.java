/**
* P50 : 50 امین عدد اول
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/02 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P50 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		
		int primecount=0; //برای شمارش تعداد اعداد اول
		int n=0; //عددی که هر بار اول بودن آنرا بررسی میکنیم
		
		while (primecount<50)
		{
			n++;
			
			// بررسی اول بودن عدد n
			int count=0; //برای تعداد مقسوم علیه ها
			for (int x=1;x<=n;x++)
				if (n%x==0)
					count++;
			if (count==2)
			{
				primecount++;
			}
			
		}//end of while primecount
		
		System.out.println(n);
		
		
		
		/*
		 * for (int n=1;n<=100000;n++) { // بررسی اول بودن عدد n int count=0; //برای
		 * تعداد مقسوم علیه ها for (int x=1;x<=n;x++) if (n%x==0) count++; if (count==2)
		 * { primecount++; if (primecount==500) { System.out.println(primecount + ":" +
		 * n); break; } } }// end of for n
		 */
		
		
	}// end of main
}// end of class
