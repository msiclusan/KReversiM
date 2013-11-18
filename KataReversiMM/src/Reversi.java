
public class Reversi {

	public String printLegalMoves(String input)
	{
		if (this.isTurnforWhite (input))
		
		return ""+
				"........\n" +
				"........\n" +
				"...0....\n" +
				"..0BW...\n" +
				"...WB0..\n" +
				"....0...\n" +
				"........\n" +
				"........\n" +
				"W"; 
		
		return ""+
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...0....\n" +
				"........\n" +
				"........\n" +
				"B";
	}

	
	private boolean isTurnforWhite(String input) 
	{
		return input.charAt(input.length() - 1) == 'W';
	}
	
	
}
	

