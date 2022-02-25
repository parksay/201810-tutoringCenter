import java.util.Scanner;

//�Է¹��� ��,���� �޷� ����ϱ� (�迭, �ݺ���)
public class CalendarView {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month[] = {31,28,31,30,31,30,31,31,30,31,30,31};	//���� ��¥��
		int y, m, d;
		int i, tot = 0;
		
		System.out.print("�� : ");
		y = input.nextInt();
		System.out.print("�� : ");
		m = input.nextInt();

		//�Է³⵵�� �����̸� 2���� 29�Ϸ�.
		if (leap(y)) month[1] = 29;

		//�Է¹��� ���� 1�ϱ����� ��¥�� ���ϱ� 
		//�۳����
		for (i = 1; i < y ; i++) {
			if (leap(i))	tot += 366;
			else tot += 365;
		}
		//��������
		for (i = 0; i < m - 1; i++) {
			tot += month[i];
		}
		//�ش���� 1�ϴ��ϱ�
		tot++;
		
		//�ش�� 1���� ���� ���ϱ�. �������� 1�̸� ������
		d = tot % 7;

		//�޷����� ���
		System.out.println("\n\t\t\t  " + y + "�� " + m + "��\n");
		System.out.println("\t��\t��\tȭ\t��\t��\t��\t��");

		//1���� �����ġ�� ���ϸ�ŭ ����
		for (i = 0; i < d; i++) System.out.print("\t");

		//�ش�� �޷� ���
		for (i = 1; i <= month[m - 1]; i++) {
			System.out.print("\t" + i);
			if (d++ % 7 == 6) {		//����ϱ��� ����� �ٹٲ�
				System.out.println();
			}
		}
		System.out.println("\n");
	}

	//���� ���� �˻�
	public static boolean leap(int y) {
		if (y%4==0 && y%100!=0 || y%400==0)
			return true;
		else
			return false;
	}
}
