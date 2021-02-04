/**
* P87 : تبدیل یک عدد از مبنای 2 به مبنای 8  روش مستقیم
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/05 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P871 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long n = input.nextLong();  // برای عدد گرفته شده از کاربر
		System.out.println(n);
		
		
		long p=1;
		long sum = 0;
		while (n>0)
		{
			long r = n%1000;
			long k = r%10 + (((r/10)%10) *2) + ((r/100) *4);
			
			sum = sum + p * k;
			p=p*10;		
			
			n = n/1000;
		}

		System.out.println(sum);
		
			
		
		
	}// end of main
}// end of class









