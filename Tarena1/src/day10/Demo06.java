package day10;
/**
 * final方法不能被重写
 * 
 *
 */
public class Demo06 {

}
class Xoo{
	final void test(){}
}
class Yoo extends Xoo{
	//void test(){}//编译错误，不能重写final方法
}