
package boardGame;

public class Position {
    private int row;
    private int colunm;

    public Position(int row, int colunm) {
        this.row = row;
        this.colunm = colunm;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColunm() {
        return this.colunm;
    }

    public void setColunm(int colunm) {
        this.colunm = colunm;
    }

    public String toString() {
        return this.row + ", " + this.colunm;
    }
}
