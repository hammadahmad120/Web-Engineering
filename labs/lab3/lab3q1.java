abstract class MyArmStrong
{
	 
	abstract public void DisplayNumbers();
}
class ArmStrongNumber extends MyArmStrong
{
	public void DisplayNumbers()
	{
		System.out.println("ArmStrongNumbers are: ");
		for(int i=0;i<=1000;i++)
		{
			int sum=0;
			int num=i;
			
				if(i>99)
				{
				while(num!=0)
				{
				int m=num;
				m=num%10;
				sum=sum+(m*m*m);
				num=num/10;
				}
				}
				else if(i>9)
				{
					while(num!=0)
					{
					int m=num;
				m=num%10;
				sum=sum+(m*m);
				num=num/10;
					}
				}
				else if(i==1000)
				{
					while(num!=0)
					{
					int m=num;
				m=num%10;
				sum=sum+(m*m*m*m);
				num=num/10;
					}
				}
				
			
				
			
			if(sum==i)
				System.out.print(i+" , ");
			else if(num==i)
				System.out.print(i+" , ");
		}
	}
}

 class driver
{
	public static void main(String args[])
	{
		ArmStrongNumber asm=new ArmStrongNumber();
		asm.DisplayNumbers();
	}
}