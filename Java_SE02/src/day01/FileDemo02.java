package day01;

import java.io.File;

public class FileDemo02 {
	public static void main(String[] args) {
		/**
		 * 创建目录需要两步
		 * 1.使用File对象描述要创建的目录
		 * 2.通过File对象的方法创建目录
		 * 
		 * 在当前项目根目录下创建目录demo
		 */
		File dir = new File("." + File.separator + "demo");
		//若描述的File不存在
		if(!dir.exists()){
			/**
			 * boolean mkdir()
			 * 创建File对象所描述的目录
			 */
			dir.mkdir();
		}
		/**
		 * 在demo目录下创建子目录sub
		 */
		//File sub = new File("." + File.separator + "demo" + File.separator + "sub");
		/**
		 * 创建File对象的重载构造方法
		 * File(File dir, String name)
		 * 在给定的目录中创建文件或目录name
		 * 这里要注意，第一个参数应该描述的是一个目录
		 */
		File sub = new File(dir,"sub");
		if(!sub.exists()){
			sub.mkdir();
		}
	}
}
