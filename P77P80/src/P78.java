/**
* P78 : چاپ اعداد کامل کمتر از 1000
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/29 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P78 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		
		for (int n=1;n<=10000;n++)
		{
			int sum=0; // برای جمع مقسوم علیه های n  بجز خودش
			
			for (int x=1;x<=n/2;x++)
				if (n%x==0)
					sum+=x;
			
			
			if (sum==n)
				System.out.println(n);
		}
		
	}// end of main
}// end of class









