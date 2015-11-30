package day04;

import java.io.File;
import java.io.PrintStream;

/**
 * System.Out.println()到底是什么
 * @author tarena
 *
 */
public class SysOutDemo {
	public static void main(String[] args) throws Exception{
		System.out.println("HelloWorld");
		/**
		 * 创建一个向文件中写数据的PrintStream
		 */
		File file = new File("log.txt");
		PrintStream ps = new PrintStream(file);
		ps.println("写到文件中去");
		//保存住针对控制台的输出流
		PrintStream out = System.out ;
		//将我们创建的输出流设置给System
		System.setOut(ps);
		System.out.println("输出内容");
		//将针对控制台输出流还原到System上
		System.setOut(out);
		System.out.println("还原到控制台");
		ps.close();
	}
}
