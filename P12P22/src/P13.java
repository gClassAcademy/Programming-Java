import java.util.Scanner;

public class P13 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		
//		for (int x=1 ; x<=n ; x++)
//			if (n%x==0) //n بر x بخش پذیر باشد
//				if (x%2==1)  //x فرد باشد
//					System.out.println(x);
		
		
		for (int x=1 ; x<=n ; x++)
			if ((n%x==0) && (x%2==1)) //n بر x بخش پذیر باشد    x فرد باشد
				System.out.println(x);

		
	}

}
