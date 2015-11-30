package day08;
/**
 * null 值问题
 * 空指针异常的原因是引用变量的值null，没有引用任何对象
 * 在null引用上调用了方法/属性会出现空指针异常
 * 解决空指针异常：在适当时候(在访问方法/属性)之前对引用变量赋值，使变量引用对象！
 */
public class Demo10 {
	public static void main(String[] args) {
		Cell3 c1 = null;//有变量没有对象
		//以下出现运行异常，空指针异常
		//System.out.println(c1.col);//访问属性
		c1 = new Cell3(4,5);
		c1.drop();//调用方法
		System.out.println(c1.row);
	}

}
class Cell3{
	int row;//属性，实例变量
	int col;
	int color;
	//重载构造器
	public Cell3(int row, int col){
		this.col = col;
		this.row = row;
	}
	public void drop(){
		row++;
	}
}
