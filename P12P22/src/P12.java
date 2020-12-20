import java.util.Scanner;

public class P12 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		
		for (int x=1 ; x<=n ; x++)
			if (n%x==0) //n بر x بخش پذیر باشد
				System.out.println(x);
		
		
	}

}
