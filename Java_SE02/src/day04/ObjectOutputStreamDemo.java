package day04;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 使用ObjectOutputStream进行对象序列化操作
 * @author tarena
 *
 */
public class ObjectOutputStreamDemo {
	public static void main(String[] args) throws Exception{
		/**
		 * 创建一个对象
		 */
		Person person = new Person();
		person.setAge(22);
		person.setName("chuanqi");
		person.setSex(1);
		
		//创建能够写文件的字节输出流
		FileOutputStream fos = new FileOutputStream("person.obj");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(person);
		oos.close();
		
	}
}
