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
//���� ������ ���η� ���

		for( x = 1; x < 10; x = x + 1)
		{
			for(y = 1; y <= 9; y = y + 1)
			{
				System.out.print(y + "*" + x + "=" + x*y+ "\t");
			}
			System.out.println("\n");
		}
		System.out.println("\n");
//���� for ���η� ���
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
//���� while ���η� ���
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
//���� while ���η� ���
			System.out.println("Hello World!");
	}
}
