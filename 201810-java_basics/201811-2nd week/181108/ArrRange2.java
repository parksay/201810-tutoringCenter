class ArrRange2 
{
	public static void main(String[] args) 
	{
	int ar[];
	int cnt1, cnt2, n;
	cnt1 = 0; cnt2 = 0;
	ar = new int[10];

	randomNumber(ar);
	print(ar);
	System.out.println();

	arrBubble2(ar);
	print(ar);
	System.out.println("\n");

	ar = randomNumber(ar);
	print(ar);
	System.out.println("\n");
	for ( int i = 0; i < ar.length; i = i + 1)
	{
		for(int j = i + 1; j < ar.length; j = j + 1)
		{
			cnt1 = cnt1 + 1;
			if(ar[i] > ar[j])
			{
				cnt2 = cnt2 + 1;
				n = ar[i]; ar[i]= ar[j]; ar[j] = n;
			}
		}
	}
	print(ar);

	System.out.println("\n");
	System.out.println("ºñ±³ È½¼ö : " + cnt1);
	System.out.println("±³È¯ È½¼ö : " + cnt2);
	System.out.println("\n");
	
		System.out.println("Hello World!");

	}



	public static int[] randomNumber(int ar[])
	{	
		for(int i = 0; i < ar.length; )
		{
			ar[i] = (int)(45 * Math.random() + 1);
			for(int m = 0; m < i; m = m + 1)
			{
				if(ar[i] == ar[m])
				{
					break;
				}
			}		
			i = i + 1;
		}
		return ar;
	}


	public static void print(int ar[])
	{
		System.out.print("[ ");
		for( int i = 0; i < ar.length; i = i + 1)
		{
			System.out.print(ar[i] + ", ");
		}
		System.out.print("\b\b ]");
	}
	
	public static int[] arrBubble2 (int ar[])
	{
		int i, j, lar;
		for(i = 0; i < ar.length; i = i + 1)
		{
			for(j = 0; j < ar.length - i -1; j = j + 1)
			{
				if(ar[j] > ar[j + 1])
				{
					lar = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = lar;
				}
			}
		}
		return ar;
	}
		
 
}
