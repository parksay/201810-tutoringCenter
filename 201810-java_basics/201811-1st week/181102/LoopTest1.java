class LoopTest1 
{
	public static void main(String[] args) 
	{
/*

		int i, j;
		a:
		for ( i = 0; i < 5; i = i + 1)
		{	
			b:
			for (j = 0 ; j < 5; j = j + 1)
			{
				if ( i == 2 && j == 2)
				{
					continue a;
				}
				System.out.println("i = " + i + ",\t j = " + j);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~");
		}
*/


		int m, n;
		m = -1;
		a:
		while ( m < 5)
		{
			m = m + 1;
			n  = 0;
			while ( n < 5)
			{
				n = n + 1;
				if ( m == 1 && n == 2)
				{
					continue a;
				}
				System.out.println("m = " + m + "\tn = " + n);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		System.out.println("Hello World!");
	}
}
