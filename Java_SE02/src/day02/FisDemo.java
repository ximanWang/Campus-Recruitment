package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 文件字节输入流
 * 用于从指定文件中获取数据
 * @author tarena
 *
 */
public class FisDemo {
	public static void main(String[] args) {
		//1 创建File对象，用于指定要读取的文件
		File file = new File("fos.dat");
		//文件字节输入流
		FileInputStream fis = null;
		try{
			fis = new FileInputStream(file);
			char c = (char)fis.read();
			System.out.println(c);
			/**
			 * 读取一个字符串
			 */
			int num = 0;
			int i = fis.read();
			num = (i<<24)|num;
			
			i = fis.read();
			num = (i<<16)|num;
			
			i = fis.read();
			num = (i<<8)|num;
			
			i = fis.read();
			num = i|num;
			System.out.println(num);
			//创建一个字节数组，用于读取后面的字符串内容
			byte[] data = new byte[num];
			/**
			 * int read(byte[] data)
			 * 一次性尝试读取给定数组长度的字节量并存入数组
			 * 返回值为实际读取到的字节量
			 * 返回值若为-1则说明读取到了文件末尾
			 */
			fis.read(data);
			String str = new String(data,"utf-8");
			System.out.println(str);
		}catch(Exception e){
			
		}finally{
			try{
				fis.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
