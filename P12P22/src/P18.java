import java.util.Scanner;

public class P18 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		
		int count=0;
		
		for (int x=1 ; x<=n ; x++)
			if (n%x==0 && x%2==1) 
			{
				System.out.println(x);
				count = count +1;
			}
		
		System.out.println("Count is : " +count);

		
	}

}
