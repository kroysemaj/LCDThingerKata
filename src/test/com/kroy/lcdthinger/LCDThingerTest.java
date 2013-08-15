package test.com.kroy.lcdthinger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.kroy.lcdthinger.LCDIntegerConstants;
import com.kroy.lcdthinger.LCDThinger;

public class LCDThingerTest {

	private LCDThinger lcdt;
	
	@Before 
	public void setUp() {
		lcdt = new LCDThinger();
	}
	
	@Test
	public void itCanRepresentZero() {
		assertEquals(lcdt.convertDigitToLCDDigit(0), LCDIntegerConstants.ZERO); 
	}

	@Test
	public void itCanRepresentOne() {
		assertEquals(lcdt.convertDigitToLCDDigit(1), LCDIntegerConstants.ONE); 
	}

	@Test
	public void itCanRepresentTwo() {
		assertEquals(lcdt.convertDigitToLCDDigit(2), LCDIntegerConstants.TWO);
	}

	@Test
	public void itCanRepresentThree() {
		assertEquals(lcdt.convertDigitToLCDDigit(3), LCDIntegerConstants.THREE);
	}

	@Test
	public void itCanRepresentFour() {
		assertEquals(lcdt.convertDigitToLCDDigit(4), LCDIntegerConstants.FOUR);
	}
	
	@Test
	public void itCanRepresentFive() {
		assertEquals(lcdt.convertDigitToLCDDigit(5), LCDIntegerConstants.FIVE);
	}
	
	@Test
	public void itCanRepresentSix() {
		assertEquals(lcdt.convertDigitToLCDDigit(6), LCDIntegerConstants.SIX);
	}
	
	@Test
	public void itCanRepresentSeven() {
		assertEquals(lcdt.convertDigitToLCDDigit(7), LCDIntegerConstants.SEVEN);
	}
	
	@Test
	public void itCanRepresentEight() {
		assertEquals(lcdt.convertDigitToLCDDigit(8), LCDIntegerConstants.EIGHT);
	}
	
	@Test
	public void itCanRepresentNine() {
		assertEquals(lcdt.convertDigitToLCDDigit(9), LCDIntegerConstants.NINE);
	}
	
	@Test
	public void itCanParseMultiDigitNumbersToIntegerList() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		assertEquals(lcdt.parseDigits("123"), intList);
	}
	
	@Test
	public void itCanGetTheLCDForEachNumberInAnIntList() {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		List<String> lcds = new ArrayList<String>();
		lcds.add(LCDIntegerConstants.ONE);
		lcds.add(LCDIntegerConstants.TWO);
		lcds.add(LCDIntegerConstants.THREE);
		
		assertEquals(lcdt.fetchLCDForDigit(intList), lcds);
	}
	
	@Test
	public void itCanConcatTheTopLineOf2LCDNumbers() {
		String zeroOneTopLine = 	" _ " + "   ";
		fail("Haven't written it yet");
//		assertEquals(lcdt.buildLCD(), zeroOneTopLine);
	}

	@Test
	public void itCanConcat2LCDNumbers() {
		String zeroOne = 	" _ " + "   " + 
				"| |" + "  |" +
				"|_|" + "  |";
		fail("Haven't written it yet");
//		assertEquals(lcdt.buildLCD(), zeroOne);
	}
	
}

