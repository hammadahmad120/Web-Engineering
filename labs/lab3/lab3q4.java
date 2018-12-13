import java.util.*;
class PrimeNumbers
{

	PrimeNumbers()
	{
		
	}
	
	public void CalculatePrimes(int min,int max) throws Exception
	{
		if(min>=max||min<0)
		{
				throw new ArithmeticException("minimum should not be greater then or equal to maximum.");
		}
		else
		{
			int total=0;
			System.out.println("Prime numbers are: ");
			
			while(min<=max)
			{
				int no=min;
				boolean check=true;
				for(int i=2;i<=no/2;i++)
				{
					
					if(no%i==0)
						check=false;
					
				}
				if(check)
					total++;
				min++;
			}
			System.out.println("Total primes are : "+total);
		}
		
	}
	
}
 class driver
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		PrimeNumbers d=new PrimeNumbers();
		int num1,num2;
		
		
				System.out.println("Enter First Number : ");
				num1=in.nextInt();
			System.out.println("Enter Second Number : ");
			num2=in.nextInt();
			try
			{
			d.CalculatePrimes(num1,num2);
			}
			catch(Exception e)
			{
								System.out.println(e);

			}

			
			 

	}
}