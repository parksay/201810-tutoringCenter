class MethodTest2 
{
	public static void main(String[] args) 
	{
		int a;
		a = power(4, 2);
		System.out.println(a);
		double b = Math. pow(3,5);
		System.out.println(b);
		
		int p, q, r;
		p = sum(50);
		q = sum2(20, 70);
		System.out.println(p);
		System.out.println(q);

		System.out.println("Hello World!");

	}
/*
���� �� �ı� (���� Ŭ���� �ֵ�) �ƴϸ� �³� Ŭ���� �̸��� ���� �ҷ� ��� ��.
b = pow(x, y);�� �ƴϰ�, b = Math. pow(x, y); Math��� Ŭ���� �̸��� ����.
*/
	public static int power(int n, int e)
	{

		int i;
		int res;
		res = 1;
		for (i = 1 ; i <= e; i = i + 1)
		{
			res = n * n; 
		}
		return res;
	}

	public static int sum(int x)
	{	int sum;
		sum = 0;
		for( int i = 1; i <= x; i = i + 1)
		{
			sum = sum + i;
		}
		return sum;
	}
	
/*
�� �޾� �Դ� ������ x, m, n ���� �ǵ��� ���� ����.
�ݺ� ������ �ش� ������ ������ ���� ��찡 �����ϱ�
������ �ٲ����� �� �־�.
*/
	public static int sum2(int m, int n)
	{
		int sum2;
		sum2 = 0;
		for ( ; m <= n; m = m + 1)
		{
			sum2 = sum2 + m;
		}
		return sum2;
	}
/*
�Ķ���� �������� �Ű������� ���, �ٸ� �޼��� ȣ���ϸ鼭 �� �޼������� ������ ���̾�
������ �����. �� ���� ���� ���� �� �� �־�.
�޼��� �̸� ���� �Ұ�ȣ �ȿ��� �ʿ��� ������ ���� �ֳ� ����� ���� �ž�.
�� �޼���� �ش� ������ ��� �޾��� ������ ȣ���� �� �ִ� �ſ�.

*/
}
