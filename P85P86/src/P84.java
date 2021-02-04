/**
* P86 : ضرب و جمع در مبنای 8
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/05 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P84 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n1,n2 (8): ");
		long n1 = input.nextLong();  // برای عدد گرفته شده از کاربر
		long n2 = input.nextLong();  // برای عدد گرفته شده از کاربر
		
		
		
		/////////////   تبدیل اعداد از 8 به مبنای 10
		
		long s1=0; // معادل n1 در مبنای 10
		long p=1; //برای تولید توانهای 2
		while (n1>0)
		{
			s1 = s1 + p * (n1 % 10);
			p = p*8;
			n1 = n1 / 10;
		}		
		//System.out.println(s1);
		
		long s2=0; // معادل n2 در مبنای 10
		p=1; //برای تولید توانهای 2
		while (n2>0)
		{
			s2 = s2 + p * (n2 % 10);
			p = p*8;
			n2 = n2 / 10;
		}		
		//System.out.println(s2);
		
		
		////////////////// عملیات در مبنای 10
		
		long sum=s1+s2;         // برای جمع دو عدد
		long product = s1*s2;   // برای ضرب دو عدد
		
		
		//////////////////////   تبدیل از 10 به 8
			
		long s=0; // برای حاصل جمع نهایی
		p=1; //برای تولید توانهای 10
		while (sum>0)
		{
			s = s + p * (sum%8);
			p = p*10;
			sum = sum/8;
		}		
		System.out.println("\nSum in base 8 is: " + s);

		
		
		
		long ss=0; // برای حاصل جمع نهایی
		p=1; //برای تولید توانهای 10
		while (product>0)
		{
			ss = ss + p * (product%8);
			p = p*10;
			product = product/8;
		}		
		System.out.println("Product in base 8 is: " + ss);
		
		
		
		
	}// end of main
}// end of class









