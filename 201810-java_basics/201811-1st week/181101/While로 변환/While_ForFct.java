import java.util.Scanner;
class While_ForFct
{
/*
�Է��� �� ���� �޾Ƽ�, �� �� ������ ���ڵ��� ��� ���ϴ�
���丮���� ���ϰ� �;�.
�ٵ�, 10�� �Ѿ��, ����޼������� ���� �����ϱ� ������,
���� �� �ǰ� Ŀ��. ���� �ڷ����� �Ű� ��� ��.
�׳� �θ� int�� �⺻ ���� �� �־, ���� �Ѿ.
*/
	public static void main(String[] args) 
	{


/*
		Scanner sc = new Scanner(System.in);
		double x, y, z, ft;
		ft = 1.0;
		x =	sc. nextInt();
		y =	sc. nextInt();

		if( y > x)
		{
			z = x;
			x = y;
			y = z;
		}

		for ( ; y <= x; y = y + 1)	
		{
			ft = (double)(ft * y);
		}
		System.out.println(ft);
*/
//���� for ������ while �������� �ٲ��� �� ¥����

		Scanner sc = new Scanner(System.in);
		int x, y, z;
		double ft;
		x = sc. nextInt();
		y = sc. nextInt();
		ft = 1.0;
		if(y > x)
		{
			z = x;
			x = y;
			y = z;
		}
			
		while(y <= x)
		{
			ft = ft * (double)y;
			y = y + 1;
		}
		System.out.println("�� �� ������ ��� ���� ���ϸ� : " + ft);


		System.out.println("Hello World!");
	}
}
