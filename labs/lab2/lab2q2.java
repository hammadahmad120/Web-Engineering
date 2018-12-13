class myBox{
	
	public static void main(String args[])
	{
		Box obj=new Box(2);
		obj.displayVolume();
		
		
		
	}
	
}
class Box
{
private int height;
 private int width;
private int depth;
 
 public Box()
 {
	 
 }
  public Box(int h,int w,int d)
  {
	 height=h;
	 width=w;
	 depth=d;
 }
 public Box(Box obj)
 {
	 height=obj.height;
	 width=obj.width;
	 depth=obj.depth;
	 
 }
 public Box(int l)
 {
	 height=l;
	 width=l;
	 depth=l;
 }
 public void displayVolume()
 {
	 int vol;
	 vol=height*width*depth;
	 if(height==0&&width==0&&depth==0)
		  System.out.println("dimensions not specified,hence Volume is 0 ");
	 else if(height==width&&width==depth)
	 {
		 
		 System.out.println("Volume of cube is : "+vol);
	 }
	 else
		 System.out.println("Volume of Box is : "+vol);
 }
 


}
