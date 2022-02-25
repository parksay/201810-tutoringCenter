class DayCalculbyMth
{
	public static int dayCalculbyMth(int year, int month) 
	{
		int i, j, day;
		int[] mth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		day = 0;
		for( i = 1; i < year; i = i + 1)
		{
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}

		for ( j = 0; j < month-1; j = j + 1)
		{	
			if(j == 1)
			{
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
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
				day = day + mth[j];
			}
		}

	return day;
	}

}
