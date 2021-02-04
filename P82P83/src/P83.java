/**
* P83 : تبدیل یک عدد از مبنای 10 به مبنای 8
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/04 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P83 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long n = input.nextInt();  // برای عدد گرفته شده از کاربر
		long m=n;
		
		long s=0; // برای حاصل جمع نهایی
		long p=1; //برای تولید توانهای 10
		while (n>0)
		{
			s = s + p * (n%8);
			p = p*10;
			n = n/8;
		}
		
		System.out.println(s);
		
		
		
		
		
		String ss="";
		while (m>0)
		{
			ss=m%8 + ss;
			m = m/8;
		}
		System.out.println("\n" + ss);
		
		
		
		
		
	}// end of main
}// end of class









