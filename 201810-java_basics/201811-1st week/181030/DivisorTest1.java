class DivisorTest1
{
	public static void main(String[] args) 
	{
	int x = 1;
	int m = 0;
	for ( ; x < 101 ; x = x + 1)
	{
		if (100 % x == 0)
		{
			System.out.print( x + "  ");
			m = m + 1;
		}
			if ( m == 3)
			{
				System.out.print("\n");
			m = m - 3;
			}
		}
	

/*
	for ( ; x < 101 ; x = x + 1)
	{
		if (100 % x == 0)
		{
			System.out.print( x + "  ");
			m = m + 1;
		
			if ( m % 3 == 0)
			{
				System.out.print("\n");
			}
		}
	}
*/
	
		System.out.println("Hello World!");
	}
}
