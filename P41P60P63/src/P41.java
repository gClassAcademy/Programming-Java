/**
* P41 : سری فیبوناتچی 50 جمله اول
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/07 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P41 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
			
		long a=1; //عدد اول در سری فیبوناچی
		long b=1; //عدد دوم در سری فیبوناچی		
		System.out.println("1: " + a);
		System.out.println("2: " + b);
		
		long c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
		int count=3;
		
		while (count<=50)
		{
			c=a+b;
			System.out.println(count + ": " + c);

			a=b;
			b=c;
			
			count++;
		}
		
		
		
	}// end of main
}// end of class
