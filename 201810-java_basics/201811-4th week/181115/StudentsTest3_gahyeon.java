package Fifteenth;

import java.util.Scanner;

public class StudentsTest3_gahyeon {
	public static int cnt;
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ���.");
		int m;
		m = scan.nextInt();
		
		Student a[] = new Student[m];
		int n;
		
		while(true)
		{
			n = menu();
			
			switch(n) 
			{
				case 1: 
					if(cnt == m) 
					{
						System.out.println(m + "���� �л� ������ �Է��Ͻ� �� �ֽ��ϴ�.");
						return;
					}
					option1(a); break;
					
				case 2: option2(a); break;
				case 0: System.out.println("�����մϴ�."); return;
				default : System.out.println("0, 1, 2�� �� �Է��Ͻ� �� �ֽ��ϴ�.");
			}	
		}
	}
	
	public static int menu()
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("[ �������� ���α׷� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ��ü���");
		System.out.println("0. ����");
		System.out.print("��ȣ �Է� : ");
		int n = scan.nextInt();
		return n;
	}
	
	public static Student input()
	{
		Scanner scan = new Scanner(System.in);
		String name; 
		int kor,eng,mat;
		
		System.out.print("�̸� : ");
		name = scan.nextLine();
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		mat = scan.nextInt();
		System.out.println("����Ǿ����ϴ�.");
		
		
		
		Student s1 = new Student(name, kor, eng, mat);
		return s1;
		
	}
	
	public static void option1(Student a[])
	{
		
		//Students c = input(); 	//���� �޾��ִ� �Ŵϱ� ��ü�� ���� ������ �ʿ�� ����
		
		a[cnt] = input();
		//a[b]=print();�� ���� : print();�� void�� ���� �������� �ʰ� �׳� ��¸���
		//�迭�� ��ü�� �ּҰ��� �־��ָ�ȴ�! �迭���� ���� ��ü���� �ƴ϶� ��ü�� �ּҰ� ���� ����!!
		cnt++;
		
	}
	public static void option2(Student a[])
	{
		for(int i = 0; i < a.length; i++)
			a[i].print();
	}
}
