package day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 使用字符输入输出流复制文件
 * @author tarena
 *
 */
public class CopyExercise04 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader reader = new InputStreamReader(fis);
		FileOutputStream fos = new FileOutputStream("copy04_test.txt");
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		char[] chs = new char[1024*10];
		int d = -1;
		while((d=reader.read(chs)) != -1){
			writer.write(chs,0,d);
		}
		System.out.println("复制完毕！");
		reader.close();
		writer.close();
	}
}
