class globlocal
{
	 static int v1=20;  //global variable

	public static void test()
	{
		System.out.println("test of sample class");
		double z1=13.1; //local variable
		System.out.println("v1 ="+ v1);
		System.out.println("z1 ="+z1);
	}
	public static void main(String[] args)
	{
		System.out.println("Program starts");

		System.out.println("v1 ="+v1);
		v1=33;
		test();

		System.out.println("Program ends");
		
	}
}