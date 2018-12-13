//java.util.Scanner;
class myStudent{
	
	public static void main(String args[])
	{
		Student.changeUni();
		Student s1=new Student("Bcsf15m009","Hammad");
		Student s2=new Student("Bcsf15m028","Mubshar");
		Student s3=new Student("Bcsf15m004","Amir");
		s1.display();
		
		System.out.println();
	s2.display();
System.out.println();
s3.display();
System.out.println();	
		
		
	}
	
}
class Student
{
private String rollno;
 private String name;
private static String uniName;
 
 public static void changeUni()
 {
	 uniName="PUCIT";
 }
public Student(String r,String n)
{
	name=n;
	rollno=r;
}
 public void display()
 {
	 System.out.println("Roll No: "+rollno);
	 System.out.println("Name: "+name);
	 System.out.println("University: "+uniName);
	 
 }


}
