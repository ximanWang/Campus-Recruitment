package day08;

public class Demo07 {
	public static void main(String[] args) {
		//c1是引用型变量，引用了对象的首地址
		//new运算符，用于分配内存创建对象，返回对象的首地址
		Cell c1 = new Cell();//创建对象，创建Cell类的实例(对象)
		c1.row = 3;//方法中声明的变量在栈中分配
		c1.col = 4;
		c1.color = 0xCC30FF;
		Cell c2 = new Cell();
		c2.row = 3;
		c2.col = 5;
		c2.color = 0xcc30ff;
		c1.drop();//drop(c1) c1掉下了
	    c2.drop();//drop(c2) c2掉下了
	    System.out.println(c1.row);
	    System.out.println(c2.row);
	}
}
/**格子 类，*/
class Cell{
	int row;//实例变量，每个对象实例拥有一个row
	int col;
	int color;
	//掉下 moveLeft moveRight  
	public void drop(){
	 	this.row++;//算法   this 本质是方法的隐含参数，接收对象引用
	 	//this在方法执行期间代表调用方法的“这个”对象，是动态绑定到当前对象。方法在方法区中
	 	//通过this识别不同对象的调用
	}
}