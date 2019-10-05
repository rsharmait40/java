import java.util.Scanner;
class b
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);

		System.out.println("Enter your name");
		String name=s1.nextLine();

		System.out.println("Enter your id");
		int id=s1.nextInt();
		System.out.println("Enter your salary");
		Double sal=s1.nextDouble();
		System.out.println("Enter your mob");
		Long mob=s1.nextLong();


		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(mob);

			
		}
	}
