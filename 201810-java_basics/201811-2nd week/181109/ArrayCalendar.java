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
�Է� ���� �⵵�� ���� ���� ���Ϸ� �����ϴ��� �˾Ƴ��� ��. 
�� �� ���� ���� ���Ϸ� �������� �˾ƾ� ��.
*/
		daytotal = DayCalculbyMth.dayCalculbyMth(year, month);
		System.out.println(daytotal);
//1�� 1�� 1�Ϻ��� �Է� ���� �⵵�� ������ �� ���� �� �� ������ ���ϴ� �޼���.
		
		int mth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//1���� �Է¹޾��� ��츦 ����ؼ� ù ������ 0���� �Է�

		int daystart;
		daystart = (daytotal)%7;
		System.out.println(daystart);
//���� ��¥�� ������ ���ϱ� ���� 7�� ���� �������� ����( �������� ���߱� ���� -4)
		
		System.out.print("��\tȭ\t��\t��\t��\t��\t��\n");
//0=�� 1=ȭ 2=�� 3=�� 4=�� 5=�� 6=��
		int i, j;
		for (i = 0; i < daystart; i = i + 1)
		{	//ù �ֿ� ���ؼ�, ��������ŭ ������ ���			
			
			System.out.print("\t");
		}
	
		int daycnt;
		daycnt=0; //ù �ֿ� ���ϱ��� ������ ������ ����
		for ( i = 1; i <= 7 - daystart; i = i + 1)
		{	//ù �ֿ� ���ؼ�, (7-������) ��ŭ ��¥ ���
			System.out.print(i + "\t");
			daycnt = daycnt + 1;
		}
		
		System.out.println();	//ù�ְ� ������ �� �ٲ�

		int weekcnt;
		weekcnt = 0;	//7�ϸ��� �� �ٲٱ� ���� ī��Ʈ ����
		for (i = daycnt+1; i <= mth[month]; i = i + 1)
		{	//������ ��¥���� �����ϰ�,�迭�� �� �߿� �Է� ���� ���� �ش��ϴ� �� �� ��ŭ ���
			
			System.out.print(i + "\t");
			weekcnt = weekcnt + 1;
			if (weekcnt == 7)
			{	//7�� ��¥ ����� ������ �ٹٲ�
				System.out.println();
				weekcnt = 0;
			}
		}

		System.out.println();
		System.out.println("Hello Big World!");
	}
}
