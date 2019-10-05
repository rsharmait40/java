class Casting2
{
	public static void main(String[] args) 
	{
		char c1='A';
		int i1= (int) c1;

		System.out.println(c1);
		System.out.println(i1);

		int i2 = 70;
		char c2 = (char)(i2+13);

		System.out.println(i2);
		System.out.println(c2);
	}
}