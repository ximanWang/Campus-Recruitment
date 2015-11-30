package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 写文件
 * @author tarena
 *
 */
public class Exercise {
	public static void main(String[] args) throws IOException {
		File file = new File("la.dat");
		if(!file.exists()){
			file.createNewFile();
		}
		RandomAccessFile la = new RandomAccessFile(file,"rw");
		/*写字符*/
		la.write('A');
		la.write('B');
		/*写数字*/
		la.writeInt(100);
		/*写字符串*/
		String str = "我喜欢Java";
		byte[] data = str.getBytes("GBK");//将字符串转化为byte要确定编码方式
		la.writeInt(data.length);//写字符串前现加个整数代表字符串总字节长度
		la.write(data);
		la.write(data, 0, 6);
		la.close();
	}
}
