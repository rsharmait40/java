class Pattern4
{
	public static void main(String[] args) 
	{
		int n=0;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(n%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
					n++;
				}
			}
			System.out.println(" ");
		}
		
	}
}