class While_SprSum_OddEven 
{
//하나의 for 구문으로 짝수 합계, 홀수 합계, 둘다 구하기

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
	System.out.println("짝수 합계 : " + en + "홀수 합게 : " + on);
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
		System.out.println("홀수 합계 : " + on + "\n "+ "짝수 합계 : " + en);
	

		System.out.println("Hello World!");
	}
}
