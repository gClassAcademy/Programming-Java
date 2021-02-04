/**
* P86 : تبدیل یک عدد از مبنای 8 به مبنای 10
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/04 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P86 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long m = input.nextLong();  // برای عدد گرفته شده از کاربر
		
		long s=0; // برای حاصل جمع نهایی
		long p=1; //برای تولید توانهای 2
		while (m>0)
		{
			s = s + p * (m%10);
			p = p*8;
			m = m/10;
		}
		
		System.out.println(s);
		
		
		
			
		
		
	}// end of main
}// end of class









