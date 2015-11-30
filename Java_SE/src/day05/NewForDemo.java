package day05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 新循环 用来遍历集合和数组
 * @author tarena
 *
 */
public class NewForDemo {
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		for(int i=0; i<array.length; i++){
			int num = array[i];
			System.out.println(num+1);//每个元素+1输出
		}
		for(int num : array){
			System.out.println(num+1);
		}
		/**
		 * 遍历集合
		 */
		Collection<String> list = new ArrayList<String>();
		list.add("一");
		list.add("二");
		list.add("三");
		list.add("四");
		//list.add("五");
		for(int i=0; i<list.size();i++){
			String str = ((ArrayList<String>) list).get(i);
			System.out.println("第"+i+1+"项:"+str);
		}
		for(String str : list){
			System.out.println(str);
			//list.remove(str);//运行异常
		}
	}
}
