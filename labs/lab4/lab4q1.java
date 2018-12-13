import java.io.*;
import java.util.Scanner;
 class driver 
{

	static boolean  checkPalindrome(String a)
	{
		char [] rev = a.toCharArray();
		int size = a.length()-1;
		for(int i=0;i<a.length();i++,size--)
		{
			if(rev[i]!=rev[size])
				return false;
		}
		
		return true;
	}
	public static void main(String[] args)
	{
		String buffer[];
		String input;
		Scanner getInput = new Scanner(System.in);
		System.out.print("Enter a String:  ");
		input = getInput.nextLine();
		
		try
		{
			FileWriter fout = new FileWriter("sFile.txt");
			fout.write(input);
			fout.close();
		}
		
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		buffer = input.split(" ");
		
		System.out.println("Palindromes in the String are:");
		for (int i=0;i < buffer.length;i++ )
		{
			if(checkPalindrome(buffer[i]))
				System.out.println(buffer[i]);
		}
	}

}
