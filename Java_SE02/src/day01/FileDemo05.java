package day01;

import java.io.File;

/**
 * 删除文件或目录
 * @author tarena
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		/**
		 * 删除文件
		 * 1.创建File对象，用来描述要删除的文件或目录
		 * 2.调用File的删除方式及其方法
		 */
		//删除demo.txt
		File file = new File("demo.txt");
		if(file.exists()){
			/**
			 * 删除文件或目录
			 */
			file.delete();
		}
		File dir = new File("demo");
		if(dir.exists()){
		/**
		 * 删除目录时要注意，必须要保证该目录不含有任何子项(空目录)才可以将其删除
		 */
			dir.delete();
		}
	}
}
