package day02;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 向文件字节输出流
 * 用于向文件写数据的流
 * @author tarena
 *
 */
public class FosDemo {
	public static void main(String[] args){
		/**
		 * 向文件写数据
		 */
		//1 创建要写对象的File对象
		File file = new File("fos.dat");
		FileOutputStream fos = null;
		try{
			//创建文件字节输出流
			fos = new FileOutputStream(file);
			//写数据
			fos.write('A');//写一个字节
			/**
			 * 输出流的写方法
			 * write(int d)
			 * write(byte[] d)
			 * write(byte[] d, int start, int len)
			 */
			String str = "大家好";
			byte[] data = str.getBytes("utf-8");
			int length = data.length;//获取字符串长度
			//写一个int值，将长度写出
			fos.write(length>>>24);
			fos.write(length>>>16);
			fos.write(length>>>8);
			fos.write(length);
			fos.write(data);//将一个字节数组写出
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			//finally中关闭流
			if(fos != null){
				try{
					fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
