import java.util.Scanner;
class While_ForSum1  
{
	public static void main(String[] args) 
	{


/*
	Scanner sc = new Scanner(System.in);
	int i, n, s;
	i = 1;
	s = 0;
	for ( ; i <= 5; i = i + 1)
	{
		System.out.print("����" + i + "�� ° �Է� : ");
		n = sc. nextInt();
		if (n == 0)
		{
			i = 6;
		}
		if (n < 0)
		{
			n = 0;
		}
		s = s + n;
	}
	System.out.println("�հ��" + s);

/* ������ �Է� ������, �հ� ���� ������ ����.
���� ������ if������ �����ϴ� if������ �ڸ��� ���� �ٲٸ�,
�հ迡�� �����ϱ� ���� n = 0���� �ٲ� ������,
�Ʒ� ������ if ������ ������ �����ع����� ������,
���� �Է� -> ������ �� �Ǿ����.

�Է� �޴ٰ� 0 �Է��ϸ� �ݺ����� ��������.
if ���๮ �ȿ� break; �־ ��
 
��� �����, n1, n2, n3.... ��� ���ؼ� �� ���Ѵ�!
�̷� �Ϳ��� �ͼ����� �ִµ�, �츮�� for ���� �� ����
�� ȸ���� �ݺ��ϴ� ���·δ� ��� ��Ÿ�� �� ������
�ϴ� ������� ������ ���� ��.
*/


		Scanner sc = new Scanner(System.in);
		int x, s, i;
		i = 1;
		s = 0;

		while (i < 6)
		{
			x = sc. nextInt();
			if( x < 0)
			{
				x = 0;
			}
			s = s + x;
			i = i + 1;
		}
		System.out.println("�Է��� ���� ��� ���ϸ� : " + s);
		System.out.println("Hello World!");

	}
}
