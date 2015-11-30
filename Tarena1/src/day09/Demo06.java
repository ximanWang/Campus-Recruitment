package day09;
/**
 * 子类中定义与父类同名的属性
 *  1) Java支持子类型和父类型定义同名属性
 *  2) 很少在实际中使用，不建议使用的现象
 *  3) 属性的访问是绑定到变量的类型
 *
 */
public class Demo06 {
	public static void main(String[] args) {
		Cheater c = new Cheater();
		Person p = c;
		System.out.println(c.name+","+p.name);
	}

}
class Person{
	String name = "灰太郎";
}
class Cheater extends Person{//骗子
	String name = "喜洋洋";
}
