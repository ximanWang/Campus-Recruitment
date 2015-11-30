package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历Map中的所有的key-value
 * 
 * Map保存键值对是使用Entry实例来保存的
 * 
 * Entry是Map的内部类，每一个实例用于保存一组存放Map中的键值对
 * @author tarena
 *
 */
public class IteratorMapEntry {
	public static void main(String[] args) {
		Map<String ,Integer> map = new HashMap<String, Integer>();
		//添加五个元素
		map.put("k1", 1);
		map.put("k2", 2);
		map.put("k3", 3);
		map.put("k4", 4);
		map.put("k5", 5);
		Set<Entry<String,Integer>> entris = map.entrySet();
		//获取用于遍历Set集合的迭代器
		Iterator<Entry<String,Integer>> it = entris.iterator();
		while(it.hasNext()){
			//遍历每一组键值对
			Entry<String,Integer> entry = it.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key:" + key);
			System.out.println("value:" + value);
		}
	}
}
