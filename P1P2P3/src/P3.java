
import java.util.Scanner;
public class P3 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
					
		System.out.print("Please enter n to ATM: ");
		int n=input.nextInt();
				
		int r50=0;
		int r10=0;
		int r5=0; 
		int r1=0;
		
		r50 = n/50;   //107
		
		System.out.println(r50 + " *50");
		
		n = n- r50 * 50; 
		r10 = n/10;
		System.out.println(r10 + " *10");
		
		n = n -r10*10;
		
		r5=n/5;
		System.out.println(r5 + " *5");
	
		n = n -r5*5;
		System.out.println(n + "  *1");
		
		
	}
}
