class While_SprSum_OddEven 
{
//�ϳ��� for �������� ¦�� �հ�, Ȧ�� �հ�, �Ѵ� ���ϱ�

	public static void main(String[] args) 
	{
/*
	int on, en, i;
	en = 0; on = 0;
	for(i = 1; i <= 20; i = i + 1)	
	{
		if(i % 2 == 0)
		{
			en = en + i;
		}
		else
		{
			on = on + i;
		}
	}
	System.out.println("¦�� �հ� : " + en + "Ȧ�� �հ� : " + on);
*/

		int en, on, i;
		i = 0; en = 0; on = 0;
		while (i < 20)
		{
			i = i + 1;
			if(i % 2 == 0)
			{
				en = en + i;
			}
			else if( i % 2 != 0)
			{
				on = on + i;
			}
		}
		System.out.println("Ȧ�� �հ� : " + on + "\n "+ "¦�� �հ� : " + en);
	

		System.out.println("Hello World!");
	}
}
