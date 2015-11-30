package day11;
/**
 * 局部匿名内部类：匿名类
 *  1) 匿名类的语法非常简单，经常使用
 * 
 */
public class Demo03 {
	public static void main(String[] args) {
		class Foo{
			
		}
		Foo foo = new Foo();
		
		Xoo xoo = new Xoo();//创建Xoo的对象(实例)
		Xoo x = new Xoo(){};//创建Xoo的匿名类实例
		// new Xoo(){} 是继承于Xoo并且同时创建了对象的写法
		// {} 是子类的类体
		Xoo x2 = new Xoo(){//子类类体
			public void test(){//子类中重写父类的方法
				System.out.println("x2.test()");
			}
			public void t(){
				System.out.println("t()");
			}
		};
		x2.test();//运行子类的重写方法
		//x2.t();//编译错误，Xoo类型上没有t()
		Too too = new Too(){};//不是创建抽象类的实例
		//是创建匿名子类实例！
	}
}
abstract class Too{
	
}
class Xoo{
	public void test(){
		System.out.println("Xoo.test()");
	}
}