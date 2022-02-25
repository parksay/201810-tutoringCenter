import java.util.Scanner;
class Double_For99dan
{
	public static void main(String[] args) 
	{
	int x, y, z;
	for( x = 1; x < 10; x = x + 1)
		{
			for(y = 1; y <= 9; y = y + 1)
			{
				System.out.print(y + "*" + x + "=" + x*y+ "\t");
			}
			System.out.println("\n");
		}

//구구단 가로로 출력
	for ( z = 1; z < 4; z = z + 1)
	{
		for( x = 1; x < 10; x = x + 1)
		{
			for(y = 1; y <= 9; y = y + 1)
			{
				System.out.print(y + "*" + x + "=" + x*y+ "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}
			System.out.println("Hello World!");
	}
}
