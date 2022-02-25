class While_DivisorTest1
{
	public static void main(String[] args) 
	{

/*
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
		int x, m;
		x = 1;
		m = 0;
		while ( x < 101)
		{
			if ( 100 % x == 0)
			{
				System.out.print(x + "\t");
				m = m + 1;

				if ( m % 3 == 0)
				{
				System.out.println();
				}
			}
			x = x + 1;
		}
/* 줄바꿈 명령어의 위치가 중요. 첫 번째 if문과 동등하게 해놓으면,
m의 값이 우연히 3의 배수이면서, x의 값이 계속해서 100의 약수가 아닌 경우,
줄바꿈 명령어를 계속해서 수행하겠지. 줄바꿈 자체를, 100의 약수가 등장했을
경우에만 고려하도록. 즉, 두 번째 if문의 수행 자체를, 첫 번째 if문을 만족하는
경우에만 고려하도록.
*/
		System.out.println("Hello World!");
	}
}
