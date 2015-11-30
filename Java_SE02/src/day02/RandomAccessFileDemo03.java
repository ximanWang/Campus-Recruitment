package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写文件
 * @author tarena
 *
 */
public class RandomAccessFileDemo03 {
	public static void main(String[] args)throws IOException{
		File file = new File("rw.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		/**
		 * 向文件中写数据
		 */
		RandomAccessFile raf = new RandomAccessFile(file,"rw");
		/**
		 * 输出游标的位置
		 * RandomAccessFile是基于游标进行读写操作的
		 * 每读一个字节，或写一个字节都是基于游标当前指向的位置进行的，
		 * 而当读写了该字节后，游标自动向后移动一个字节
		 */
		System.out.println(raf.getFilePointer());
		//写一个int值
		raf.writeInt(123123);		
		System.out.println(raf.getFilePointer());
		
		//写一个double值
		raf.writeDouble(12.34);
		System.out.println(raf.getFilePointer());
		
		//写一个字符
		raf.write('A');
		System.out.println(raf.getFilePointer());
		
		//使用UTF-8的形式写一个字符串
		raf.writeUTF("大笨蛋");
		raf.seek(0);//将游标移动到文件的开始(第一个字节)
		System.out.println(raf.getFilePointer());
		/**
		 * 将数据从文件中读出来
		 */
		int iNum = raf.readInt();
		System.out.println(raf.getFilePointer());
		double dNum = raf.readDouble();
		System.out.println(raf.getFilePointer());
		char c = (char)raf.read();
		System.out.println(raf.getFilePointer());
		String str = raf.readUTF();
		System.out.println("int:" + iNum);
		System.out.println("double:" + dNum);
		System.out.println("char:" + c);
		System.out.println("String:" + str);
		//用完关闭
		raf.close();
	}
}
