package day01;

import java.io.File;

/**
 * 获取当前目录下的所有子项
 * @author tarena
 *
 */
public class FileDemo06 {
	public static void main(String[] args) {
		/**
		 * 获取src目录下的子项
		 */
		File src = new File("src");
		if(src.isDirectory()){			
			/**
			 * 只获取当前目录下所有子项的名字
			 */
			String[] subNames = src.list();
			for(String name : subNames){
				System.out.println(name);
			}
			/**
			 * 获取所有子项
			 */
			File[] subs = src.listFiles();
			for(File sub : subs){
				System.out.println(sub.getName() + ":" + sub.length());
			}
		}
	}
}
