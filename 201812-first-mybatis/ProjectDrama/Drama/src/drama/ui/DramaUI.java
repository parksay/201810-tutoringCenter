package drama.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import drama.dao.DramaDAO;
import drama.vo.DramaVO;
import drama.vo.ReplyVO;

public class DramaUI {
	
	DramaDAO dao = null;
	Scanner sc = null;
	
	public DramaUI() {
		sc = new Scanner(System.in);
		dao = new DramaDAO();
	}
	
	
	public int menu() {
		System.out.println("1. 전체 출력");
		System.out.println("2. 목록 검색");
		System.out.println("3. 후기 보기 또는 작성");
		System.out.println("4. 추천 받기");
		System.out.print("실행할 기능 선택: ");
		int choice = 0;
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
		}	
		
		
	public void printAll() {
	ArrayList<DramaVO> list = null;
	System.out.println("출력 순서 선택");
	System.out.println("1. 이름순");
	System.out.println("2. 방영일순");
	System.out.println("3. 시청률순");
	System.out.println("4. 추천수순");
	System.out.println("0. 뒤로");
	int choice = 0;
	choice = sc.nextInt();
	sc.nextLine();
	if( choice == 0 ) {
		return;
	} else if( choice == 1 || choice == 2 || choice == 3 || choice == 4 ) {
		list = dao.print(choice);
		//vo는 멤버변수 여러 개 가지는 걸로 toString을 오버라이딩 해놨는데, sql에서 다 안 주면?
		for(int i = 0 ; i < list.size() ; i = i + 1) {
			System.out.println( list.get(i) );
		}	
	} else {
		System.out.println("제대로 선택해 주세요.");
		printAll();
	}
	
}
	
	
	public void search() {
	
	ArrayList<DramaVO> list = null;
	String keyword = null;
	int choice = 0;

	System.out.println("1. 제목으로 검색");
	System.out.println("2. 장르로 검색");
	System.out.println("3. 주연 배우로 검색");
	System.out.println("4. 방송사로 검색");
	System.out.print("검색 방법 선택: ");
	choice = sc.nextInt();
	sc.nextLine();

	System.out.print("검색어 입력: ");
	keyword = sc.nextLine();
	
	
	list = dao.searchFor(choice, keyword);
	if ( list.size() == 0) {
		System.out.println("검색 결과가 없습니다");
	} else {
		for ( int i = 0; i < list.size(); i = i + 1) {
			System.out.println( list.get(i) );
		}
	}
}
	

	public void reply() {
		ArrayList<DramaVO> dlist = null;
		ArrayList<ReplyVO> rlist = null;
		dlist = dao.getDlist();	
		rlist = dao.getRlist();
		for(int i = 0; i < rlist.size(); i = i + 1) {
			System.out.println( rlist.get(i) );
			}
			
		
		
	}
	
}
	
