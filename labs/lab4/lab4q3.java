 class MyThread extends Thread {
	
	public void run() {
		for(int i=0;i<=10;i++)
		{
		if(i%2==0)
		System.out.println(i);
		}
		
	}
}
 class driver
{
	public static void main(String args[]) {
		Thread th = new MyThread();
		th.start();
		for(int i=0;i<10;i++)
		{
		if(i%2==1)
		System.out.println(i);
		}
	}
}