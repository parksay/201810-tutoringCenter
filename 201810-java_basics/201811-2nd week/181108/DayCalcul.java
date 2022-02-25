import java.util.Scanner;
class DayCalcul 
{
	public static int CalDay(int x, int y, int d) 
	{
		Scanner sc = new Scanner(System.in);
		int n, m, day;
		day = 0;
		int[] mth;
		mth = new int[12];
		mth[0] = 31;
		mth[1] = 28;
		mth[2] = 31;
		mth[3] = 30;
		mth[4] = 31;
		mth[5] = 30;
		mth[6] = 31;
		mth[7] = 31;
		mth[8] = 30;
		mth[9] = 31;
		mth[10] = 30;
		mth[11] = 31;

		for( n = 1; n < x; n = n + 1)
		{
			if(n % 4 == 0 && n % 100 != 0 || n % 400 == 0)
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}

		for ( m = 0; m < y-1; m = m + 1)
		{	
			if(m == 1)
			{
				if(x % 4 == 0 && x % 100 != 0 || x % 400 == 0)
				{
					day = day + 29;
				}
				else
				{
					day = day + 28;
				}
			}
			else
			{	
				day = day + mth[m];
			}
		}
		day = day + d;
		System.out.println(day);
	return day;
	}
}
