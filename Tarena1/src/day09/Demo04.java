package day09;

public class Demo04 {
	public static void main(String[] args) {
		new Yoo();
	}
}
class Xoo{
	public Xoo(int n){
		System.out.println("Xoo(int)");
	}
	
}
//class Yoo extends Xoo{}//编译错误，子类不能默认调用super()
class Yoo extends Xoo{
	public Yoo(){
		super(8);//super()只能在子类构造器中使用，只能出现在子类构造器的代码第一行
	}
}
