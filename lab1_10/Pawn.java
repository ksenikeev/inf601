public class Pawn extends Figure {

    public Pawn(int column, int row, String color) {
        super(column, row, color);
    }

    @Override
    public boolean сheckPosition(int column, int row) {

        if (this.color.equals("white")) {
            if (this.column == column && this.row + 1 == row) return true;
            if (this.column == column && this.row == 1 && row == 3) return true;
            if ((this.column + 1 == column || this.column - 1 == column) &&
                    (this.row + 1 == row)) return true;
        } else {
            if (this.column == column && this.row - 1 == row) return true;
            if (this.column == column && this.row == 6 && row == 4) return true;
            if ((this.column + 1 == column || this.column - 1 == column) &&
                    (this.row - 1 == row)) return true;
        }

        return false;
    }

}