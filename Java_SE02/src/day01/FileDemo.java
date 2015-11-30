package day01;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * File类，用于描述文件系统中的一个文件或目录
 * 
 * 测试描述当前项目根目录下的File.txt文件
 * 并获取该文件的一些信息
 * @author tarena
 *
 */
public class FileDemo {
	public static void main(String arg[]){
		//创建一个File对象
		/**
		 * 描述文件路径时，尽可能书写相对路径，便于跨平台的支持
		 * “.”表示当前目录，这个目录就是当前项目的根目录
		 * 是路径中目录的层级分隔符
		 */
		File file = new File("." + File.separator + "file.txt");
		/**
		 * boolean exist()
		 * 判断当前File对象描述的文件是否真的存在
		 * true:存在  false:不存在
		 */
		if(file.exists()){
			System.out.println("File.txt存在");
			/**
			 * boolean isFile()
			 * File描述的是否为一个文件
			 */
			if(file.isFile()){
				System.out.println("是文件");
			}
			/**
			 * boolean isDirectory
			 * 是否为文件目录
			 */
			if(file.isDirectory()){
				System.out.println("是文件目录");
			}
			/**
			 * 获取File描述的文件或目录的名字
			 */
			System.out.println("名字" + file.getName());
			System.out.println(file.getName() + "占：" + file.length() + "字节");
			/**
			 * long lastModified()
			 * 获取该文件最后修改日期的毫秒值
			 */
			long lastModified = file.lastModified();
			/**
			 * 过程：
			 * 1.将long转换为Date对象
			 * 2.将Date对象用SimpleDateFormat转换为字符串
			 */
			Date date = new Date(lastModified);
			SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日, HH:mm:ss");
			System.out.println("最后修改日期：" + format.format(date));
			/**
			 * String getPath()
			 * 获取路径
			 */
			System.out.println(file.getPath());
			/**
			 * String getAbsolutePath()
			 * 获取绝对路径
			 */
			System.out.println(file.getAbsolutePath());
			/**
			 * String getCanonicalPath
			 * 获取操作系统中标准的绝对路径
			 * 但该方法要求我们捕获异常
			 */
			try {
				System.out.println(file.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			/**
			 * boolean canRead()
			 * 判断是否可读
			 */
			System.out.println("可读：" + file.canRead());
			/**
			 * boolean canWrite()
			 * 判断是否可取
			 */
			System.out.println("可写：" + file.canWrite());
		}else{
			System.out.println("File.txt不存在");
		}
	}
}
