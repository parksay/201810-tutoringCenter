import java.util.Scanner;
class ShTest1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String a, b;
		char c, d;
		int cnt = 0;

		a = sc. nextLine();
		b = sc. nextLine();
		c = a. charAt(0);
		d = b. charAt(0);
	
		for ( ; c <= d; c)
		{
			System.out.print( (int)c + " : " + c + "\t");
				cnt = cnt + 1;
			if ( cnt % 5 == 0)
			{
				System.out.print("\n\r0");
			}
		}
		System.out.println("Hello World!");
	}
}
