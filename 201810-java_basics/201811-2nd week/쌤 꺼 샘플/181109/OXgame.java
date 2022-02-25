
import java.util.Scanner;

//Tic-tac-toe 게임 (배열, 반복문)
public class OXgame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j;								//루프 제어 변수
		int player;								//플레이어 번호. 1 or 2
		int winner = 0;							//승리한 플레이어. 0이면 초기값 및 비긴 경우.
		int choice;								//선택한 번호
		int row, col;							//배열의 행, 열 인덱스
		char board[][] = new char[3][3];		//말판
		
		init(board);							//말판 초기화

		//승자가 결정되지 않으면 게임은 9회에 종료
		for (i = 0; i < 9 && winner == 0; i++) {
			output(board);							//말판 출력

			player = i % 2 + 1;						//플레이어 선택

			do {
				System.out.println("\n** Player[" + player + "]님이 말을 놓을 차례입니다.");
				System.out.print("**말 " + (player==1?'X':'O') + "를 놓을 위치의 번호를 입력하세요 : ");
				
				choice = input.nextInt();			//남은 칸의 번호 선택

				--choice;							//선택한 번호 1감소
				row = choice / 3;					//행 구하기
				col = choice % 3;					//열 구하기

			} while (choice < 0 || choice > 9 || board[row][col] == 'O' || board[row][col] == 'X');	//잘못고른경우 계속 반복

			board[row][col] = (player == 1) ? 'X' : 'O';		//말판에 표시

			//대각선방향에 일렬로 늘어선 말이 있는지 검사
			if (board[0][0] == board[1][1] && board[0][0] == board[2][2] ||
				board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
				winner = player;
			}
			//가로, 세로 방향 검사
			else {
				for (j = 0; j <= 2; j++) {
					if (board[j][0] == board[j][1] && board[j][0] == board[j][2] ||
						board[0][j] == board[1][j] && board[0][j] == board[2][j]) {
						winner = player;
					}
				}
			}
		}

		//게임 종료 후에 말판의 마지막 상태를 출력
		output(board);

		//결과 출력
		if (winner == 0)
			System.out.println("\n비겼습니다!");
		else
			System.out.println("\nPlayer-" + winner + "님의 승리! 축하합니다.");

	}

	//말판 초기화
	public static void init(char board[][]) {
		char ch = '0';
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = ++ch;
			}
		}
	}

	//말판의 현재 상태 출력 메서드
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
