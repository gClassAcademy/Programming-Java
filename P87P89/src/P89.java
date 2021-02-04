/**
* P89 : تبدیل یک عدد از مبنای 2 به مبنای 16  روش مستقیم
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/05 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P89 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		long n = input.nextLong();  // برای عدد گرفته شده از کاربر
		//System.out.println(n);
		
		
		String sum = "";
		while (n>0)
		{
			long r = n%10000;
			long k = r%10 + (((r/10)%10) *2) + ((r/100)%10 *4) + (r/1000)*8;
			
			if (k<10)
				sum = k + sum;
			else
				sum = (char)(k+55) + sum;
			
			n = n/10000;
		}

		System.out.println(sum);
		
			
		
		
	}// end of main
}// end of class









