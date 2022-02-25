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
		System.out.print("[ 성적 관리 프로그램 ] \n1. 입력\n2. 전체출력\n0. 종료\n");
		x = sc. nextInt();
		switch (x)
		{		
			case 0 : System.out.println("종료합니다."); return;
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
						System.out.print("이름: ");
						stname = sc.nextLine();
						student[i].setName(stname);
						System.out.print("국어 점수: ");
						stkor = sc. nextInt();
						student[i].setKor(stkor);
						System.out.print("영어 점수: ");
						steng = sc. nextInt();
						student[i].setEng(steng);
						System.out.print("수학 점수: ");
						stmat = sc. nextInt();
						student[i].setMat(stmat);
						i = i + 1;
						System.out.print("\n성적을 계속 입력하시겠습니까?\n 1.계속 \t2.이전으로");
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
