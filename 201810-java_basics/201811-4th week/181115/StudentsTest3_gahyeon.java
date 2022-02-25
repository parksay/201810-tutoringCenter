package Fifteenth;

import java.util.Scanner;

public class StudentsTest3_gahyeon {
	public static int cnt;
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수를 입력하세요.");
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
						System.out.println(m + "명의 학생 정보만 입력하실 수 있습니다.");
						return;
					}
					option1(a); break;
					
				case 2: option2(a); break;
				case 0: System.out.println("종료합니다."); return;
				default : System.out.println("0, 1, 2번 만 입력하실 수 있습니다.");
			}	
		}
	}
	
	public static int menu()
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("[ 성적관리 프로그램 ]");
		System.out.println("1. 입력");
		System.out.println("2. 전체출력");
		System.out.println("0. 종료");
		System.out.print("번호 입력 : ");
		int n = scan.nextInt();
		return n;
	}
	
	public static Student input()
	{
		Scanner scan = new Scanner(System.in);
		String name; 
		int kor,eng,mat;
		
		System.out.print("이름 : ");
		name = scan.nextLine();
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("수학 : ");
		eng = scan.nextInt();
		System.out.print("영어 : ");
		mat = scan.nextInt();
		System.out.println("저장되었습니다.");
		
		
		
		Student s1 = new Student(name, kor, eng, mat);
		return s1;
		
	}
	
	public static void option1(Student a[])
	{
		
		//Students c = input(); 	//값을 받아주는 거니까 객체를 새로 선언할 필요는 없음
		
		a[cnt] = input();
		//a[b]=print();는 오류 : print();는 void라서 값을 가져오지 않고 그냥 출력만함
		//배열에 객체의 주소값을 넣어주면된다! 배열에는 실제 객체값이 아니라 객체의 주소가 들어가기 때문!!
		cnt++;
		
	}
	public static void option2(Student a[])
	{
		for(int i = 0; i < a.length; i++)
			a[i].print();
	}
}
