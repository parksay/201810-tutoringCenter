import java.util.Scanner;
class While_ForSum2
{
	public static void main(String[] args) 
	{
/*
5���� ������ �޾Ƽ� �հ踦 ��������,
������ ��꿡 �������� �����鼭,
����Ƶ� ����, ���� 5���� ��� �޾� ����.

	Scanner sc = new Scanner(System.in);
	int a, i, s, n;
	i = 1;
	s = 0;

	for ( ; i <= 5; i = i + 1)
	{
		System.out.print(i + "�� ° ���� �Է� : " );
		n = sc. nextInt();
		if(n < 0)
		{
			i = i - 1;
			n = 0;
		}
		s = s + n;
	}	

//�� �ٸ� for �������� ��Ÿ�� ����.

	for ( ; i <= 5;)
	{
		System.out.print(i + "�� ° ���� �Է� : " );
		n = sc. nextInt();

		if(n < 0)
		{
			continue;
		}
		i = i + 1;
		s = s + n;
	}	
	System.out.println("�Է°����� �� ���� : " + s);
/*
�������� �������, for ������ ���๮ ������ �־ ��.
���ǹ��� ������ �� ����Ǵ� ���� �ȿ� ������ ����, ������ �ڸ��� ��� ���� ��.
�׷� ��쿣, for ���� ���� �߿� Ư�� ������ ������ ���� Ƚ���� �����ϰ�
Ư�� ������ ���� Ƚ���� ���������� �ʴ�(Ƚ���� ���������� �ʴ�) �ڵ��� ¥�Ⱑ ����
*/
	Scanner sc = new Scanner(System.in);
	int x, s, i;
	i = 1;
	s = 0;

	while (i < 6)
	{
		System.out.print(i + "��° ���� �Է� : ");
		x = sc. nextInt();
		if ( x > 0)
		{
			s = s + x;
			i = i + 1;
		}
	}
	System.out.println("�Է��� �� ��� ���ϸ� : " + s);

	System.out.println("Hello World!");
	}
}
