package day10;
/**
 * 静态变量
 * 静态变量是属于类的变量，使用类名访问，静态变量只有一份！
 *
 */
public class Demo03 {
	public static void main(String[] args) {
		Cat tom = new Cat(4);
		Cat kitty = new Cat(5);
		System.out.println(Cat.numOfCats);
	}
}
class Cat{
	int age;//实例变量
	static int numOfCats;//静态变量
	public Cat(int age){
		Cat.this.age = age;
		Cat.numOfCats++;
	}
}