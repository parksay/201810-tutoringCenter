import java.util.Scanner;
class ArrayTest6 
{
	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 : ");
		int x = sc. nextInt();
		int ar[];
		int arcp[];
		int arr[];
		int arrg[];
		ar = new int[x];
		arr = new int[ar.length];
		randomNumber(ar);
		print(ar);
		System.out.println("\n");

		arcp = copyarr(ar);
		print(arcp);
		System.out.println("\n");
/*
		arr = rngar(ar);
		print(ar);
		System.out.println("\n");
*/
		arrg = arrg(ar);
		print(ar);
		System.out.println("Hello World!");
	}
	

	public static int[] copyarr (int x[])
	{
		int y[];
		y = new int[x.length];

		for(int i = 0; i < x.length; i = i + 1)
		{
			y[i] = x[i];
		}
		return y;
	}


	public static int[] randomNumber(int ar[])
	{	
		for(int i = 0; i < ar.length; )
		{
			ar[i] = (int)(45 * Math.random() + 1);
			for(int m = 0; m < i; m = m + 1)
			{
				if(ar[i] == ar[m])
				{
					break;
				}
			}		
			i = i + 1;
		}
		return ar;
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

	public static int[] rngar(int ar[])
	{
		int g;
		g:for( int m = 0; m < ar.length;)
		{
			for ( int n = m; n < ar.length; n = n + 1 )
			{
				if( ar[m] > ar[n] ) 
				{
					g = ar[m];
					ar[m] = ar[n];
					ar[n] = g;
					continue g;
				}
			}
			m=m+1;
		}
		return ar;
	}

	public static int[] arrg (int ar[])
	{ 
		int i, j, a;
		for ( i = 0; i < ar.length; i = i + 1)
		{
			for(j = i; j < ar.length; j = j+ 1)
			{
				if (ar[i] > ar[j])
				{
					a = ar[i];
					ar[i] = ar[j];
					ar[j] = a;
				} 
			}
		}
		return ar;
	}
}
