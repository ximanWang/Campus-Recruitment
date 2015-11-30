package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 用于读写基本数据类型的
 * DIS & DOS
 * @author tarena
 *
 */
public class DisAndDos {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("data.dat");
		/**
		 * 创建缓冲输出流，用于提高写写效率
		 */
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		/**
		 * 创建可以方便写基本数据的高级流DOS
		 */
		DataOutputStream dos = new DataOutputStream(bos);
		/**
		 * 连续写四个字节，写一个int值
		 */
		dos.writeInt(Integer.MAX_VALUE);
		/**
		 * 将字符串使用UTF-8编码转换为字节后写出
		 */
		dos.writeUTF("写一个字符串");
		/**
		 * 连续写8个字节，一个double值
		 */
		dos.writeDouble(12.5);
		dos.close();//关闭高级流
		
		/**
		 * 创建文件输入流用于读文件
		 */
		FileInputStream fis = new FileInputStream("data.dat");
		/**
		 * 创建缓冲字节输入流，提高读取文件效率
		 */
		BufferedInputStream bis = new BufferedInputStream(fis);
		/**
		 * 将文件字节流包装为DIS
		 * 这样就可以方便的从文件中读取基本数据类型了
		 */
		DataInputStream dis = new DataInputStream(bis);
		/**
		 * 读取int值
		 */
		System.out.println(dis.readInt());
		/**
		 * 读字符串
		 */
		System.out.println(dis.readUTF());
		/**
		 * 读取double值
		 */
		System.out.println(dis.readDouble());
		dis.close();//关闭高级流
	}
}
