package day02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;

/**
 * 向文件中追加内容
 * @author tarena
 *
 */
public class FileAppend {
	public static void main(String[] args) throws Exception{
		/**
		 * RandomAccessFile向文件末尾追加内容
		 */
		File file = new File("append.txt");
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		raf.seek(raf.length());//file.length()
		//将游标移动到文件末尾后再写新数据
		raf.writeUTF("你好，大家都好！");
		
		raf.close();
		/**
		 * 使用文件输出流向文件末尾追加内容
		 */
		/**
		 * 第二个参数为true表示向文件末尾追加新内容
		 */
		FileOutputStream fos = new FileOutputStream("fos_append.txt",true);
		String str = "我是要成为海贼王的男人";
		byte[] data = str.getBytes("utf-8");
		fos.write(data);
	}
}
