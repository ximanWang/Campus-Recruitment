package day04;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * 带自动换行刷新的缓冲字符输出流
 * @author tarena
 *
 */
public class PrintWriterDemo {
	public static void main(String[] args) throws Exception{
		//PrintWriter pw = new PrintWriter("pw.txt");
	//	File file = new File("pw.txt");
		//PrintWriter pw = new PrintWriter(file);
		FileOutputStream out = new FileOutputStream("pw.txt");
		PrintWriter pw = new PrintWriter(out, true);
		/**
		 * 若具有自动行刷新功能，那么每个每一行flush()
		 */
		pw.println("渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐渐");
		pw.println("再来一行");
		pw.close();
	}
}
