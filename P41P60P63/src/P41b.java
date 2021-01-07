/**
* P41b : میانگین اعداد سری فیبوناتچی کمتر از 1000
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/07 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P41b 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
			
		int a=1; //عدد اول در سری فیبوناچی
		int b=1; //عدد دوم در سری فیبوناچی		
		System.out.println(a);
		System.out.println(b);
		
		int c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
		int count=2;
		int sum=2;
		while ((a+b)<1000)
		{
			c=a+b;
			System.out.println(c);

			a=b;
			b=c;
			
			count++;
			sum=sum+c;
		}
		
		System.out.println("Count is: " + count);
		System.out.println("Sum is: " + sum);
		System.out.println("Avg is: " + 1.0* sum/count);

		
	}// end of main
}// end of class
