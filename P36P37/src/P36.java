import java.util.Scanner;

public class P36 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);


		
		int n=0;
		int CC=0;
		
		for (int y=1;y<=100;y++) 
		{
			n=input.nextInt();
			
			//Calc
			int count=0;
			for (int x=1; x<=n; x++)
				if (n%x==0)
					count++;
			
			if (count==2)
				CC++;
		}
		
		System.out.println("Prime count is: " + CC);
		
		
		
	}

}
