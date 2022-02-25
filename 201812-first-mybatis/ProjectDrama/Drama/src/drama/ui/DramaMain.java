package drama.ui;

public class DramaMain {

	public static void main(String[] args) {
	DramaUI ui = new DramaUI();
	int choice = 0;
	while(true) {
		choice = ui.menu();
		switch(choice){
			case 1 : ui.printAll(); break;
			case 2 : ui.search(); break; 
			case 3 : ui.reply(); break;
	/*		case 4 : ui.recommend(); break;
			case 0 : ui.exit(); break; 
	*/		default : System.out.println("다시 입력해 주세요."); break;
		}
	
	}


}
	
}
