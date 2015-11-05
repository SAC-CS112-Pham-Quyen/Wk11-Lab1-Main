
public class Wk11_Dice {

	
	private int gameNum;
	
	
public void Throw()
	
	{
		
		gameNum = 1 + (int)(Math.random()*6);
		
		
		
	}
	
public int Value()
	{
		return gameNum;
	}

	
}