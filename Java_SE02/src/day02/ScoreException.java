package day02;

public class ScoreException extends Exception{
	int score;
	public ScoreException(int score){
		this.score = score;
	}
}
