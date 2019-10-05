class Android
{
	public void showhomescreen()
	{
		System.out.println("show 8 icon on screen");
	}
}
class Samsung extends Android
{
	public void showhomescreen()
	{
		System.out.println("show 10 icon on screen");
	}
}
class Mi extends Android
{
	public void showhomescreen()
	{
		System.out.println("show 5 icon on screen");
	}
}
class Moto extends Android
{

}
class Mainclass3
{
	public static void main(String[] args)
	{
		
	
		Samsung s1=new Samsung();
		s1.showhomescreen();

		Mi m1=new Mi();
		m1.showhomescreen();

		Moto mo1=new Moto();
		mo1.showhomescreen();
	}

}