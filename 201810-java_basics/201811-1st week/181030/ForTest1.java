class ForTest1
{
	public static void main(String[] args) 
	{
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
	}
}
