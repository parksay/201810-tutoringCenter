class Loop_Star2 
{
	public static void main(String[] args) 
	{
		int m, n;
		m = 1;
		while( m < 6)
		{
			n = 1;
			while ( n < 6)
			{
				if ( m == n )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				n = n + 1;
			}
			m = m + 1;
			System.out.println();
		}
		System.out.println("\n");
/*
*
 *
  *
   *
    *
     *
*/
		m = 6;
		while (m > 0)
		{
			n = 1;
			while (n < m)
			{
				System.out.print("*");
				n = n + 1;
			}
			m = m - 1;
			System.out.println();
		}
		System.out.println("\n");

/*
*****
****
***
**
*
*/
		m = 1;
		while ( m < 6)
		{
			n = 1;
			while( n < 6 - m)
			{
				System.out.print("*");
				n = n + 1;
			}
			m = m + 1;
			if(m == 6)
			{
				break;
			}
			System.out.println();
		}
		m = 2;
		while ( m < 5)
		{
			n = 0;
			while ( n < m)
			{
				System.out.print("*");
				n = n + 1;
			}
			System.out.println();
			m = m + 1;
		}

/*
****
***
**
*
**
***
****
*/


		m = 1; n = 1;
		for (m = 1; m < 8; m = m + 1)
		{
			System.out.print("\t\t");
			n = 0;
			while (n < m)
			{
				System.out.print("\b");
				n = n + 1;
			}
			n = 0;
			while( n < m * 2 - 1 )
			{
				System.out.print("*");
				n = n + 1;
			}
			m = m + 1;
			System.out.println();
		}

int i;
for(i = 1; i < 6; i = i + 1)
{
		for (m = 6; m > i; m = m - 1)
		{
			System.out.print(" ");
		}
		for (m = 1; m < 2 * i; m = m + 1)
		{
			System.out.print("*");
		}
		System.out.println();
}

/*
    *
   ***
  *****
 *******
*********
*/
		System.out.println("Hello World!");
	}
}
