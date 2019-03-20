import java.util.*;
public class DicePair{
	private Die die1, die2;
	public int resultI;

	public DicePair(){
		die1 = new Die();
        die2 = new Die();

	}
	public roll(){
		resultI = die1.roll()+die2.roll();
		return resultI;


	}
	
	public toString(){
		String result = Integer.toString(resultI);
        return result;

	}
}