import java.util.Scanner;
class MenuTest1 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x, y;
		y = 0;
		while( y < 1)
		{
			System.out.println("[ ���� �� ������? ]\n1.�ѽ�\n2.�߽�\n3.�Ͻ�\n4.���\n0.�ƹ��ų�");
			x = sc. nextInt();
			switch	(x)
			{
				case 1 : System.out.println("��"); break;
				case 2 : System.out.println("��"); break;
				case 3 : System.out.println("��"); break;
				case 4 : System.out.println("��");  break;
				case 0 : y = 1; break;
			}
		}
		System.out.println("�����ϼ���~");
		x = menu();
		System.out.println(x);
		System.out.println("\n");
		
		System.out.println("Hello World!");
	}
/*
�޼��� �̸�, Ư�����ڴ� �޶�, ����ٸ� ����, but �����ϸ� ���� ����
���ڴ� �� �� �ƴϸ� ����, class�� ���
�޼���� ���������� ���� ����, �� ���� ������ class�� ���� �Ǿ�� ��.
� class������ ���ӵ� �־�� ��.
���� class �ȿ� �ִ� �ֵ��� �׳� �θ��� �ǰ�,
�ٸ� class �ȿ� �ִ� �ֵ���, class���� �����ؼ� �ҷ� ��� �ϰ�.
*/
	public static int menu()
	{
	System.out.println("[ ���� �� ������? ]\n1.�ѽ�\n2.�߽�\n3.�Ͻ�\n4.���\n0.�ƹ��ų�");
	Scanner sc = new Scanner(System.in);

	int z;
	z = sc. nextInt();
	return z;
	}
}
