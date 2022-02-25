import java.util.Scanner;
class While_Double_For99dan
{
	public static void main(String[] args) 
	{
	int x, y, z;
	for( x = 1; x < 10; x = x + 1)
		{
			for(y = 1; y <= 9; y = y + 1)
			{
				System.out.print(x + "*" + y + "=" + x*y+ "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
//위는 구구단 가로로 출력

		for( x = 1; x < 10; x = x + 1)
		{
			for(y = 1; y <= 9; y = y + 1)
			{
				System.out.print(y + "*" + x + "=" + x*y+ "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
//위는 for 세로로 출력
		x = 1;
		while (x < 10)
		{
			y = 1;
			while (y < 10)
			{
				System.out.print(x + "*" + y + "=" + x*y + "\t");
				y = y + 1;
			}
			System.out.println();
			x = x + 1;
		}
		System.out.println("\t");
//위는 while 세로로 출력
		x = 1;
		while ( x < 10 )
		{
			y = 1;
			while ( y < 10 )
			{
				System.out.print(y + "*" + x + "=" + x*y + "\t");
				y = y + 1;
			}
			x = x + 1;
			System.out.println();
		}
//위는 while 가로로 출력
			System.out.println("Hello World!");
	}
}
