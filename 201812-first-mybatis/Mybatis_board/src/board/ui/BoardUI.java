package board.ui;

import java.util.ArrayList;
import java.util.Scanner;
import board.dao.BoardDAO;
import board.vo.BoardVO;

public class BoardUI {

	Scanner sc = new Scanner(System.in);
	BoardDAO dao = new BoardDAO();

public int menu() { 
	int choice = 0;
	System.out.println("1. 입력");
	System.out.println("2. 출력");
	System.out.println("3. 삭제");
	System.out.println("4. 검색");
	System.out.println("5. 수정");
	System.out.println("0. 종료");
	choice = sc.nextInt();
	sc.nextLine();
	return choice;
}

	
public void insertBoard() {
	
	
	String id; String title; String content;
	System.out.print("ID: ");
	id = sc.nextLine();
	System.out.print("제목: ");
	title = sc.nextLine();
	System.out.print("내용: ");
	content = sc.nextLine();
	
	int check = 0;
	BoardVO board = new BoardVO(id, title, content);
	check = dao.insertBoard(board);
	System.out.println(check + "건이 저장되었습니다.");
}
	
public void printBoard() {
	ArrayList<BoardVO> list;
	list = dao.selectBoard();
	for (int i = 0; i < list.size(); i = i + 1){
		System.out.println( list.get(i) );
		}
}

public void deleteBoard(){
	System.out.print("삭제할 글 번호: ");
	int num = 0;
	num = sc.nextInt();
	sc.nextLine();
	
	int check = 0;
	check = dao.removeBoard(num);
	if(check == 0) {
		System.out.println("삭제할 정보가 없습니다.");
	} else {
		System.out.println(check + "개 정보가 삭제되었습니다.");
	}
}

public void searchBoard() {
	
	ArrayList<BoardVO> list = null;
	System.out.print("검색할 대상( 1.제목\t2.본문\t3.작성자 ): ");
	int type = 0;
	type = sc.nextInt();
	sc.nextLine();
	System.out.print("검색할 단어: ");
	String keyword = null;
	keyword = sc.nextLine();
	list = dao.search(type, keyword);
	if ( list == null || list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
	}
	else {
		for (int i = 0; i < list.size(); i = i + 1) {
		System.out.println( list.get(i).getNum() );
		}
		System.out.println(list.size() + "건의 글이 검색되었습니다.");
	}
}


public void revise() {
int num = 0; int check = 0 ;
int column = 0;
String revise = null;
System.out.print("수정할 글 번호: ");
num = sc.nextInt();
sc.nextLine();
System.out.print("수정할 칼럼 이름 (1.title\t2.content) : ");
column = sc.nextInt();
sc.nextLine();
System.out.print("수정할 내용: ");
revise = sc.nextLine();
check = dao.update(num, column, revise);
}

}
