import java.util.Scanner;

public class P23 {

	public static void main(String[] args) 
	{
		Scanner input=new Scanner (System.in);

		System.out.println("Please enter M,N (M>=N)");
		System.out.println("Please enter M:");
		int M=input.nextInt();
		System.out.println("Please enter N:");
		int N=input.nextInt();
		
		if (M<N)
		{
			int temp=M;
			M=N;
			N=temp;
		}
		
		if (M<=0)
			M=1;
		if (N<=0)
			N=1;
		
		
		System.out.println(M + "," + N);
		
		///   M>=N
		
		int bmm=1;
		for (int x=N;x>0;x--)
		{
			if (M%x==0 && N%x==0)
			{
				System.out.println("BMM : " + x);
				bmm=x;
				break;
			}			
		}
		
		System.out.println("KMM : " + (M*N)/bmm);
		
	}

}
