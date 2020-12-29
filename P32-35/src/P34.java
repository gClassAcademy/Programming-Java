import java.util.Scanner;

public class P34 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=input.nextInt();
		
		int sum=0;
		int count=0;
		for (int x=1;x<=n;x++)
			if (n%x==0 && x>=10 && x<=99)
			{
				System.out.println(x);
				sum = sum +x;
				count++;
			}
		
		System.out.println("sum is:" + sum);
		System.out.println("count is:" + count);
	}

}
