import java.io.*;
import java.util.Scanner;
class FileClass 
{
	String fname;
	FileClass(String n)
	{
		fname=n;
		
		int i = 0;
		try {
			FileOutputStream fout = new FileOutputStream(fname);
		FileInputStream fin = new FileInputStream("File.txt");
			
			while ((i = fin.read()) != -1) {
				char c=(char)i;
				fout.write(c);
			}
			fin.close();
			fout.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		
		
				try {
               FileInputStream fin1 = new FileInputStream(n);
			
			while ((i = fin1.read()) != -1) {
				System.out.print((char)i);
			}
			fin1.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
	public void processRslt(int min,int max)
	{
		int ary[]={5,7,13,15,19,60};
		int n=0;
		while(n!=4)
		{
			Scanner in=new Scanner(System.in);
			System.out.println("Enter choice: ");
			n=in.nextInt();
			if(n==1)
			{
				int fact=1;
				while(max>=2)
				{
					fact=fact*(max-1);
					max--;
				}
				System.out.println("Factorial is : "+fact);
			}
			else if(n==2)
			{
				
				int c=calPrime(ary);
				
				System.out.println("Primes are : "+c);
			}
			else if(n==3)
			{
				calEvenOdd(ary);
				
			}
				
		}
	}
		public int calPrime(int a[])
		{
			int total=0;
			for(int i=0;i<6;i++)
			{
				boolean check=true;
				int no=a[i];
				for(int j=2;j<=a[i]/2;j++)
				{
					
					if(no%j==0)
						check=false;
					
				}
				if(check)
					total++;
			}
			return total;
		}
		public void calEvenOdd(int a[])
		{
			int e=0,o=0;
			for(int i=0;i<6;i++)
			{
				if(a[i]%2==0)
					e++;
				else
					o++;
			}
		 System.out.println("Even are : "+e+ " odd are : "+o);
			
		}
		

			}
			
 class driver
 {
	 public static void main(String args[]) {
		 FileClass obj= new FileClass("data.txt");
		 obj.processRslt(2,5);
	 }
 }
	

