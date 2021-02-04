/**
* P87 : تبدیل یک عدد از مبنای 2 به مبنای 8  غیرمستقیم
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/04 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P87 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long m = input.nextLong();  // برای عدد گرفته شده از کاربر
		
		long ss=0; // برای حاصل جمع نهایی
		long pp=1; //برای تولید توانهای 2
		while (m>0)
		{
			ss = ss + pp * (m%10);
			pp = pp*2;
			m = m/10;
		}
		
		//System.out.println(ss);
		
		
		long n=ss;
		
		long s=0; // برای حاصل جمع نهایی
		long p=1; //برای تولید توانهای 10
		while (n>0)
		{
			s = s + p * (n%8);
			p = p*10;
			n = n/8;
		}
		
		System.out.println(s);

		
			
		
		
	}// end of main
}// end of class









