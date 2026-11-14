public class ChessDesk {
    private Figure[][] desk = new Figure[8][8];

    public ChessDesk() {
        // расстановка фигур
        createDesk();
    }

    // расстановка фигур
    public void createDesk() {
        Pawn pawn = new Pawn(0, 1, "White");
    }

    /**
     * column 'A' - 'H', 'a' - 'h'
     * row 1 - 8
     */
    public Figure getFigure(char column, int row) {
        int c = switch (column) {
            case 'a', 'A' -> 0;
            case 'b', 'B' -> 1;
            case 'c', 'C' -> 2;
            case 'd', 'D' -> 3;
            case 'e', 'E' -> 4;
            case 'f', 'F' -> 5;
            case 'g', 'G' -> 6;
            case 'h', 'H' -> 7;
            default -> -1;
        };
        int r = row - 1;
        return desk[r][c];
    }

    public void show() {
        for (int i = 0; i < 8; ++i) {
            for (int j = 7; j >= 0; --j) {
                char c = desk[j][i] == null ? '_' : '\u2659';
                System.out.print(c);
            }
            System.out.println();
        }
    }
}