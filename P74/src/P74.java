/**
* P74 : جدول ضرب اعداد
*
* @author    Gholamali Nejad Hajali Irani
* @version   1.0
* @since     2021/01/29 
* @Team      gClassAcademy  
* @Website   youtube.com/gClassAcademy
* 
*/

import java.util.Scanner;

public class P74 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);		
		
		
		System.out.println();
		for (int x=1;x<=10;x++)
		{	
			for (int y=1;y<=10;y++)
				if (x*y>=1 && x*y<=9)
					System.out.print(" " + x*y + "  ");
				else
					System.out.print(x*y + "  ");
			System.out.println("");
		}

		
		
		
		
		
	}// end of main
}// end of class









