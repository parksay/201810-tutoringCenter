class While_EvenNumberProgs
{
/*
짝수 합계 구하기 - 방법 여러가지
홀수는 건너 뛰기, 짝수 횟수로만 반복하기, 짝수일 때만 진행하기
*/
	public static void main(String[] args) 
	{

		int i, s;
		s = 0;
		for ( i = 2; i < 21; i = i + 2)
		{
			s = s + i;
		}
		System.out.println(s);
	
	
		s = 0; i = 1;
		for ( i = 1; i < 21; i = i + 1)
		{
			if(i % 2 == 0)
			{
				s = s + i;
			}
		}
		System.out.println(s);


		s = 0; i = 1;
		for ( i = 1; i < 21; i = i + 1)
		{
			if ( i % 2 == 0)
			{
				continue;
			}
			s = s + i;
		}
		System.out.println(s);	


/*
위의 for 구문을 while 구문으로 바꿔서 짜보기.

		int x, y, s, i;
		s = 0;
		i = 1;
		while ( i < 20)
		{
			i = i + 1;
			if ( i % 2 == 0)
			{
				s = s + i;
			}
		}
		System.out.println(s);

		s = 0; i = 0;
		while ( i < 20)
		{
			i = i + 2;
			s = s + i;
		}
		System.out.println(s);

		s = 0;  i = 0;
		while ( i < 20)
		{
			i = i + 1;
			if ( i % 2 != 0)
			{
				continue;
			}
			s = s + i;
		} 
		System.out.println(s);
*/

		System.out.println("Hello World!");
	}
}
