/**
* P77 : بررسی کامل بودن یک عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/29 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P77 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n:");
		int n = input.nextInt(); //عدد ورودی
		int sum=0; // برای جمع مقسوم علیه های n  بجز خودش
		
		for (int x=1;x<=n/2;x++)
			if (n%x==0)
			{	
				sum+=x;
				System.out.println(x);
			}
		
		System.out.println("Sum is: " + sum);
		
		if (sum==n)
			System.out.println("Yes");
		
		
	}// end of main
}// end of class









