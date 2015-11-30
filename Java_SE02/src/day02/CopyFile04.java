package day02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用具有缓冲功能的输入输出流进行读写操作完成复制工作
 * @author tarena
 *
 */
public class CopyFile04 {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("java.png");
		FileOutputStream fos = new FileOutputStream("copy4_java.png");
		/**
		 * 创建具有缓冲功能的输入输出流
		 */
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int d = 0;
		while((d = bis.read()) != -1){
			bos.write(d);
		}
		System.out.println("复制完毕！");
		/**
		 * 强制将缓冲区中的数据写出
		 * 
		 */
		bis.close();
		bos.close();
		/*bos.flush();
		fos.close();
		fis.close();*/
	}
}
