import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestKataReversiMM 
{
	private Reversi reversi;
	
	@Before
	public void initialise()
	{
		this.reversi = new Reversi ();
	}
	
	@Test
	public void testStartBoard()
	{
		String input = "" +
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...WB...\n" +
				"........\n" +
				"........\n" +
				"........\n" +
				"B";
				
		String output = ""+
				"........\n" +
				"........\n" +
				"....0...\n" +
				"...BW0..\n" +
				"..0WB...\n" +
				"...0....\n" +
				"........\n" +
				"........\n" +
				"B";
				
		assertEquals(output, reversi.printLegalMoves(input));
	}
	
	@Test
	public void testTurnWhite ()
	{
		String input = "" +
				"........\n" +
				"........\n" +
				"........\n" +
				"...BW...\n" +
				"...WB...\n" +
				"........\n" +
				"........\n" +
				"........\n" +
				"W";
		
		String output =  ""+
				"........\n" +
				"........\n" +
				"...0....\n" +
				"..0BW...\n" +
				"...WB0..\n" +
				"....0...\n" +
				"........\n" +
				"........\n" +
				"W";
		assertEquals(output, reversi.printLegalMoves(input));
	}
	
	/*
	@Test
	public void testWhiteMove()
				{
				"........\nW" ,
				"........\nW" 
				},
				
		{
					"........\n" ,
					"........\n" 
		},
	}
	
	
*/
}
