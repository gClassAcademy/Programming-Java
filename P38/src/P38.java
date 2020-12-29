import java.util.Scanner;

public class P38 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);


		
		int n=0;
		int CC=0;
		
		for (int y=1;y<=10;y++) 
		{
			n=input.nextInt();
			
			//Calc
			if (n%2==1)
				CC++;
		}
		
		System.out.println("Odd count is: " + CC);
		
		
		
	}

}
