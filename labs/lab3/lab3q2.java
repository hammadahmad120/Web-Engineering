interface StudentData
{
	public void setName(String n);
 public String getName();
public void setCGPA(double d);
public double getCGPA();
public void setRollno(String r);
 public String getRollno();
 
}
class Student implements StudentData
{
	private String name;
	private String rollno;
	private double cgpa;
	Student()
	{
		name="not define";
		rollno="not define";
		cgpa=0;
	}
	public void setName(String n)
	{
		name=n;
	}
 public String getName()
 {
	 return name;
 }
public void setCGPA(double c)
{
	cgpa=c;
}
public double getCGPA()
{
	return cgpa;
}
public void setRollno(String r)
{
	rollno=r;
}
 public String getRollno()
 {
	 return rollno;
 }
	

}

 class driver
{
	public static void main(String args[])
	{
Student s=new Student();
s.setName("ahmad");
s.setRollno("BCSF15M025");
s.setCGPA(3.52);
System.out.println("Name is : "+s.getName()+"\n Roll no is : "+s.getRollno()+"\n CGPA is: "+s.getCGPA());
	}
}