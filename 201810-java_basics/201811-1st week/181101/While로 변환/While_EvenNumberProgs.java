class While_EvenNumberProgs
{
/*
¦�� �հ� ���ϱ� - ��� ��������
Ȧ���� �ǳ� �ٱ�, ¦�� Ƚ���θ� �ݺ��ϱ�, ¦���� ���� �����ϱ�
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
���� for ������ while �������� �ٲ㼭 ¥����.

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
