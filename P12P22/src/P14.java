import java.util.Scanner;

public class P14 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		
//		for (int x=1 ; x<=n ; x++)
//			if (n%x==0) //n بر x بخش پذیر باشد
//				if (x%2==0)  //x زوج باشد
//					System.out.println(x);
		
		
		for (int x=1 ; x<=n ; x++)
			if ((n%x==0) && (x%2==0)) //n بر x بخش پذیر باشد    x زوج باشد
				System.out.println(x);

		
	}

}
