package day04;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 反序列化操作
 * @author tarena
 *
 */
public class ObjectInputStreamDemo {
	public static void main(String[] args) throws Exception{
		//创建用于读取保存着对象字节的文件输入流
		FileInputStream fis = new FileInputStream("person.obj");
		/**
		 * 创建用于反序列化的流
		 */
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person person = (Person)ois.readObject();
		System.out.println("姓名：" + person.getName());
		System.out.println("年龄：" + person.getAge());
		System.out.println("性别:" + person.getSex());
		ois.close();
	}
}
