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
/* �ٹٲ� ��ɾ��� ��ġ�� �߿�. ù ��° if���� �����ϰ� �س�����,
m�� ���� �쿬�� 3�� ����̸鼭, x�� ���� ����ؼ� 100�� ����� �ƴ� ���,
�ٹٲ� ��ɾ ����ؼ� �����ϰ���. �ٹٲ� ��ü��, 100�� ����� ��������
��쿡�� ����ϵ���. ��, �� ��° if���� ���� ��ü��, ù ��° if���� �����ϴ�
��쿡�� ����ϵ���.
*/
		System.out.println("Hello World!");
	}
}
