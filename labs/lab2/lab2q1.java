class jackary{
	
	public static void main(String args[])
	{
		int ary[][]=new int[4][];
		 ary[0]=new int[1];
		 ary[1]=new int[2];
		 ary[2]=new int[3];
		 ary[3]=new int[4];
		int j=0;
		for (int i=0;i<4;i++)
		{
			for(int k=0;k<=j;k++)
			{
				ary[i][k]=i+k;
			}
			j++;
		}
		j=0;
		for (int i=0;i<4;i++)
		{
			for(int k=0;k<=j;k++)
			{
				System.out.print(ary[i][k]);
			}
			System.out.println();
			
			j++;
		}
		
		
	}
	
}