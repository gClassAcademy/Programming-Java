/**
* P76 : تشخیص وجود یک عدد در سری فیبوناچی و اول بودن آن در بین 100 عدد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/29 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
*/

import java.util.Scanner;

public class P76 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=0;// عددی که هر مرحله از کاربر دریافت میشود		
		int allcount=0;  // تعداد اعدادی که هم اول و هم فیبوناچی هستن
		
		for (int x=1;x<=100;x++)
		{
			// گرفتن n
			System.out.println("Enter n" + x + ": ");
			n=input.nextInt();
			
			// محاسبات روی n
			
			// بررسی وجود n  در سری فیبوناچی			
			long a=1; //عدد اول در سری فیبوناچی
			long b=1; //عدد دوم در سری فیبوناچی				
			long c=0; //عدد جمع دوتای قبلی در سری فیبوناچی
			while (c<n && n!=1)
			{
				c=a+b;
				//System.out.println(count + ": " + c);
				a=b;
				b=c;
			}
			

			// عدد فیبوناچی هست
			if (c==n || n==1)
			{
				//System.out.println("yes");
				
				//بررسی اول بودن n
				int count=0;
				for (int y=1;y<=n;y++)
					if (n%y==0)
						count++;
				
				// عدد n اول هست
				if (count==2)
					allcount++;			
			}
			
			
		}// end of for x
		
		
		System.out.println("All count is: " + allcount);
		
		
		
		
		
		
		
		
		
		
	}// end of main
}// end of class
