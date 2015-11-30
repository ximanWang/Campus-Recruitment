package day09;

import java.util.Arrays;

/**
 * 继承关系
 *  1) 子类型继承父类型的属性和方法，父类的属性和方法被所有子类共享，可以简化子类的开发
 *  2) 子类型是多种多样的，子类型是多态的
 *  
 * 业务案例：四个方(Tetromino)块有7种(I,J,L,S,Z,T,O)
 * 实现方式：
 *   利用继承关系实现，其中4格是父类，7中方块是子类型，
 *   在父类中定义4格数组属性，子类型就自动继承了4种属性。
 *   父类型的方法子类型会继承。
 * 实现：
 *   定义4格方块类Tetromino(属性：4个格，方法：下落)
 *   子类型就继承了4格方块类的属性和方法。
 *   子类型要定义构造器，初始化格子位置
 */
public class Demo02 {
	public static void main(String[] args){
		T t = new T();
		I i = new I();
		System.out.println(Arrays.toString(t.cells));
		System.out.println(Arrays.toString(i.cells));
		t.softDrop();//是从父类中继承的方法
		i.softDrop();
		//t.cells 是从父类中继承的属性
		System.out.println(Arrays.toString(t.cells));
		System.out.println(Arrays.toString(i.cells));
		t.softLeft();
		t.softRight();
	//2) 子类型是多种多样的，子类型是多态的
		//父类型定义的变量可以引用子类型实例
		//子类型可以造型为父类型
		Tetromino x = t;//x是T型方块
		x = i;//x引用的是I型方块
		//x引用的对象有2种
		//x引用的对象是多种多样的，是多态的
	}
}
class I extends Tetromino{//I是一种具体的4格方块
	public I(){
		//
		this.cells[0] = new Cell(0,4);//旋转轴
		this.cells[1] = new Cell(0,3);
		this.cells[2] = new Cell(0,5);
		this.cells[3] = new Cell(0,6);
	}
}
class T extends Tetromino{//T是一种具体的4格方块
	public T(){
		//
		this.cells[0] = new Cell(0,4);//旋转轴
		this.cells[1] = new Cell(0,3);
		this.cells[2] = new Cell(0,5);
		this.cells[3] = new Cell(1,4);
	}
}
class L extends Tetromino{//L是一种具体的4格方块
	public L(){
		//
		this.cells[0] = new Cell(0,4);//旋转轴
		this.cells[1] = new Cell(0,3);
		this.cells[2] = new Cell(0,5);
		this.cells[3] = new Cell(1,3);
	}
}
class J extends Tetromino{//J是一种具体的4格方块
	public J(){
		//
		this.cells[0] = new Cell(0,4);//旋转轴
		this.cells[1] = new Cell(0,3);
		this.cells[2] = new Cell(0,5);
		this.cells[3] = new Cell(1,5);
	}
}
class Z extends Tetromino{//Z是一种具体的4格方块
	public Z(){
		//
		this.cells[0] = new Cell(1,4);
		this.cells[1] = new Cell(0,3);
		this.cells[2] = new Cell(0,4);
		this.cells[3] = new Cell(1,5);
	}
}
class S extends Tetromino{//S是一种具体的4格方块
	public S(){
		//
		this.cells[0] = new Cell(0,4);
		this.cells[1] = new Cell(0,5);
		this.cells[2] = new Cell(1,3);
		this.cells[3] = new Cell(1,4);
	}
}
class O extends Tetromino{//O是一种具体的4格方块
	public O(){
		//
		this.cells[0] = new Cell(0,4);
		this.cells[1] = new Cell(0,5);
		this.cells[2] = new Cell(1,4);
		this.cells[3] = new Cell(1,5);
	}
}
class Tetromino{//四格方块
	Cell[] cells = {null,null,null,null};//四个空格子
	public void softDrop(){//下落一步
		cells[0].row++;
		cells[1].row++;
		cells[2].row++;
		cells[3].row++;
	}
	public void softLeft(){//左移一步
		cells[0].col--;
		cells[1].col--;
		cells[2].col--;
		cells[3].col--;
	}
	public void softRight(){//右移一步
		cells[0].col++;
		cells[1].col++;
		cells[2].col++;
		cells[3].col++;
	}
}
class Cell{
	int row;
	int col;
	public Cell(int row, int col){
		this.row = row;
		this.col = col;
	}
	public String toString() {
		return "[" + row + "," + col + "]";
	}
	
}
