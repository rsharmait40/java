class strprogram
{
	public static String test(String str)
	{
		string res=" ";
		for(int i=0;i<str.length();i++)
		{
			char c1=str.charAT(i);
			if (c1 != 'a' && c1 != 'A' &&
				c1 != 'e' && c1 != 'E' &&
				c1 != 'i' && c1 != 'I' &&
				c1 != 'o' && c1 != 'O' &&
				c1 != 'u' && c1 != 'U')
			{
				res=res + str.charAT(i);
			}
			return res;
		}

	}
		
        public static void main(String[] args) 
		{
			String s1=test("jspider");
			System.out.println(s1);
			
		}
}