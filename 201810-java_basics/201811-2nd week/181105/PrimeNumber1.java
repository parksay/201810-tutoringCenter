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
�̰Ŵ� �׳� �Ҽ��� or �ƴϳĸ� �Ǵ��ϸ� �Ǵ� ��Ȳ������,
���� �� ���� ���� ó���ؾ� �� ���� ���Ҵٸ�, �� �Ŀ� 
�Ѿ�� �ʹٸ�, �̷� �ڵ��� �� ���� ����
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
�̷��� ������ ���� ������ �ϸ�, ������ ��츦 ����� �����,
�ؿ��� if������ �� ��츶�� ��� ó���϶�, �ϴ� ������ ���� �� ������,
�켱�� ������ �����ϴ� ���� ������������.
b <= a/2 �� ��, (b, n) = (2,0) or (1, 1)
b <= a �� ��, (b,n) = (2, 1) or (1, 2)
*/


		System.out.println("Hello World!");

	}
}
