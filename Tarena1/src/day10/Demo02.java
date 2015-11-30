package day10;
/**
 * 私有方法不能被继承，不能被重写
 * 
 *被继承的方法才能重写！
 */
public class Demo02 {
	public static void main(String[] args) {
		Super s = new Sub();
		s.test();
	}
}
class Super{
	public void test(){
		this.t();
		this.g();
	}
	public void t(){
		System.out.println("Super.t()");
	}
	private void g(){
		System.out.println("Super.g()");
	}
}
class Sub extends Super{
	public void t(){		
		System.out.println("Sub.t()");
	}
	public void g(){
		System.out.println("Sub.g()");
	}
}