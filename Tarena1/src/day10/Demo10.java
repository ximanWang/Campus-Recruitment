package day10;

import java.util.Arrays;

import day10.Cell;

public class Demo10 {
	public static void main(String[] args) {
		Cell[] cells = new Cell[4];//{null,null,null,null};
		//Cell[] cells = new Cell[]{null,null,null,null};
		//Cell[] cells = {null,null,null,null};
		System.out.println(Arrays.toString(cells));
		cells[0] = new Cell(0,4);
		cells[1] = new Cell(0,3);
		cells[2] = new Cell(0,5);
		cells[3] = new Cell(0,6);
		System.out.println(Arrays.toString(cells));
		cells = new Cell[]{new Cell(0,4),new Cell(0,3),new Cell(0,5),new Cell(0,6)};//同上
		System.out.println(Arrays.toString(cells));
	}
}










