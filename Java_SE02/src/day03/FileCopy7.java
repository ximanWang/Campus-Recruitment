package day03;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用文件字符输入输出流复制文本文件
 * @author tarena
 *
 */
public class FileCopy7 {
	public static void main(String[] args) throws Exception{
		/**
		 * 创建用于读取文本文件字符输入流
		 */
		FileReader reader = new FileReader("CopyFile5.java");
		/**
		 * 创建文件字符输出流
		 */
		FileWriter writer = new FileWriter("Copy_Copy_FileCopy5.java");
		int c = -1;
		while((c = reader.read()) != -1){
			writer.write(c);
		}
		writer.close();
		reader.close();
	}
}
