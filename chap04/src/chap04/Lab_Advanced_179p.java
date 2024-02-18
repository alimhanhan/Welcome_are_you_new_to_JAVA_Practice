package chap04;
import java.util.Scanner;

public class Lab_Advanced_179p {

    public static void main(String[] args) {
        boolean[][] board = new boolean[10][10];
        int[][] mineCounts = new int[10][10];
        char[][] userView = new char[10][10];

        // Initialize the board with mines (true values)
        // For this example, let's say we have mines at positions (2, 2), (4, 5), and (8, 9)
        board[2][2] = true;
        board[4][5] = true;
        board[8][9] = true;

        // Initialize the user view with hidden cells
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                userView[i][j] = '*';
            }
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Print the user view of the board
            printBoard(userView);

            // Ask the user to enter the cell coordinates to reveal
            System.out.print("Enter row and column (e.g., 2 3) or 'q' to quit: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("q")) {
                System.out.println("Thanks for playing. Goodbye!");
                break;
            }

            try {
                String[] parts = input.split(" ");
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);

                // Check if the entered coordinates are valid
                if (row < 0 || row >= 10 || col < 0 || col >= 10) {
                    System.out.println("Invalid coordinates. Please try again.");
                    continue;
                }

                // Check if the cell is already revealed
                if (userView[row][col] != '*') {
                    System.out.println("Cell already revealed. Please try again.");
                    continue;
                }

                // Reveal the cell based on the board's content
                if (board[row][col]) {
                    // The cell contains a mine
                    System.out.println("Oops! You hit a mine. Game Over!");
                    printBoard(board); // Print the board with mine positions
                    break;
                } else {
                    // The cell does not contain a mine, reveal the count of neighboring mines
                    userView[row][col] = (char) (countNeighboringMines(board, row, col) + '0');
                }
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid input format. Please enter row and column numbers separated by space.");
            }
        }
    }

    // Helper method to print the user view of the board
    private static void printBoard(char[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Helper method to print the board with mine positions
    private static void printBoard(boolean[][] board) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] ? "M " : ". "); // "M" for mine, "." for empty cell
            }
            System.out.println();
        }
    }

    // Helper method to count neighboring mines for a cell
    private static int countNeighboringMines(boolean[][] board, int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, 9); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, 9); j++) {
                if (board[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
