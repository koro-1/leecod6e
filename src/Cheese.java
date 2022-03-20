import java.util.LinkedList;

class Cheese {
    final int[] dir_x = { 1, -1, 0, 0, 1, 1, -1, -1 };
    final int[] dir_y = { 0, 0, -1, 1, -1, 1, -1, 1 };
    int n, m;

    public int flipChess(String[] chessboard) {
        n = chessboard.length;
        m = chessboard[0].length();
        char[][] board = copyBoard(chessboard);

        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == '.') {
                    char[][] copy = copyBoard(chessboard);
                    copy[i][j] = 'X';
                    int cnt = process(copy, i, j);
                    res = Math.max(res, cnt);
                }
            }
        }

        return res;
    }

    private char[][] copyBoard(String[] chessboard) {
        char[][] board = new char[n][m];
        int idx = 0;

        for (String line : chessboard) {
            board[idx++] = line.toCharArray();
        }

        return board;
    }

    private int process(char[][] arr, int x, int y) {
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < 8; i++) {
            int new_x = x + dir_x[i];
            int new_y = y + dir_y[i];
            q.addAll(search(arr, new_x, new_y, dir_x[i], dir_y[i]));
        }

        int res = q.size();
        while (!q.isEmpty()) {
            Integer pos = q.poll();
            res += process(arr, pos / 10, pos % 10);
        }

        return res;
    }

    private LinkedList<Integer> search(char[][] arr, int x, int y, int step_x, int step_y) {
        LinkedList<Integer> temp = new LinkedList<>();
        boolean flag = false;

        while (check(x, y)) {
            if (arr[x][y] != 'O') {
                flag = arr[x][y] == 'X';
                break;
            } else {
                temp.add(x * 10 + y);
                arr[x][y] = 'X';
            }
            x += step_x;
            y += step_y;
        }
        if (!flag) {
            while (!temp.isEmpty()) {
                Integer pos = temp.poll();
                arr[pos / 10][pos % 10] = 'O';
            }
        }

        return temp;
    }

    private boolean check(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}

