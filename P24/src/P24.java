import java.util.Scanner;

public class P24 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter n:");
		int n=input.nextInt();

		
		int count=0;
		for (int x=1; x<=n; x++)
			if (n%x==0)
				count++;
		
		//System.out.println(count);
		if (count==2)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
