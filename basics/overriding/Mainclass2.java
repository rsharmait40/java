class Sample
{
	public void count(int n)
	{
		System.out.println("count() of sample");
		for(int i=1; i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
class Demo
{
	public void count(int m)
	{
		System.out.println("count() of demo");
		for(int j=m;j<=1;j++)
		{
			System.out.println(j);
		}
	}
}
class Mainclass2
{
	public static void main(String[] args)
	{
		System.out.println("program starts...");

		Sample s1=new Sample();
		s1.count(5);

		Demo d1=new Demo();
		d1.count(5);

		System.out.println("program ends");
		
	}
}