package board.ui;

public class BoardMain {

	public static void main(String[] args) {
		//����� �������̽� ����
		BoardUI ui = new BoardUI();
		int choice = 0;
	
		
		while(true) {
			System.out.println("������ �۾��� �����ϼ���.");
			choice = ui.menu();
			switch(choice) {
			case 1 : ui.insertBoard(); break;
			case 2 : ui.printBoard(); break;
			case 3 : ui.deleteBoard(); break;
			case 4 : ui.searchBoard(); break;
			case 5 : ui.revise(); break;
//			case 0 : ui.exit(); break;
			}
		}
	}

}
