import java.util.*;
class divideNum
{
	private int num1;
	private int num2;
	divideNum()
	{
		num1=0;
		num2=0;
	}
	public void setNumbers(int n1,int n2)
	{
		num1=n1;
		num2=n2;
	}
	public float CalculateQuotient()throws Exception
	{
		float rslt=num1/num2;
		return rslt;
		
	}
	
}
 class driver
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		divideNum d=new divideNum();
		int num1,num2;
		int x=1;
		do
		{
			try{
				System.out.println("Enter First Number : ");
				num1=in.nextInt();
			System.out.println("Enter Second Number : ");
			num2=in.nextInt();
			d.setNumbers(num1,num2);
			float r=d.CalculateQuotient();
			System.out.println("\nresult is : "+r);
			x=2;
			
			   }
			   catch(Exception e)
			   {
				   
				   System.out.println(e.getMessage());
				     System.out.println(e.toString());
			   }
		}while(x==1);
		

	}
}