package chap04;
import java.util.Scanner;
import java.util.Random;

public class Lab_Advanced_177p {

	public static void main(String[] args) {
		char[][] board = new char[3][3];
        int x;
        int y;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        do {
            for (int i = 0; i < 3; i++) {
                System.out.println("  " + board[i][0] + "|  " + board[i][1] + "|  " + board[i][2]);

                if (i != 2) {
                    System.out.println("---|---|---");
                }
            }

            System.out.println("다음 수의 좌표: ");
            x = scan.nextInt();
            y = scan.nextInt();

            if (x < 0 || x > 2 || y < 0 || y > 2) {
                System.out.println("잘못된 위치를 선택하셨습니다.");
                continue;
            }

            if (board[x][y] != ' ') {
                System.out.println("이미 놓여진 자리입니다. 다른 자리를 선택하세요.");
                continue;
            } else {
                board[x][y] = 'X';
            }

            // 게임판이 가득 찼는지 확인
            boolean isBoardFull = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        isBoardFull = false;
                        break;
                    }
                }
            }

            // 게임판이 가득 찼으면 게임 종료
            if (isBoardFull) {
                System.out.println("게임 종료: 더 이상 놓을 공간이 없습니다.");
                break;
            }

            // 플레이어(X)가 승리했는지 확인
            if (checkWin(board, 'X')) {
                System.out.println("게임 종료: 플레이어 (X) 승리!");
                break;
            }

            // 컴퓨터의 차례 (O)
            Random random = new Random();
            int compX, compY;

            // 컴퓨터가 다음 수로 승리할 수 있는지 확인
            boolean isComputerWin = false;
            for (compX = 0; compX < 3; compX++) {
                for (compY = 0; compY < 3; compY++) {
                    if (board[compX][compY] == ' ') {
                        board[compX][compY] = 'O';
                        if (checkWin(board, 'O')) {
                            System.out.println("컴퓨터 (O)가 이겼습니다!");
                            isComputerWin = true;
                            break;
                        }
                        board[compX][compY] = ' '; // 수를 놓고 다시 되돌림
                    }
                }
                if (isComputerWin) {
                    break;
                }
            }

            if (isComputerWin) {
                scan.close();
                return;
            }

            // 플레이어가 다음 수로 승리할 수 있는지 확인하고 막기
            boolean isPlayerWinBlocked = false;
            for (compX = 0; compX < 3; compX++) {
                for (compY = 0; compY < 3; compY++) {
                    if (board[compX][compY] == ' ') {
                        board[compX][compY] = 'X';
                        if (checkWin(board, 'X')) {
                            board[compX][compY] = 'O'; // 승리하는 수를 막음
                            isPlayerWinBlocked = true;
                            break;
                        } else {
                            board[compX][compY] = ' '; // 수를 놓고 다시 되돌림
                        }
                    }
                }
                if (isPlayerWinBlocked) {
                    break;
                }
            }

            // 승리할 수 있는 수가 없거나 막을 수 없으면 무작위로 수를 놓음
            if (!isComputerWin && !isPlayerWinBlocked) {
                while (true) {
                    compX = random.nextInt(3);
                    compY = random.nextInt(3);

                    if (board[compX][compY] == ' ') {
                        board[compX][compY] = 'O';
                        break;
                    }
                }
            }

            // 컴퓨터 (O)가 승리했는지 확인
            if (checkWin(board, 'O')) {
                System.out.println("게임 종료: 컴퓨터 (O) 승리!");
                break;
            }
        } while (true);

        scan.close();
    }

    // 플레이어 (X 또는 O)가 승리했는지 확인하는 함수
    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            // 행 확인
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }

            // 열 확인
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // 대각선 확인
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}