package day02;

public class Test {
	int m = 0;
	int n = 0;
	public void inPutScore (int score) throws ScoreException{
		if(score<0 || score>100){
			throw new ScoreException(score);
		}else{
			if(score < 60)
				m++;
			else
				n++;
		}
	}
}
