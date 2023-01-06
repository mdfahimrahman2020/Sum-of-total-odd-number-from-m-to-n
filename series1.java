import java.util.Scanner;
public class series1{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n\t\"Summation of Total Odd Number\"");
		Scanner input = new Scanner(System.in);
		int m,n, sum = 0;

		System.out.print("\n\nEnter the Starting number : ");
		m = input.nextInt();
		System.out.print("\nEnter the Ending number : ");
		n = input.nextInt();

		for(int i = m; i <= n; i++)
		{
			if(i%2 != 0)
			{
				sum = sum + i;
		        System.out.print(i+" ");

			}
			

		}

		

		System.out.print("\nThe Summation of total odd numbers is : " +sum);
	






	}

}