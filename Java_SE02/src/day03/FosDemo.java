package day03;

import java.io.FileOutputStream;

/**
 * 使用GBK编码向文件中写字符串
 * @author tarena
 *
 */
public class FosDemo {
	public static void main(String[] args) throws Exception{
		String str = "使用CBK编码向文件中写字符串";
		FileOutputStream fos = new FileOutputStream("charset.txt");
		byte[] data = str.getBytes("gbk");
		fos.write(data);
		fos.close();
	}
}
