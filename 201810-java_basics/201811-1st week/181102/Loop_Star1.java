class Loop_Star1 
{
	public static void main(String[] args) 
	{
		int m, n;

		for( m = 1; m < 6; m = m + 1)
		{
			for( n = 1; n < 6; n = n + 1)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n");
/*
*****
*****
*****
*****
*****
*/

		for (m = 1; m < 6; m = m + 1)
		{
			for (n = 1; n < (m + 1); n = n + 1)
			{
				System.out.print("*");
			}
			System.out.println();
		}	
		System.out.println("\n");

/*
*
**
***
****
*****
*/
		
		for( m = 1; m < 6; m = m + 1 )
		{
			for( n = 1; n < 6; n = n + 1)
			{
				if ( (n + 1) > m)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
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



		System.out.println("Hello World!");
	}
}
