package day03;
import java.util.Random;

public class Demo04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c;
		c = 'A' + 1;
		System.out.println(c);//B
		
		Random random = new Random();
		int n = random.nextInt(26);//[0,26);
		c = (char)('A'+n);
		System.out.println(c);

	}

}
