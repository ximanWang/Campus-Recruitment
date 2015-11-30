package day06;

public class TestSingletonDemo {
	public static void main(String[] args) {
		SingletonDemo o1 = SingletonDemo.getInstance();
		o1.setWidth(200);
		o1.setHeight(400);
		SingletonDemo o2 = SingletonDemo.getInstance();
		System.out.println(o2.getWidth());
		System.out.println(o2.getHeight());
		System.out.println(o1 == o2);
		
	}
}
