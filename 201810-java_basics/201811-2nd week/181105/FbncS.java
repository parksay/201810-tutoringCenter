class FbncS 
{
	public static void main(String[] args) 
	{
		int i, n, m, l;
		n = 1;
		m = 1;
		l = 2;
		for ( i = 1; i <= 10; i = i + 1)
		{
			n = m;
			m = l;
			l = rcf(n, m);
			System.out.print(l + "\t");
		}

		System.out.println("\n");
		int a1 = 1;
		int a2 = 1;
		int a3 = 2;
		i = 1;
		for ( i = 1; i <= 10; i = i + 1)
		{
			a1 = a2;
			a2 = a3;
			a3 = a1 + a2;
			System.out.print(a3 + "\t");
		}
		
		System.out.println("Hello World!");
	}

	public static int rcf(int x, int y)
	{
		int z = x + y;
		return z;
	}
}
