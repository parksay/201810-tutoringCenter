class PrimeNumber1
{
	public static void main(String[] args) 
	{
		int a, b;

		g:for ( a = 2; a < 100; a = a + 1)
		{
			for( b = 2; b <= a/2; b = b + 1)
			{
				if( a % b == 0)
				{
					continue g;
				}
			}
			System.out.printf("%3d" + "\t", a);
		}
		System.out.println("\n");
/*
이거는 그냥 소수냐 or 아니냐만 판단하면 되는 상황이지만,
만약 더 끝에 뭔가 처리해야 할 일이 남았다면, 그 후에 
넘어가고 싶다면, 이런 코딩은 쓸 수가 없지
*/
		int n;
		for ( a = 2; a < 100; a = a + 1)
		{
			n = 0;
			for( b = 1; b <= a; b = b + 1)
			{
				if( a % b == 0)
				{
					n = n + 1;
				}
			}
			if( n == 2)
			{
				System.out.printf("%3d" + "\t", a);
			}
		}
		System.out.println("\n");
/*
이렇게 갯수를 세는 식으로 하면, 위에서 경우를 나누어서 만들고,
밑에서 if문으로 각 경우마다 어떻게 처리하라, 하는 식으로 만들 수 있으니,
우선은 끝까지 연산하는 것이 가능해지겠지.
b <= a/2 일 때, (b, n) = (2,0) or (1, 1)
b <= a 일 때, (b,n) = (2, 1) or (1, 2)
*/


		System.out.println("Hello World!");

	}
}
