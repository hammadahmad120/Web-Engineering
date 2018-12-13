//java.util.Scanner;
class myBook{
	
	public static void main(String args[])
	{
		Book test [] = new Book [13];
		test[0] = new Book(1233,"physics","Ben John","zenma Books");  
          test [0].display(); 
	
		
		
	}
	
}
class Book
{
private int ISBN;
 private String name;
private String author;
private String publisher;
 
 public Book()
 {
 
 }
public Book(int isb,String n,String a,String p)
{
    ISBN=isb;
	name=n;
	author=a;
	publisher=p;
}
public void setISBN(int isbn)
{
	ISBN=isbn;
	
}
public int getISBN()
{
	return ISBN;
}
public void setName(String n)
{
	name=n;
	
}
public String getName()
{
	return name;
}
public void setAuthor(String a)
{
	author=a;
	
}
public String getAuthor()
{
	return author;
}
public void setPublisher (String p)
{
	publisher=p;
	
}
public String getPublisher()
{
	return publisher;
}
 public void display()
 {
	 System.out.print("ISBN: "+ISBN);
	 System.out.print("  Book Name: "+name);
	 System.out.print("  Book author: "+author);
	 System.out.println("  Book publisher: "+publisher);
	 System.out.println();
	 
 }


}
