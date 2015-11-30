package day09;
/**
 * 继承时候的构造器
 * 1) 类一定有构造器
 * 2) 构造器不能被继承
 * 3) 子类的构造器中一定调用父类的构造器
 * 4) 子类默认调用父类的无参数构造器
 * 5) 可以使用super()调用在子类构造器的父类构造器
 */
public class Demo03 {
	public static void main(String[] args) {
		new Noo();
		//选择输出结果：A.编译错误 B.运行异常 C.无 D.Koo() Noo()
	}

}
class Koo{
	public Koo(){
		System.out.println("Koo()");
	}
}
class Noo extends Koo{
	public Noo(){
		//super();
		System.out.println("Noo()");
	}
	
}
