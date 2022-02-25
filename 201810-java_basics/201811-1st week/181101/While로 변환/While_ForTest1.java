class While_ForTest1
{
	public static void main(String[] args) 
	{
/*

		int ct;
		ct=0;
		for(int i = 1; i < 10; i = i + 2)
		{
			System.out.println(i + "Hello World!\n");
		}
		for(int i = 0; i < 10; i = i + 2)
		{
			System.out.println(i + "Hello World!\n");
		}	
		for(int i = 10; i <101; i = i + 10)
		{
			System.out.println(i + "Hello World!\n");
			ct=ct+1;
		}
		for (int i = 5; i > 0; i = i - 1)
		{
			System.out.println(i + "Hello World!\n");
		}
		System.out.println(ct + "Hello World!");

		
*/

		int i, m;
		m = 0;
		i = 1;
		while ( i < 11)
		{
			System.out.println(i + "Hello World!\n");
			i = i + 2;
		}
		i = 0;
		while ( i < 11)
		{
			i = i + 2;
			System.out.println(i + "Hello World!\n");
		}
		i = 0;
		while ( i < 101)
		{
			i = i + 10;
			System.out.println(i + "Hello World!\n");
		}
		i = 0;
		while ( i < 101)
		{
			i = i + 12;
			System.out.println(m + "¹øÂ°" + i + "Hello World!\n");
			m = m + 1;
		}
		while ( i < 11)
		{
			System.out.println(i + "Hello World!\n");
		}
	}
}
