public abstract class Figure {
    /** 0 - 7 */
    protected int row;
    /** 0 - 7 */
    protected int column;

    /**  black, white */
    protected String color;

    public Figure(int column, int row, String color) {
        this.column = column;
        this.row = row;
        this.color = color.toLowerCase();
    }

    public String getPosition() {
        return (char)(column + 'A') + String.valueOf(row + 1);
    }

    public abstract boolean checkPosition(int column, int row);

    public void setPositoion(int column, int row) {
        if (checkPosition(column, row)) {
            this.column = column;
            this.row = row;
        }
    }
}