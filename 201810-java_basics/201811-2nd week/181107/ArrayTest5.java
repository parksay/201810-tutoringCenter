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
	System.out.print("배열 크기 : ");
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

//stack이 pointer - arr 이름, 주소, heap이 메모리
	}
/*
void 반환하는 메서드면, 그냥 공란이야.
int s = ; 이렇게 돼. 에러지, 뭐.
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
