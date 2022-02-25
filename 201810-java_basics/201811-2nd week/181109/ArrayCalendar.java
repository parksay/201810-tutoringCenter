import java.util.Scanner;
class ArrayCalendar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int year, month, daytotal;
		year = sc. nextInt();
		month = sc. nextInt();
/*
입력 받은 년도의 월이 무슨 요일로 시작하는지 알아내야 함. 
그 전 월이 무슨 요일로 끝나는지 알아야 함.
*/
		daytotal = DayCalculbyMth.dayCalculbyMth(year, month);
		System.out.println(daytotal);
//1년 1월 1일부터 입력 받은 년도의 월까지 일 수가 총 몇 개인지 구하는 메서드.
		
		int mth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//1월을 입력받았을 경우를 대비해서 첫 시작을 0으로 입력

		int daystart;
		daystart = (daytotal)%7;
		System.out.println(daystart);
//시작 날짜의 요일을 구하기 위해 7로 나눈 나머지를 구함( 월요일을 맞추기 위해 -4)
		
		System.out.print("월\t화\t수\t목\t금\t토\t일\n");
//0=월 1=화 2=수 3=목 4=금 5=토 6=일
		int i, j;
		for (i = 0; i < daystart; i = i + 1)
		{	//첫 주에 한해서, 나머지만큼 공백을 출력			
			
			System.out.print("\t");
		}
	
		int daycnt;
		daycnt=0; //첫 주에 몇일까지 찍히나 세려고 선언
		for ( i = 1; i <= 7 - daystart; i = i + 1)
		{	//첫 주에 한해서, (7-나머지) 만큼 날짜 출력
			System.out.print(i + "\t");
			daycnt = daycnt + 1;
		}
		
		System.out.println();	//첫주가 끝나고 줄 바꿈

		int weekcnt;
		weekcnt = 0;	//7일마다 줄 바꾸기 위해 카운트 정의
		for (i = daycnt+1; i <= mth[month]; i = i + 1)
		{	//나머지 날짜에서 시작하고,배열의 값 중에 입력 받은 월에 해당하는 일 수 만큼 출력
			
			System.out.print(i + "\t");
			weekcnt = weekcnt + 1;
			if (weekcnt == 7)
			{	//7개 날짜 출력할 때마다 줄바꿈
				System.out.println();
				weekcnt = 0;
			}
		}

		System.out.println();
		System.out.println("Hello Big World!");
	}
}
