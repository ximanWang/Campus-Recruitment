package day03;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用文件字符输入输出流复制文本文件
 * @author tarena
 *
 */
public class CopyExercise06 {
	public static void main(String[] args) throws Exception{
		FileReader reader = new FileReader("test.txt");
		FileWriter writer = new FileWriter("copy06_test.txt");
		int d = -1;
		while((d = reader.read())!=-1){
			writer.write(d);
		}
		System.out.println("复制完毕！");
		reader.close();
		writer.close();
	}
}
