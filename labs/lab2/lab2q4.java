import java.util.Scanner;
class myMarks{
	public static void main(String arg[])
	{
		Marks.setMarks(100);
		Marks std=new Marks(80);
		int num=0;
		while(num!=4)
		{
			System.out.print("1. View Total Marks \n2. View Obtained Marks\n3. Change Obtained Marks\n4. Exit\n Your Choice:");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			
			if(num==1)
				std.printTotal();
			else if(num==2)
				std.printMarksObt();
			else if(num==3)
				System.out.println("You dont have permissionto modify.");
		}
	}
}
class Marks{
	
	static private int totalMarks;
	private int marksObtain;
	
	public Marks(int mo)
	{
		marksObtain=mo;
	}
	public Marks()
	{
		marksObtain=0;
	}
	public static void  setMarks(int m)
	{
		totalMarks=m;
	}
	public void printTotal()
	{
		System.out.println("Total Marks: "+totalMarks);
	}
	public void printMarksObt()
	{
		System.out.println("Marks Obtained: "+marksObtain);
	}
}
