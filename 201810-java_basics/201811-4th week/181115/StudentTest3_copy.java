package Fifteenth;

import java.util.Scanner;
public class StudentTest3_copy {
static Scanner sc = new Scanner(System.in);

public static void main(String[] args)
{
	int choice = 0; int i = 0; int j = 0; int num = 0; int back = 0;
	
	System.out.println("�л� ���� �Է��ϼ���: ");
	int scale = sc. nextInt();
	Student[] stdArray = new Student[scale];
	
		outter: while(true)
		{
			System.out.println("\n[ ���� ���� ]\n1. �Է�\n2. ���\n3. ����");
			choice = sc. nextInt();
			switch(choice)
			{
				case 0: System.out.println("\n�����մϴ�."); return;
				case 1: inner: while(true)
						{
							if(num < scale)
							{
								stdArray[num] = constructor();
								num = num + 1;
								System.out.println("����Ͻðڽ��ϱ�?\n1. ���\n2. �ڷ�");
								back = sc. nextInt();
								switch(back)
								{
									case 1: continue inner;
									case 2: continue outter;
								}
							}
							else
							{
								System.out.println(scale + "�� ���� �Է� �����մϴ�.");
								return;
							}
						}
				case 2: for(i = 0; i < stdArray.length; i = i + 1)
						{
							if(stdArray[i] == null)
							{
								break;
							}
							stdArray[i].print();
						}
						break;
			}
		}
}

public static Student constructor()
{
	Student std = new Student();
	String x = sc. nextLine();
	System.out.print("�л� �̸��� �Է��ϼ���: ");
	std.setName(sc.nextLine());
	System.out.print("\n���� ������ �Է��ϼ���: ");
	std.setKor(sc.nextInt());
	System.out.print("\n���� ������ �Է��ϼ���: ");
	std.setEng(sc.nextInt());
	System.out.print("\n���� ������ �Է��ϼ���: ");
	std.setMat(sc.nextInt());
	return std;
}

}
