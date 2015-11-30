package day06;
/**
 * 
 * @author tarena
 *
 */
public class Student extends Person{

	@Override
	public String getName() {
		return "Lily";
	}

	@Override
	public String getInfo() {
		return "我喜欢北京";
	}

	@Override
	public String sayGoodBye() {
		return "拜拜";
	}

}
