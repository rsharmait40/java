class Pattern3
{
	public static void main(String[] args) 
	{
		char ch='F';
		for(int i=1; i<=3; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(ch);
				ch--;
			}
			System.out.println(" ");
		}
		
	}
}  