package day09;
/**
 * 默认构造器现象
 * 1) 类一定有构造器
 * 2) 如果类没有声明构造器，Java编译器提供默认构造器
 * 3) 如果类中声明任何构造器，Java不再提供默认构造器
 */
public class Demo01 {

	public static void main(String[] args) {
		Foo foo = new Foo();//调用的就是默认构造器
		//Goo goo = new Goo();//编译错误：没有构造器Goo()
		Goo goo = new Goo(8);//调用Goo(int)构造器
	}
}
class Foo{	
}
class Goo{
	public Goo(int a){
		System.out.println("Call Goo(int)");
	}
}