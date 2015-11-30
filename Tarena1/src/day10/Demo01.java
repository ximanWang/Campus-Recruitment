package day10;

import day10.day.Koo;

public class Demo01 {
	public static void main(String[] args) {
		Foo foo = new Foo();
		System.out.println(foo.a);
		System.out.println(foo.b);
		System.out.println(foo.c);
		//System.out.println(foo.d);//编译错误，d不可见！
		System.out.println(foo.getD());
		
		Koo k = new Koo();//不用import  day10.day.Koo k = new Koo();
		System.out.println(k.a);
		//System.out.println(k.b);//编译错误在同一个包中可见
		//System.out.println(k.c);//编译错误在同一个包中可见
		//System.out.println(foo.d);//编译错误，d不可见！
		System.out.println(k.getD());
	}
}
class Foo{
	public int a = 1;
	protected int b = 2;//在一个包中可见
	int c = 3;//默认访问修饰 在一个包中可见
	private int d = 4;//仅在类内部有效
	public int getD(){
		return d;
	}
}
class Goo extends Koo{
	public void test(){
		System.out.println(super.a);
		System.out.println(super.b);//子类中可见可以访问
		//System.out.println(super.c);//编译错误，不可见！
		//System.out.println(foo.d);//编译错误，d不可见！
		System.out.println(super.getD());
	}
}