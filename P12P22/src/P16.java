import java.util.Scanner;

public class P16 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		
		int count=0;
		
		for (int x=1 ; x<=n ; x++)
			if (n%x==0) 
			{
				System.out.println(x);
				count++;
			}
		
		System.out.println("Count is : " +count);

		
	}

}
