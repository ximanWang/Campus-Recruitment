package day01;

public class Demo08 {
	public static void main(String[] args) {
		String name = "  Tom  \t  \r \n";
		name = name.trim();
		System.out.println(name);
		//endsWith 以...为结束的
		String file = "photo.png";
		boolean isPng = file.endsWith(".png");
		System.out.println(isPng);
		//startsWith 以 ... 为开始的
		String cmd = "get photo.png";
		if(cmd.startsWith("get ")){
			System.out.println("下载命令");
		}else if(cmd.startsWith("ls")){
			System.out.println("列目录命令");
		}
		//...
		String s = "123";
		System.out.println(s.length());
	}
}
