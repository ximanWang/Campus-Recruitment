package day05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 * 服务器端应用程序
 * @author tarena
 */
public class Server {
	private ServerSocket server;
	/**
	 * 创建一个集合，用于保存所有客户端的输出流这样就可以通过
	 * 遍历该集合拿到所有用户的输出流，做到转发操作
	 */
	Vector<PrintWriter> allOut = new Vector<PrintWriter>();
	/**
	 * 将一个客户端的输出流存入共享集合
	 */
	public void addOut(PrintWriter Writer){
		allOut.add(Writer);
	}
	/**
	 * 将给定的信息发送给所有的客户端
	 * @param message
	 */
	public void sendMessageToAllClient(String message){
		/**
		 * 遍历每个客户端的输出流，将给定的信息发送给每一个用户
		 */
		for(PrintWriter writer : allOut){
			writer.println(message);
		}
	}
	public Server(){
		try {
			/**
			 * 1 初始化ServerSocket
			 * 初始化的时候要指定服务端口号
			 */
			server = new ServerSocket(8088);
		} catch (Exception e) {
			System.out.println("服务器启动失败！");
			e.printStackTrace();
		}
	}
	/**
	 * 开始处理与客户端的通信
	 */
	public void start(){
		try {
			/**
			 * 2 监听8808端口，等待客户端的连接
			 *   返回刚刚连接的客户端Socket
			 */
			System.out.println("服务器启动了，等待客户端连接...");
			while(true){				
				Socket socket = server.accept();//阻塞方法
				System.out.println("一个客户端连接了");
				/**
				 * 当一个客户端连接后，该客户端Socket交给线程
				 * 让线程去循环读取客户端发送的信息
				 */
				GetClientInfoHandler handler = new GetClientInfoHandler(socket);
				new Thread(handler).start();
			}
		    /**
			 * 通过客户端的Socket获取一个输入流，用于读取客户端发送过来的信息
			 */
			/*
			InputStream in = socket.getInputStream();
			*/
			/**
			 * 将字节输出流转换为缓冲字符输入流，用于一次读取一行数据，
			 * 这里要注意，这边读取以行字符是根据回行判断的，
			 * 所以客户端发送时要带有回行!
			 */
			/*
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			while(true){
				*/
			    /**
				 * 读取客户端发送过来的一行字符串
				 */
			/*
				String info = br.readLine();
				System.out.println("客户端说：" + info);
			}*/
			/**
			 * 服务器端创建一个输出流，用于给这个客户端发送信息
			 */
			/*
			OutputStream out = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(out, true);
			pw.print("你好啊!客户端");*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 服务端的内部类
	 * 用于获取一个客户端发送的信息
	 * 每一个线程负责和一个客户端交流
	 * @author tarena
	 *
	 */
	private class GetClientInfoHandler implements Runnable{
		/**
		 * 当前线程要接收的客户端的Socket
		 */
		private Socket client;
		/**
		 * 将指定的客户端socket传入
		 */
		public GetClientInfoHandler(Socket client){
			this.client = client;
		}
		public void run(){
			try {
				/**
				 * 将客户端输出流存入共享集合
				 */
				PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
				addOut(writer);
				/**
				 * 在线程中我们通过客户端的Socket获取输入流
				 * 循环读取该客户端发送过来的信息
				 */
				BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
				String str = null;
				while(true){
					str = reader.readLine();
					//System.out.println("客户端说：" + str);
					sendMessageToAllClient(str);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		//实例化服务器端实例
		Server server = new Server();
		server.start();		
	}
}
