class IncDcr
{
	public static void main(String[] args) 
	{
		int x1=10;
		int y1=10;
		int res1;
		int res2;

		System.out.println(x1);
		res1= ++x1 + 10;
		System.out.println(res1);
		System.out.println(x1);

		System.out.println("-------------------");

		System.out.println(y1);
		res2= y1++ + 10;
		System.out.println(res2);
		System.out.println(y1);	
		
	}
}