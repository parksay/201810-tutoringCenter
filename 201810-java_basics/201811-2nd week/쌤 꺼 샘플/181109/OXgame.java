
import java.util.Scanner;

//Tic-tac-toe ���� (�迭, �ݺ���)
public class OXgame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;								//���� ���� ����
		int player;								//�÷��̾� ��ȣ. 1 or 2
		int winner = 0;							//�¸��� �÷��̾�. 0�̸� �ʱⰪ �� ��� ���.
		int choice;								//������ ��ȣ
		int row, col;							//�迭�� ��, �� �ε���
		char board[][] = new char[3][3];		//����
		
		init(board);							//���� �ʱ�ȭ

		//���ڰ� �������� ������ ������ 9ȸ�� ����
		for (i = 0; i < 9 && winner == 0; i++) {
			output(board);							//���� ���

			player = i % 2 + 1;						//�÷��̾� ����

			do {
				System.out.println("\n** Player[" + player + "]���� ���� ���� �����Դϴ�.");
				System.out.print("**�� " + (player==1?'X':'O') + "�� ���� ��ġ�� ��ȣ�� �Է��ϼ��� : ");
				
				choice = input.nextInt();			//���� ĭ�� ��ȣ ����

				--choice;							//������ ��ȣ 1����
				row = choice / 3;					//�� ���ϱ�
				col = choice % 3;					//�� ���ϱ�

			} while (choice < 0 || choice > 9 || board[row][col] == 'O' || board[row][col] == 'X');	//�߸������ ��� �ݺ�

			board[row][col] = (player == 1) ? 'X' : 'O';		//���ǿ� ǥ��

			//�밢�����⿡ �Ϸķ� �þ ���� �ִ��� �˻�
			if (board[0][0] == board[1][1] && board[0][0] == board[2][2] ||
				board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
				winner = player;
			}
			//����, ���� ���� �˻�
			else {
				for (j = 0; j <= 2; j++) {
					if (board[j][0] == board[j][1] && board[j][0] == board[j][2] ||
						board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
						winner = player;
					}
				}
			}
		}

		//���� ���� �Ŀ� ������ ������ ���¸� ���
		output(board);

		//��� ���
		if (winner == 0)
			System.out.println("\n�����ϴ�!");
		else
			System.out.println("\nPlayer-" + winner + "���� �¸�! �����մϴ�.");

	}

	//���� �ʱ�ȭ
	public static void init(char board[][]) {
		char ch = '0';
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ++ch;
			}
		}
	}

	//������ ���� ���� ��� �޼���
	static void output(char board[][]) {
		System.out.println("\n +---+---+---+");
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(" | " + board[i][j]);
			}
			System.out.println(" |\n +---+---+---+");
		}
	}
}
