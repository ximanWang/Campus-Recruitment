package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 遍历Map中所有的key
 * @author tarena
 *
 */
public class IteratorMapKey {
	public static void main(String[] args) {
		Map<String ,Integer> map = new HashMap<String, Integer>();
		//添加五个元素
		map.put("k1", 1);
		map.put("k2", 2);
		map.put("k3", 3);
		map.put("k4", 4);
		map.put("k5", 5);
		/**
		 * 获取所有的key
		 */
		Set<String> keys = map.keySet();
		for(String str : keys){
			System.out.println("key:" + str);
			System.out.println("value:" + map.get(str));
		}
		/**
		 * 使用传统for循环
		 */
		for(Iterator<String> it = keys.iterator(); it.hasNext(); ){
			String key = it.next();
			System.out.println(key);
		}
	}
}
