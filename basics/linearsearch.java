public class linearsearch
{
	public static int linearsearch(int[] a1, int x)
	{
		for(int i=0; i<a1.length; i++)
		{
			if(a1[i] == x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int[] a1={23, 329,3922,44,33,67,20};
		int x=67;
		System.out.println(x+"is found at index: "+ linearsearch(a1,x));
		
	}
}