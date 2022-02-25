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
	System.out.println("1. �Է�");
	System.out.println("2. ���");
	System.out.println("3. ����");
	System.out.println("4. �˻�");
	System.out.println("5. ����");
	System.out.println("0. ����");
	choice = sc.nextInt();
	sc.nextLine();
	return choice;
}

	
public void insertBoard() {
	
	
	String id; String title; String content;
	System.out.print("ID: ");
	id = sc.nextLine();
	System.out.print("����: ");
	title = sc.nextLine();
	System.out.print("����: ");
	content = sc.nextLine();
	
	int check = 0;
	BoardVO board = new BoardVO(id, title, content);
	check = dao.insertBoard(board);
	System.out.println(check + "���� ����Ǿ����ϴ�.");
}
	
public void printBoard() {
	ArrayList<BoardVO> list;
	list = dao.selectBoard();
	for (int i = 0; i < list.size(); i = i + 1){
		System.out.println( list.get(i) );
		}
}

public void deleteBoard(){
	System.out.print("������ �� ��ȣ: ");
	int num = 0;
	num = sc.nextInt();
	sc.nextLine();
	
	int check = 0;
	check = dao.removeBoard(num);
	if(check == 0) {
		System.out.println("������ ������ �����ϴ�.");
	} else {
		System.out.println(check + "�� ������ �����Ǿ����ϴ�.");
	}
}

public void searchBoard() {
	
	ArrayList<BoardVO> list = null;
	System.out.print("�˻��� ���( 1.����\t2.����\t3.�ۼ��� ): ");
	int type = 0;
	type = sc.nextInt();
	sc.nextLine();
	System.out.print("�˻��� �ܾ�: ");
	String keyword = null;
	keyword = sc.nextLine();
	list = dao.search(type, keyword);
	if ( list == null || list.size() == 0) {
			System.out.println("�˻� ����� �����ϴ�.");
	}
	else {
		for (int i = 0; i < list.size(); i = i + 1) {
		System.out.println( list.get(i).getNum() );
		}
		System.out.println(list.size() + "���� ���� �˻��Ǿ����ϴ�.");
	}
}


public void revise() {
int num = 0; int check = 0 ;
int column = 0;
String revise = null;
System.out.print("������ �� ��ȣ: ");
num = sc.nextInt();
sc.nextLine();
System.out.print("������ Į�� �̸� (1.title\t2.content) : ");
column = sc.nextInt();
sc.nextLine();
System.out.print("������ ����: ");
revise = sc.nextLine();
check = dao.update(num, column, revise);
}

}
