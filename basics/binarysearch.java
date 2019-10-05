class binarysearch
{
	int binarysearch(int a1[], int x)
	{
		int f=0;
		int l=a1.length-1;

		while(f<=l)
		{
			int mid=(f+l)/2;
			if(a1[mid] == x)
			{
				return 1;
			}
			else if(a1[mid] < x)
			{
				f= mid+1;
			}
			else
			{
				l= mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		binarysearch ob = new binarysearch();
		int a1[]={10,20,30,40,50};
		int n= a1.length;
		int x= 300;
		int result = ob.binarysearch(a1, x);
		if(result== -1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element fount at" + " index " + result);
		}

	}
}