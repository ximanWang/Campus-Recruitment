package day02;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写
 * 读的时候需要按照写的顺序！
 * @author tarena
 *
 */
public class Exercise03 {
	public static void main(String[] args) throws IOException{
		File file = new File("wr.dat");
		RandomAccessFile wr = new RandomAccessFile(file,"rw");
		/*写字符、数字和字符串*/
		wr.write('A');
		wr.writeInt(100);
		String str = "我喜欢java";
		byte[] data = str.getBytes("GBK");
		wr.writeInt(data.length);
		wr.write(data);
		
		wr.seek(0);//游标归零
		/*读字符、数字和字符串*/
		System.out.println((char)wr.read());
		System.out.println(wr.readInt());
		int len = wr.readInt();
		data = new byte[len];
		wr.read(data);
		str = new String(data,"GBK");
		System.out.println(str);
		wr.close();
	}
}
