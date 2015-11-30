package day03;

public class Demo10 {

	/**
	 * 周期性现象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] players = {"佟大为","邓超","孙丽"};
		//
		//System.out.println(players[1]);
		int i = 0;
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		System.out.println(players[i++%3]);
		
	}

}
