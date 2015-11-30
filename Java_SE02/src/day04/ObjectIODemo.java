package day04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 将对象序列化后再反序列化
 * @author tarena
 *
 */
public class ObjectIODemo {
	public static void main(String[] args) throws Exception{
		Person person = new Person();
		person.setAge(12);
		person.setName("张三");
		person.setSex(1);
		ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("object.dat"));
		oos.writeObject(person);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("object.dat"));
		Person p = (Person)ois.readObject();
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSex());
		/**
		 * 判断反序列化回来的对象和原来对象内容是否一致
		 */
		System.out.println("两个对象内容是否一致：" + person.equals(p));
		System.out.println("是否为同一个对象：" + (person==p));
		ois.close();
	}
}
