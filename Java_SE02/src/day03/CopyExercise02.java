package day03;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件输入输出流复制文件
 * @author tarena
 *
 */
public class CopyExercise02 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("copy02_test.txt");
		byte[] buf = new byte[1024*10];
		int d = -1;
		while((d = fis.read(buf)) != -1){
			fos.write(buf, 0, d);
		}
		System.out.println("复制成功！");
		fis.close();
		fos.close();
	}
}
