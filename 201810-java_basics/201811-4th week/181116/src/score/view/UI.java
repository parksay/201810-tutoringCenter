package score.view;

import java.util.Scanner;

import score.control.Manager;
import score.vo.Student;

//성적처리 화면 UI 및 실행 클래스
public class UI {
	Manager manager;	//성적처리 담당 클래스
	//UI의 생성자
	public UI() {
		manager = new Manager();
	}
	//메뉴 출력 후 번호 입력받음
	public int menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("\n[ 성적 관리 프로그램 ]");
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("그외. 종료");
		System.out.print("번호 선택 : ");
		num = scan.nextInt();
		return num;
	}
	
	//학생 1명의 정보 입력받음
	public void input() {
		Scanner scan = new Scanner(System.in);
		String n;
		int k,e,m;

		System.out.print("이름:");
		n = scan.nextLine();
		System.out.print("국어:");
		k = scan.nextInt();
		System.out.print("수학:");
		e = scan.nextInt();
		System.out.print("영어:");
		m = scan.nextInt();
		Student s = new Student(n,k,e,m); //입력받은값으로 객체생성하여 배열에 저장
		manager.save(s);
		System.out.println("저장되었습니다.");
	}
	
	//전체 학생 정보 출력
	public void output() {
		Student sa[] = manager.listAll();
		for (int i = 0; i < manager.getCount(); i++) {
			sa[i].print();
		}
	}
	
	public static void main(String[] args) {
		UI ui = new UI();	//UI객체 생성
		while (true) {
			int m = ui.menu();
			switch (m) {
				case 1: ui.input(); break;
				case 2: ui.output(); break;
				default: System.out.println("종료합니다."); return;
			}
		}
	} //main() 끝
} //UI 클래스 끝
