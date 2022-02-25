import java.util.Scanner;
class ArrayTest7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 : ");
		int x = sc. nextInt();	
		int r[];
		r = new int [x];
	ArrayTest6.randomNumber(r);
	ArrayTest6.print(r);
		System.out.println("\n");

		r = dscarr(r);
	ArrayTest6. print(r);
		System.out.println("Hello World!");
	}

	public static int[] dscarr(int ar[])
	{
		int i, m, x;
		for(i = 0; i < ar.length; i = i + 1)
		{
			for(m = i; m < ar.length; m = m + 1)
			{
				if (ar[i] < ar[m])
				{
					x = ar[i];
					ar[i] = ar[m];
					ar[m] = x;
				}
			}
		}
		return ar;
	}
}

