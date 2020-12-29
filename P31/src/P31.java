import java.util.Scanner;

public class P31 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		int CC=0;     //برای تعداد اعداد اول
		int count=0;
		for (int n=1;n<=1000;n++)
		{		
				count=0;
				for (int x=1; x<=n; x++)
					if (n%x==0)
						count++;
				
				//System.out.println(count);
				if (count==2)
				{
					CC++;
					System.out.println(CC + " : " + n);
				}
		}

		
		
	}

}
