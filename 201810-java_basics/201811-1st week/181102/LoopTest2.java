class LoopTest2 
{
	public static void main(String[] args) 
	{
		int i, j;
		i = 0;
		j = 0;


		for ( i = 0; i < 5; i = i + 1)
		{
			for ( j = 0; j < 5; j = j + 1)
			{
				System.out.print(i + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
/*
0 0 0 0 0
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
*/

		for ( i = 0; i < 5; i = i + 1)
		{
			for ( j = i; j < 5; j = j + 1)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
/*
 1 2 3 4 5
 2 3 4 5
 3 4 5
 4 5 
 5
//뭔가, 바깥쪽 for구문 i가 안쪽 for구문 j에 관여한다능. 문제는 어디에 어떤 식으로써 관여?
*/

		for ( i = 0; i < 5; i = i + 1)
		{
			for ( j = 0; j <= i; j = j + 1)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
/*
1
1 2
1 2 3 
1 2 3 4 
1 2 3 4 5
*/

		for ( i = 0; i < 5; i = i + 1)
		{
			for ( j = i; j < (i + 5); j = j + 1)
			{
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
/*
1 2 3 4 5
2 3 4 5 6
3 4 5 6 7
4 5 6 7 8
5 6 7 8 9
*/
		System.out.println("Hello World!");
	}
}
