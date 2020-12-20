import java.util.Scanner;

public class P10 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		int sum = 0;
//		for (int x=2 ; x<=100 ; x=x+2)
//			sum = sum + x; 
		
		
		for (int x=1 ; x<=100 ; x++)
			if (x%2 == 1)  //x فرد است
				sum = sum + x; 
		
		System.out.println("sum is : " + sum);

		
		
	}

}
