class PrintDoubleArr 
{
	public static void printDoubleArr(int arr[][]) 
	{
		int i, j;
		for ( i = 0; i < arr.length; i = i + 1)
		{
			for( j = 0; j < arr[i].length; j = j + 1)
			{
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Hello Big World!");
	}
}
