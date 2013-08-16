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
	private List<Integer> intList;
	private List<String> lcds;
	private List<ArrayList<String>> splitLCDs;
	private List<String> line1;
	private List<String> line2;
	private List<String> line3;
	private List<String> resortedLCD;
	private String originalString = "123";
	
	@Before 
	public void setUp() {
		lcdt = new LCDThinger();
		
		 
		
		intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		
		lcds = new ArrayList<String>();
		lcds.add(LCDIntegerConstants.ONE);
		lcds.add(LCDIntegerConstants.TWO);
		lcds.add(LCDIntegerConstants.THREE);
		
		line1 = new ArrayList<String>();
		line2 = new ArrayList<String>();
		line3 = new ArrayList<String>();
		line1.add("   ");
		line2.add("  |");
		line3.add("  |");
		line1.add(" _ ");
		line2.add(" _|");
		line3.add("|_ ");
		line1.add(" _ ");
		line2.add(" _|");
		line3.add(" _|");
		
		splitLCDs = new ArrayList<ArrayList<String>>();
		splitLCDs.add((ArrayList<String>) line1);
		splitLCDs.add((ArrayList<String>) line2);
		splitLCDs.add((ArrayList<String>) line3);
		
		resortedLCD = new ArrayList<String>();
		resortedLCD.add("    _  _ ");
		resortedLCD.add("  | _| _|");
		resortedLCD.add("  ||_  _|");
		
		String reassembledString = 	"    _  _ " +
									"  | _| _|" +
									"  ||_  _|";
		
	}
	
	@Test
	public void itCanRepresentZero() {
		assertEquals(LCDIntegerConstants.ZERO, lcdt.convertDigitToLCDDigit(0)); 
	}

	@Test
	public void itCanRepresentOne() {
		assertEquals(LCDIntegerConstants.ONE, lcdt.convertDigitToLCDDigit(1)); 
	}

	@Test
	public void itCanRepresentTwo() {
		assertEquals(LCDIntegerConstants.TWO, lcdt.convertDigitToLCDDigit(2));
	}

	@Test
	public void itCanRepresentThree() {
		assertEquals(LCDIntegerConstants.THREE, lcdt.convertDigitToLCDDigit(3));
	}

	@Test
	public void itCanRepresentFour() {
		assertEquals(LCDIntegerConstants.FOUR, lcdt.convertDigitToLCDDigit(4));
	}
	
	@Test
	public void itCanRepresentFive() {
		assertEquals(LCDIntegerConstants.FIVE, lcdt.convertDigitToLCDDigit(5)) ;
	}
	
	@Test
	public void itCanRepresentSix() {
		assertEquals(LCDIntegerConstants.SIX, lcdt.convertDigitToLCDDigit(6));
	}
	
	@Test
	public void itCanRepresentSeven() {
		assertEquals(LCDIntegerConstants.SEVEN, lcdt.convertDigitToLCDDigit(7));
	}
	
	@Test
	public void itCanRepresentEight() {
		assertEquals(LCDIntegerConstants.EIGHT, lcdt.convertDigitToLCDDigit(8));
	}
	
	@Test
	public void itCanRepresentNine() {
		assertEquals(LCDIntegerConstants.NINE, lcdt.convertDigitToLCDDigit(9));
	}
	
	@Test
	public void itCanParseMultiDigitNumbersToIntegerList() {
		assertEquals(intList, lcdt.parseDigits(originalString));
	}
	
	@Test
	public void itCanGetTheLCDForEachNumberInAnIntList() {
		assertEquals(lcds, lcdt.fetchLCDForDigit(intList));
	}
	
	@Test
	public void itCanSplit2LCDNumbersInto9PiecesByLines() {
		assertEquals(splitLCDs, lcdt.breakDownLCDDigits(lcds));
	}
	
	@Test
	public void itCanRebuildTheLCDDigitsInTheCorrectOrder() {
		assertEquals(resortedLCD, lcdt.assemblePrintableLCD(splitLCDs));
	}
	
	@Test
	public void itCanPrintTheReassembledLCDs() {
		assertEquals(resortedLCD, lcdt.assemblePrintableLCD(splitLCDs));
	}
	
	
}

