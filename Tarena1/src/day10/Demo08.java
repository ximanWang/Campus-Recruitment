package day10;

public class Demo08 {
	public static void main(String[] args) {
		Dog wangcai = new Dog(4);
		Dog wangwang = new Dog(5);
		//wangwang.id = 9;//编译错误，final的变量不能修改
		System.out.println(wangcai.id+","+wangwang.id);
		System.out.println(Dog.numOfDogs);//静态变量只有一份
	}
}
class Dog{
	final int id;
	static int numOfDogs;
	public Dog(int id){
		this.id = id;
		Dog.numOfDogs++;
	}
}