package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 读
 * @author tarena
 *
 */
public class Exercise01 {
	public static void main(String[] args) throws IOException{
		File file = new File("la.dat");
		RandomAccessFile la = new RandomAccessFile(file,"r");
		/*读字符并输出*/
		char a = (char)la.read();
		System.out.println(a);
		char b = (char)la.read();
		System.out.println(b);
		/*读数字并输出*/
		int num = la.readInt();
		System.out.println(num);
		/*读字符串并输出*/
		int len = la.readInt();//len代表要读取的总字节量
		System.out.println(len);
		byte[] data = new byte[len];
		la.read(data);
		String str = new String(data,"GBK");
		System.out.println(str);
		la.close();
	}
}
