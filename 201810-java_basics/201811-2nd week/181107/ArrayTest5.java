import java.util.Scanner;
class ArrayTest5 
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);	
	int ar[];
	int m;
	int sum;
	sum = 0;
	System.out.print("�迭 ũ�� : ");
	m = sc. nextInt();
	ar = new int[m];

	randomNumber(ar);
	print(ar);
	System.out.println("\n");

	add(ar);
	print(ar);
	System.out.println("\n");

	System.out.println(arsum(ar));
	sum = 2 * arsum(ar) + 1;
	System.out.println(sum);


	System.out.println("\n\nHello World!");

//stack�� pointer - arr �̸�, �ּ�, heap�� �޸�
	}
/*
void ��ȯ�ϴ� �޼����, �׳� �����̾�.
int s = ; �̷��� ��. ������, ��.
*/
																																																																								
	public static void randomNumber(int ar[])
	{	
		double x;
		for(int i = 0; i < ar.length; i = i + 1)
		{
			x = Math.random();
			ar[i] = (int)(100 * x / 5);
		}
	}


	public static void print(int ar[])
	{
		System.out.print("[ ");
		for( int i = 0; i < ar.length; i = i + 1)
		{
			System.out.print(ar[i] + ", ");
		}
		System.out.print("\b\b ]");
	}

	public static void dfnArr (int ar[])
	{
		for (int i = 0; i < ar.length; i = i + 1)
		{
			ar[i] = (int)(30 * Math. random() + 5);
		}
	}

	public static void add (int ar[])
	{
		int i;
		for ( i = 0; i < ar.length; i = i + 1)
		{
			ar[i] = ar[i] + 1;
		}
	} 

	public static int arsum (int x[])
	{
		int sum;
		sum = 0;
		for (int i = 0; i < x.length; i = i + 1)
		{
			sum = sum + x[i];
		}
		return sum;
	}
}
