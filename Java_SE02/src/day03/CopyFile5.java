package day03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 使用字符输入输出流复制文本文件
 * @author tarena
 *
 */
public class CopyFile5 {
	public static void main(String[] args) throws Exception{
		/**
		 * 1 创建一个文件字节输入流，用于读取当前文件
		 * 2 将字节输入流包装为字符输入流，按字符为单位读取数据
		 * 3 创建一个文件字节输出流，用于将数据写入复制的文件
		 * 4 将字节输出流包装为字符输出流，按字符为单位写数据
		 * 5 循环从当前文件中读取字符并写入复制的文件
		 * 6 将输入输出流关闭
		 */
		//1
		FileInputStream fis = new FileInputStream("."+File.separator+"src"
				                             +File.separator+"day03"
				                             +File.separator+"CopyFile5.java");
		//2
		InputStreamReader reader = new InputStreamReader(fis);
		//3
		FileOutputStream fos = new FileOutputStream("CopyFile5.java");
		//4
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		//5
		char[] chs = new char[1024 * 5];
		/**
		 * Reader另一个读取字符的方法
		 * int reader(char[] chs)
		 */
		int len = -1;
		while((len=reader.read(chs)) > 0){
			writer.write(chs,0,len);
		}
		//6
		reader.close();
		writer.close();
	
	}
}
