package com.tarena.tetris;

import java.awt.Image;

/**
 * 是一个格子
 *
 */
public class Cell {
	private int row;
	private int col;
	private Image image;
	public Cell(int row, int col,Image image){
		this.row = row;
		this.col = col;
		this.image = image;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}
	public String toString(){
		return "["+row+","+col+"]";
	}
	public void drop(){
		row++;
	}
	public void moveLeft(){
		col--;
	}
	public void moveRight(){
		col++;
	}
}
