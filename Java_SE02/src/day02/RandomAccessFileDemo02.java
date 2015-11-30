package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文件内容
 * @author tarena
 *
 */
public class RandomAccessFileDemo02 {
	public static void main(String[] args) throws IOException {
		File file = new File("raf.dat");
			RandomAccessFile raf = new RandomAccessFile(file,"r");
			/**
			 * int read()读取一个字节以int形式返回
			 * 当返回值为-1时，就是读取到了文件的末尾
			 * EOF end of file
			 * 注意：
			 *   该int值只有低8位有效
			 */
			
			//读取第一个字节'A'
			char a = (char)raf.read();
			char b = (char)raf.read();
			System.out.println(a + "," + b);
			/**
			 * 连续读取4个字节，读int值
			 * raf.dat  01111111 11111111 11111111 11111111
			 * num      00000000 00000000 00000000 00000000
			 *  i       00000000 00000000 00000000 01111111
			 *
			 */
			int num = 0; 
			int i = raf.read();
			num = (i<<24)|num;
			
			i = raf.read();
			num = (i<<16)|num;
			
			
			i = raf.read();
			num = (i<<8)|num;
			
			i = raf.read();
			num = i|num;
			
			System.out.println(num);
			
			/**
			 * 连续读取4个字节，转换为int值返回
			 */
			int max = raf.readInt();
			System.out.println(max);
			
			/**
			 * 读取字符串
			 */
			int len = raf.readInt();//读取了字符串的总字节量
			/**
			 * int read(byte[] data)
			 * 一次性尝试读取data数组长度的字节量，并存入数组
			 * 返回值为实际读取到的字节量
			 * 若返回值为-1，读取到了文件末尾
			 */
			byte[] data = new byte[len];
			raf.read(data);
			
			String str = new String(data,"GBK");
			System.out.println(str);
			raf.close();
	}
}
