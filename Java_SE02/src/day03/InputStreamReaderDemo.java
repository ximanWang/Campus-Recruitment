package day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 使用字符输入流读取文本文件
 * @author tarena
 *
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws Exception{
		/**
		 * 用字符输入流读取当前程序的源代码
		 * src/day03/InputStreamReaderDemo.java
		 */
		File file = new File("src"+File.separator+"day03"
				                       +File.separator+"InputStreamReaderDemo.java");
		FileInputStream fis = new FileInputStream(file);
		/**
		 * InputStreamReader(InputStream in)
		 * 该构造方法的作用
		 * 将给定的字节流包装为一个按字符为单位读取的字符流
		 */
		InputStreamReader reader = new InputStreamReader(fis);
		/**
		 * int read()
		 * 连续读取2个字节(一个字符)，并以int形式返回
		 * 所以该int值低16位有数据
		 * 若返回值为-1则表示EOF
		 */
		int c = -1;
		while((c=reader.read()) != -1){
			System.out.print((char)c);
		}
		reader.close();
	}
}
