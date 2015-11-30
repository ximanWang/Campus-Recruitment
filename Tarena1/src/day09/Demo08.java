package day09;
/**
 * 重写(覆盖)与重载的区别
 *  1 重载：
 *    1) 方法名一样，参数不同的方法，一般的功能相近的不同的方法
 *    2) 调用时候根据调用参数类型来识别方法
 *  
 *  2 重写(覆盖)：
 *    1) 子类型中“修改”父类的方法(父类的行为)。
 *    2) 在子类型中定义与父类型方法名和参数一样的方法。
 *    3) 在调用的时候 根据“对象的类型”来调用相应的方法。
 */
public class Demo08 {

	public static void main(String[] args) {
		Super obj = new Sub();
		Too t = new Too();
		t.t(obj);//根据参数obj的类型Super调用重载的方法
	}
}
class Too{
	public void t(Super obj){//重载的方法
		System.out.println("Super");//根据obj运行时候引用的"对象类型"调用对象的方法
		obj.t();
	}
	public void t(Sub obj){//调用重载方法per
		System.out.println("Sub");
		obj.t();
	}
}
class Super{
	public void t(){
		System.out.println("Super.t()");
	}
}
class Sub extends Super{
	public void t(){
		System.out.println("Sub.t()");
	}
}