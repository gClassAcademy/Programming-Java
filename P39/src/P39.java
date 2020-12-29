import java.util.Scanner;

public class P39 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		int n=0;
		int Max=0;
		for (int x=1;x<=100;x++)
		{
			n=input.nextInt();
			
			//Calc
			// مقسوم علیه های n
			int count=0;
			for (int y=1;y<=n;y++)
				if (n%y==0)
					count++;
			
			
			if (count>Max)
				Max=count;
			
			System.out.println("n:" + n + ", count:" + count + " Max:" +Max);
		}
		
		System.out.println("Max:" + Max);
		
		
	}

}
