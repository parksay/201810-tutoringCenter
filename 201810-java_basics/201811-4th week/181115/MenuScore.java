package Fifteenth;

import java.util.Scanner;
public class MenuScore {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Student[] student = new Student[10];
	int x;
	x = 1;
	int i = 0; int j = 0; int l =0;
	int stkor; int steng; int stmat;
	String stname;
	stkor = 0; steng=0; stmat=0; stname = "0";
	outter: while(x>0)
	{	
		System.out.print("[ ���� ���� ���α׷� ] \n1. �Է�\n2. ��ü���\n0. ����\n");
		x = sc. nextInt();
		switch (x)
		{		
			case 0 : System.out.println("�����մϴ�."); return;
			case 2 : for(j = 0; j < student.length; j = j + 1)
					{
						if(student[j] == null)
						{
							break;
						}
						student[j].print();
					} break;
		
			case 1 : 
					inner: while(i < student.length)
					{	
						stname = sc.nextLine();
						student[i] = new Student();
						System.out.print("�̸�: ");
						stname = sc.nextLine();
						student[i].setName(stname);
						System.out.print("���� ����: ");
						stkor = sc. nextInt();
						student[i].setKor(stkor);
						System.out.print("���� ����: ");
						steng = sc. nextInt();
						student[i].setEng(steng);
						System.out.print("���� ����: ");
						stmat = sc. nextInt();
						student[i].setMat(stmat);
						i = i + 1;
						System.out.print("\n������ ��� �Է��Ͻðڽ��ϱ�?\n 1.��� \t2.��������");
						l = sc.nextInt();
						switch(l)
						{
							case 1 : continue inner;
							case 2 : continue outter;
						}
						System.out.println(i);
						break;
					}		
	}
		
	}

}
}
