package day04;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * 读取文件输入的内容并写到文件中
 * @author tarena
 *
 */
public class SystemInDemo {
	public static void main(String[] args) throws Exception{
		InputStream in = System.in;
		/**
		 * 想读取字符串，就先将其转为字符输入流
		 */
		InputStreamReader reader = new InputStreamReader(in);
		/**
		 * 转换为可以按行读取的缓冲字符输入流
		 */
		BufferedReader br = new BufferedReader(reader);
		/**
		 * 创建向文件中写数据的输出流
		 */
		FileOutputStream fos = new FileOutputStream("input.txt");
		/**
		 * 转换为按行写数据的缓冲字符输出流
		 * 并带有自动行刷新
		 */
		PrintWriter writer = new PrintWriter(fos,true);
		String str = null;
		/**
		 * readLine()方法会被卡住，直到我们输入回车，才会将之前输入的内容
		 * 作为一个字符串返回
		 * 因为键盘数据是源源不断的，不向文件有尽头，所以这里的while是
		 * 永远不会停下来的
		 */
		while((str = br.readLine()) != null){
			if("exit".equals(str)){
				System.out.println("感谢使用！");
				break;
			}
			writer.println(str);
	//		System.out.println("输入的是" + str);
		}
		br.close();
		writer.close();
	}
}
