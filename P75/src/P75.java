/**
* P75 : جدول ضرب مبنای 8
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/02/04 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P75 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		System.out.print("Enter n: ");
		
		
		for (int x=1;x<=7;x++)
		{
			System.out.println();
			for (int y=1;y<=7;y++)
			{
				//System.out.print(x*y + " ");
			
				long n=x*y;
				long s=0; // برای حاصل جمع نهایی
				long p=1; //برای تولید توانهای 10
				while (n>0)
				{
					s = s + p * (n%8);
					p = p*10;
					n = n/8;
				}
				
				if (s>=10 && s<=99)
					System.out.print(s + " ");
				else
					System.out.print(s + "  ");
					
							
			}
		}
		
		
		
		
	}// end of main
}// end of class









