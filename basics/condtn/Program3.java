class Program3
{
	public static void main(String[] args)
	{
		int signal=5;
		//0=red 1=yellow 5=green.

		if(signal==0)
		{
			System.out.println("Stop");
		}
		else if(signal==1)
		{
			System.out.println("Get ready");
		}
		else
		{
			System.out.println("Go");
		}
	}
}