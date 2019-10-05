class Casting
{
	public static void main(String[] args) 
	{
		int x1=20;
		double y1=x1; //widening the data type value;

		System.out.println(x1);
		System.out.println(y1);

		double x2 = 23.32;  //narowing the data type value
		int y2 = (int)x2; //casting statement

		System.out.println(x2);
		System.out.println(y2);		
	}
}