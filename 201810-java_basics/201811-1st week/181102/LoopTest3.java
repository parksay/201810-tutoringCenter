class LoopTest3 
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
				if (i == j)
				{
					System.out.print("1\t");
				}
				else
				{
					System.out.print("0\t");
				}		
			}
			System.out.println("\n");
		}
		System.out.println("\n");

/*
1 0 0 0 0
0 1 0 0 0
0 0 1 0 0
0 0 0 1 0 
0 0 0 0 1
*/

		for ( i = 0; i < 5; i = i + 1)
		{
			for ( j = 0; j < 5; j = j + 1)
			{
				if (i == j)
				{
					System.out.print(i + "\t");
				}
				else
				{
					System.out.print("0\t");
				}		
			}
			System.out.println("\n");
		}
		System.out.println("\n");
/*
위에꺼
System.out.print((i == j ? i : 0) + "\t");
이것도 좋음. if구문 나눌 게 두 개밖에 없으면 그냥
삼항 연산자 쓰는 게 더 효율적일듯
*/

/*
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
*/

	for(i = 1; i < 26; i = i + 1)
	{
		System.out.print(i + "\t");
		if ( i % 5 == 0)
		{
			System.out.println("\n");
		}
	}
	System.out.println("\n");



	for (i = 0; i < 5; i = i + 1)
	{
		for ( j = 0; j < 5; j = j + 1)
		{
			System.out.print((i*5 + j) + "\t");
		}
		System.out.print("\n");
	}

차라리 변수 하나를 더 만들어서 혼자 계속 증가하도록 하고,
관여한는 식은 없도록 해놓고,
안쪽 for는 계속 변수 찍으라고 해놓고,
바깥쪽 for는 5개 마다 줄 바꾸라고 해놓고
/*
1 2 3 4 5 
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
		System.out.println("Hello World!");
	}
}
