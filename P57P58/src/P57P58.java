/**
* P5758 : ب.م.م و ک.م.م دو عدد با تکرار نامعین
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/15 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P57P58 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		// گرفتن دو عدد از کاربر
		int m=0; // عدد اول
		int n;   // عدد دوم
		
		System.out.println("Enter m: ");
		m=input.nextInt();
		System.out.println("Enter n: ");
		n=input.nextInt();
		
		if (m<n)
		{
			int temp=m;
			m=n;
			n=temp;
		}
		int m1=m;
		int n1=n;
		//System.out.println(m + "," + n);
		
		while (m%n != 0)
		{
			int r = m%n;
			m=n;
			n=r;
		}
		
		System.out.println("BMM is: " + n);
		
		System.out.println("KMM is:" + m1*n1 / n);
		
		
		
		
	}// end of main
}// end of class
