import java.util.Scanner;

public class P32 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);
		
		int n=input.nextInt();
		
		for (int x=1;x<=n;x++)
			if (n%x==0 && x>=10 && x<=99)
				System.out.println(x);
		
		
	}

}
