/**
* P88 : تبدیل یک عدد از مبنای 10 به مبنای 16  روش رشته ای
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/05 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P88 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long n = input.nextLong();  // برای عدد گرفته شده از کاربر
		
		String s=""; // برای حاصل جمع نهایی
		while (n>0)
		{
			long r = n % 16;
			
			if (r<10)
				s = r + s;
			else
				s = (char)(r+55) + s;
			
			n = n/16;
		}
		
		System.out.println(s);

		
			
		
		
	}// end of main
}// end of class









