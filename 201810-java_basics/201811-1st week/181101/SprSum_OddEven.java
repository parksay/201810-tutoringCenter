class SprSum_OddEven 
{
//�ϳ��� for �������� ¦�� �հ�, Ȧ�� �հ�, �Ѵ� ���ϱ�
	public static void main(String[] args) 
	{
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
			
		System.out.println("Hello World!");
	}
}
