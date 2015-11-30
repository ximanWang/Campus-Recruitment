package day10;

public class Cell {
	int row;
	int col;
	public Cell(int row, int col){
		this.col = col;
		this.row = row;
	}/** 重写了Object类中的方法*/
	public String toString() {
		return "[" + row + "," + col + "]";
	}
}
