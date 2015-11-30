package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用文件输入输出流进行复制文件
 * @author tarena
 *
 */
public class CopyFile03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			/**
			 * FileInputStream(String path)
			 * 根据给定路径读取指定文件
			 */
			fis = new FileInputStream("java.png");
			fos = new FileOutputStream("copy3_java.png");
			byte[] buf = new byte[1024*10];//10K
			int len = -1;
			long start = System.currentTimeMillis();
			while((len = fis.read(buf))>0){
				fos.write(buf, 0, len);
			}
			System.out.println("复制成功！耗时："+(System.currentTimeMillis()-start));
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
