import java.util.Scanner;
class ArrayTest2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int array[];
		int i, sum;
		array = new int[10];
		for(i = 0; i <= 9; i = i + 1)
			{
				array[i] = sc. nextInt();
			}
		for(i = 0; i <= 9; i = i + 1)
			{
				System.out.println(array[i]);
			}	
		System.out.println("\n");
//���� 10�� ���� �ޱ� + 10�� ���

		for(i = 0; i <= array.length - 2; i = i + 1)
		{
			System.out.print(array[i] + " + ");
		}
/*
			System.out.print(array[i]);
			System.out.print(i == array.length - 1 ? " + " : " = ");
or
			System.out.print(array[i] + " + ");
			�ؼ� 10������ �� ���, ���� ����Ʈ���� \b �ϳ� �־��ְ� �����ϱ�
*/

		sum = 0;
		for(i = 0; i <= array.length-1; i = i + 1)
		{
			sum = sum + array[i];
		}
		System.out.print(array[array.length-1] + " = " + sum);
		System.out.println("\n");
//���� 10�� ��� ���ϱ� + 10�� ��� ��� + 10�� �հ� ���
/*
array.length ��� �ϸ�, �ش� ��̿� 10���� �����͸� ������ ���Ҵٰ� ���� ��,
'��ȣ'�� ���� ���ڸ� 0 ~ 9�������ۿ� ���� ���̿�. �ಲ array[array.length]�ϸ�
array[10]�� �Ǵ� ����. ���� array[array.length]�� ���� ��������.
*/
		System.out.println("Hello World!");
	}
}
