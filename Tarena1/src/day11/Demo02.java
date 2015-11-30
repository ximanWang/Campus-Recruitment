package day11;

public class Demo02 {

}
class Koo{
	int a;//Koo.this.a
	/** 内部类，可以共享外部类的属性和方法*/
	class Goo{//在非静态内部类可以访问Koo.this
		public void test(){
			System.out.println(Koo.this.a);
		}
	}
	static class Hoo{//在静态内部类不可以访问Koo.this
		public void test(){
			//System.out.println(Koo.this.a);//编译错误
		}
	}
}