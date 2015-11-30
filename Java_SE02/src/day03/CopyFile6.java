package day03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 缓冲字符输入输出流
 * @author tarena
 *
 */
public class CopyFile6 {
	public static void main(String[] args) throws Exception{
		/**
		 * 读取项目根目录下的文本文件案CopyFile5.java
		 */
		FileInputStream fis = new FileInputStream("CopyFile5.java");
		/**
		 * 因为缓冲字符输入流只处理字符输入流
		 * 所以我们要先将字节输入流包装为字符输入流
		 */
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(reader);
		/**
		 * 创建缓冲字符输出流
		 */
		FileOutputStream fos = new FileOutputStream("Copy_CopyFile5.java");
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(writer);
		
		String str = null;
		/**
		 * String readLine()
		 * 一次读一行字符
		 * 连续读取字符，直到读取的字符到换行符为止，然后将换行符之前的
		 * 字符组成字符串返回
		 * 注意：返回值中是不包含换行符的
		 * 当返回值为null时表示EDF
		 */
		while((str = br.readLine()) != null){
		//	System.out.println(str);
			bw.write(str);//直接将一个字符串写出
			bw.newLine();//输出一个换行符
		}
		br.close();
		bw.close();
	}
}
