package day01;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取目录下的部分子项
 * 给定一个过滤条件，返回当前目录满足条件的子项
 * 过滤条件使用FileFilter类定义
 * @author tarena
 *
 */
public class FileDemo08 {
	public static void main(String[] args) {
		/**
		 * 需求：获取项目根目录下的所有文本文件
		 * 1.定义一个FileFilter，并定义过滤条件
		 * 2.使用listFiles方法并将过滤器传入并返回
		 *  符合条件的子项
		 */
		/**
		 * 使用匿名类的方式创建过滤器
		 */
		FileFilter filter = new FileFilter(){
			public boolean accept(File file){
				System.out.println("准备过滤的文件是：" + file.getName());
				/**
				 * 文本文件应该是名字以".txt"结尾的
				 */
				return file.getName().endsWith(".txt");
			}
		};
		/**
		 * 调用File的重载方法listFile(FileFilter filter)
		 * 将当前目录中符合filter要求的子项返回
		 */
		File file = new File(".");
		File[] subs = file.listFiles(filter);
		for(File sub : subs){
			System.out.println(sub.getName());
		}
	}
}
