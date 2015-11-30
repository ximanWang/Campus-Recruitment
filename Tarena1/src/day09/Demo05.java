package day09;
/**
 * 继承的时候，对象创建过程
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		Coo c = new Coo();
		System.out.println(c.a+","+c.b+","+c.c);
	}
}
class Aoo{
	int a = 5;
	public Aoo(){
		a = 9;
	}
}
class Boo extends Aoo{
	int b = 6;
	public Boo(){//属性初始化
		a = 7;
		b = 1;
	}
}
class Coo extends Boo{
	int c = 7;
	public Coo(){
		a = 3;
		b = 4;
		c = 5;
	}
}
