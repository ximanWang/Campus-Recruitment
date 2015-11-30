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
public class CopyExercise05 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader reader = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(reader);
		FileOutputStream fos = new FileOutputStream("copy05_test.txt");
		OutputStreamWriter writer = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(writer);
		String str = null;
		while((str = br.readLine())!=null){
			bw.write(str);
		}
		System.out.println("复制完毕！");
		br.close();
		bw.close();
		
	}
}
