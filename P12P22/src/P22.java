import java.util.Scanner;

public class P22 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();
		
		int sum=0;
		int count=0;
		
		for (int x=1 ; x<=n ; x++)
			if (n%x==0 && x%2==0) 
			{
				count++;
				sum = sum + x;
				System.out.println(x);
			}
		
		System.out.println("\nsum is : " + sum);
		System.out.println("count is : " + count);
		
		System.out.println("Avg is : " + 1.0 * sum/count);
		
	}

}
