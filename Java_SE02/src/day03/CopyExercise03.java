package day03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用具有缓冲功能的输入输出流复制文件
 * @author tarena
 *
 */
public class CopyExercise03 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos = new FileOutputStream("copy03_test.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		int d = -1;
		while((d = bis.read())!=-1){
			bos.write(d);
		}
		System.out.println("复制成功！");
		bis.close();
		bos.close();
	}
}
