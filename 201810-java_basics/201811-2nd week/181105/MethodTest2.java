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
같은 집 식구 (같은 클래스 애들) 아니면 걔네 클래스 이름도 같이 불러 줘야 해.
b = pow(x, y);가 아니고, b = Math. pow(x, y); Math라는 클래스 이름도 같이.
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
수 받아 왔던 변수인 x, m, n 등을 건들일 때는 조심.
반복 구문에 해당 변수를 범위로 쓰는 경우가 있으니까
범위가 바껴버릴 수 있어.
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
파라미터 전달인자 매개변수값 등등, 다른 메서드 호출하면서 그 메서드한테 보내는 값이야
가지고 가라고. 그 값도 여러 개를 줄 수 있어.
메서드 이름 옆에 소괄호 안에는 필요한 재료들이 뭐가 있나 명시해 놓는 거야.
그 메서드는 해당 재료들을 모두 받았을 때에만 호출할 수 있는 거여.

*/
}
