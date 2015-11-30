package day03;

import java.io.File;
import java.io.RandomAccessFile;

/**
 * 基于缓存的复制文件
 * @author tarena
 *
 */
public class CopyExercise01 {
	public static void main(String[] args) throws Exception{
		File src = new File("test.txt");
		RandomAccessFile srcRaf = new RandomAccessFile(src,"r");
		File des = new File("copy01_test.txt");
		RandomAccessFile desRaf = new RandomAccessFile(des,"rw");
		int d = 0;
		byte[] buf = new byte[1024*10];
		while((d=srcRaf.read(buf)) != -1){
			desRaf.write(buf,0,d);
		}
		System.out.println("复制成功");
		srcRaf.close();
		desRaf.close();
	}
}
