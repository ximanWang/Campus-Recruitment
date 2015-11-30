package day06;

public class TestPersonDemo {
	public static void main(String[] args) {
		Person p1 = new Student();
		Person p2 = new Teacher();
		p1.sayHello();
		p1.sayGoodBye();
		p2.sayHello();
		p2.sayGoodBye();
		Shape circle = new Circle(2.2);
		circle.area();
	}
}
