package Fifteenth;

import java.util.Scanner;
public class StudentTest3_copy {
static Scanner sc = new Scanner(System.in);

public static void main(String[] args)
{
	int choice = 0; int i = 0; int j = 0; int num = 0; int back = 0;
	
	System.out.println("학생 수를 입력하세요: ");
	int scale = sc. nextInt();
	Student[] stdArray = new Student[scale];
	
		outter: while(true)
		{
			System.out.println("\n[ 성적 관리 ]\n1. 입력\n2. 출력\n3. 종료");
			choice = sc. nextInt();
			switch(choice)
			{
				case 0: System.out.println("\n종료합니다."); return;
				case 1: inner: while(true)
						{
							if(num < scale)
							{
								stdArray[num] = constructor();
								num = num + 1;
								System.out.println("계속하시겠습니까?\n1. 계속\n2. 뒤로");
								back = sc. nextInt();
								switch(back)
								{
									case 1: continue inner;
									case 2: continue outter;
								}
							}
							else
							{
								System.out.println(scale + "명 까지 입력 가능합니다.");
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
	System.out.print("학생 이름을 입력하세요: ");
	std.setName(sc.nextLine());
	System.out.print("\n국어 점수를 입력하세요: ");
	std.setKor(sc.nextInt());
	System.out.print("\n영어 점수를 입력하세요: ");
	std.setEng(sc.nextInt());
	System.out.print("\n수학 점수를 입력하세요: ");
	std.setMat(sc.nextInt());
	return std;
}

}
