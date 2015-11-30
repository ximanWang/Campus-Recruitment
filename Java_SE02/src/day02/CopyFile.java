package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		/**
		 * 思路：
		 *   创建一个File对象用于描述要复制的文件
		 *   并用一个RandomAccessFile读取
		 *   再创建一个新的File对象描述复制后的文件，
		 *   并再用一个RandomAccessFile写数据
		 *   
		 *   这样我们从第一个文件中读字节并写道第二个文件中
		 *   从而达到复制文件的目的
		 */
		//1 创建一个用于描述源文件的File对象
		File src = new File("java.png");
		//2 创建一个RandomAccessFile用于读取源文件
		RandomAccessFile srcRaf = new RandomAccessFile(src,"r");
		//3 创建一个用于描述复制后文件的File对象
		File des = new File("copy_java.png");
		//4 创建一个RandomAccessFile用于写复制的文件
		RandomAccessFile desRaf = new RandomAccessFile(des,"rw");
		//5 循环从原文件中读取字节并写到目标文件中
		int data = -1;
		while((data = srcRaf.read()) != -1){
			desRaf.write(data);
		}
		System.out.println("复制完毕！");
		srcRaf.close();
		desRaf.close();
	}
}
