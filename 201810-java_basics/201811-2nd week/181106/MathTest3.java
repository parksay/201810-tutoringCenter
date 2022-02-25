class MathTest3
{
	public static void main(String[] args) 
	{
		int a;
		double b;
		
		b = Math.floor(-1.1);
		a = Math.abs(-12);
		System.out.println(a);
		System.out.println(b);
		System.out.println("\n");

		b = Math.sqrt(9);
		System.out.println(b);
		System.out.println("\n");

		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		b = Math.random();
		System.out.println(b);
		

		double sum;	
		sum = 0;
		for ( int i = 1; i <= 100; i = i + 1)
		{
			while ( b < 1)
			{
				b = b * 10;
			}
			b = (int)b;
			sum = sum + b;
		}
		System.out.println(sum/10);
// 1~10의 숫자 100개 랜덤 받아서 총합 구하기

		for(int i = 1; i <= 10; i = i + 1)
		{
			b = Math. random();
			while ( b < 1)
			{
				b = b * 10;
			}
			b = (int)b;	
			System.out.println(10*b);
		}



		System.out.println("Hello World!");
	}
}
