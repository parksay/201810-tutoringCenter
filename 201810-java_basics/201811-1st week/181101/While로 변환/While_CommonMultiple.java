class While_CommonMultiple
{
	public static void main(String[] args) 
	{
/*
	int x;
	x = 1;
	for ( ; x < 101; x = x + 1)
	{
		if (x % 4 == 0)
		{
			if ( x % 5 == 0)
				{
					System.out.println("4�� 5�� ����� : " + x);
				}
		}
	}

	x = 1;
	for ( ; x < 101; x = x + 1)
	{
		if (x % 5 == 0 && x % 4 == 0)
		{
			System.out.println("4�� 5�� �����? : " + x);
		}	
	}	

	x = 1;
	boolean m;
	for (; x < 101; x = x + 1)
	{	m = x % 4 == 0 && x % 5 == 0;

		if(m)
		{
			System.out.println("4�� 5�� ����������� : " + x);
		}
	}
*/

		int x;
		x = 0;
		while( x < 101)
		{
			if( x % 4 == 0 && x % 5 == 0)
			{
				System.out.println("4�� 5�� �������� : " + x);
			}
			x = x + 1;
		}
		System.out.println("Hello World!");
	}
}
