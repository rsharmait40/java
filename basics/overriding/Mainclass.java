class Whatsappv1
{
	public void Showtick()
	{
		System.out.println("Show one black tick mark");
	}
}
class Whatsappv2 extends Whatsappv1
{
	@Override
	public void Showtick()
	{
		System.out.println("show two black tic mark");
	}
}
class Whatsappv3 extends Whatsappv2
{
	@Override
	public void Showtick()
	{
		System.out.println("show two blue tick mark");
	}
}
class Mainclass
{
	public static void main(String[] args) 
	{
		System.out.println("program starts....");


		Whatsappv1 v1= new Whatsappv1();
		v1.Showtick();

		Whatsappv2 v2 = new Whatsappv2();
		v2.Showtick();

		Whatsappv3 v3 = new Whatsappv3();
		v3.Showtick();

		System.out.println("program ends....");

		
	}
}