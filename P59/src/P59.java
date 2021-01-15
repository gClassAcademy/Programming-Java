/**
* P59 : تجزیه یک عدد به عوامل اول
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/15 
* @Team      gClassAcademy  
* @Website   https://www.youtube.com/c/gClassAcademy
*/

import java.util.Scanner;

public class P59 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		System.out.println("Enter n:");
		int n=input.nextInt();  // عددی که قرار هست به عوامل اول تجزیه شود
		
		int k=2; // عددی که هر بار n بر آن تقسیم میشود
		while (n>1)
		{			
			// تقسیمات متوالی n بر k 
			int count=0;
			while (n%k==0)
			{
				n=n/k;
				count++;
			}			
			
			// چاپ نتیجه تا این بخش از محاسبه
			if (count == 1 && n>1)
				System.out.print(k + "*");
			else if (count == 1 && n==1)
				System.out.print(k);
			else if (count != 0 && n>1)
				System.out.print(k + "^" + count + "*");
			else if (count != 0 && n==1)
				System.out.print(k + "^" + count);
			
			k++;			
		}
		
		
		
		
	}// end of main
}// end of class
