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
		System.out.println("1. ��ü ���");
		System.out.println("2. ��� �˻�");
		System.out.println("3. �ı� ���� �Ǵ� �ۼ�");
		System.out.println("4. ��õ �ޱ�");
		System.out.print("������ ��� ����: ");
		int choice = 0;
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
		}	
		
		
	public void printAll() {
	ArrayList<DramaVO> list = null;
	System.out.println("��� ���� ����");
	System.out.println("1. �̸���");
	System.out.println("2. �濵�ϼ�");
	System.out.println("3. ��û����");
	System.out.println("4. ��õ����");
	System.out.println("0. �ڷ�");
	int choice = 0;
	choice = sc.nextInt();
	sc.nextLine();
	if( choice == 0 ) {
		return;
	} else if( choice == 1 || choice == 2 || choice == 3 || choice == 4 ) {
		list = dao.print(choice);
		//vo�� ������� ���� �� ������ �ɷ� toString�� �������̵� �س��µ�, sql���� �� �� �ָ�?
		for(int i = 0 ; i < list.size() ; i = i + 1) {
			System.out.println( list.get(i) );
		}	
	} else {
		System.out.println("����� ������ �ּ���.");
		printAll();
	}
	
}
	
	
	public void search() {
	
	ArrayList<DramaVO> list = null;
	String keyword = null;
	int choice = 0;

	System.out.println("1. �������� �˻�");
	System.out.println("2. �帣�� �˻�");
	System.out.println("3. �ֿ� ���� �˻�");
	System.out.println("4. ��ۻ�� �˻�");
	System.out.print("�˻� ��� ����: ");
	choice = sc.nextInt();
	sc.nextLine();

	System.out.print("�˻��� �Է�: ");
	keyword = sc.nextLine();
	
	
	list = dao.searchFor(choice, keyword);
	if ( list.size() == 0) {
		System.out.println("�˻� ����� �����ϴ�");
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
	
