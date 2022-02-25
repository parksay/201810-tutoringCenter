class JvTest3 
{
	public static void main(String[] args) 
	{
	int i;
	i = 1;
	for ( ; i <= 30; i = i + 1)
	{
		if ( i % 3 == 0)
		{
			continue;
		}
	System.out.print(i + "  "); 
	}
		System.out.println("\nHello World!");
	}
}
