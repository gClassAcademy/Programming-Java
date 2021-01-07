/**
* P62 : تشخیص وجود یک عدد در سری فیبوناچی
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/07 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P62 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		System.out.print("Enter n: ");
		int n= input.nextInt(); // عددی که قرار است بررسی شود
		

		
		// بررسی وجود n  در سری فیبوناچی
			
		long a=1; //عدد اول در سری فیبوناچی
		long b=1; //عدد دوم در سری فیبوناچی				
		long c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
		int count=3;
		while (c<n && n!=1)
		{
			c=a+b;
			System.out.println(count + ": " + c);
			a=b;
			b=c;
			count++;
		}
		if (c==n || n==1)
			System.out.println("yes");
		else if (c>n)
			System.out.println("no");
		
		
		
		
	}// end of main
}// end of class
