package test.com.kroy.lcdthinger;

import static org.junit.Assert.*;


import org.junit.Test;

import com.kroy.lcdthinger.LCDIntegerConstants;
import com.kroy.lcdthinger.LCDThinger;

public class LCDThingerTest {

	@Test
	public void itCanRepresentZero() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(0), LCDIntegerConstants.ZERO); 
	}

	@Test
	public void itCanRepresentOne() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(1), LCDIntegerConstants.ONE); 
	}

	@Test
	public void itCanRepresentTwo() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(2), LCDIntegerConstants.TWO);
	}

	@Test
	public void itCanRepresentThree() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(3), LCDIntegerConstants.THREE);
	}

	@Test
	public void itCanRepresentFour() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(4), LCDIntegerConstants.FOUR);
	}
	
	@Test
	public void itCanRepresentFive() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(5), LCDIntegerConstants.FIVE);
	}
	
	@Test
	public void itCanRepresentSix() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(6), LCDIntegerConstants.SIX);
	}
	
	@Test
	public void itCanRepresentSeven() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(7), LCDIntegerConstants.SEVEN);
	}
	
	@Test
	public void itCanRepresentEight() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(8), LCDIntegerConstants.EIGHT);
	}
	
	@Test
	public void itCanRepresentNine() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(9), LCDIntegerConstants.NINE);
	}
	
	@Test
	public void itCanConcat2LCDNumbers() {
		LCDThinger lcdt = new LCDThinger();
		assertEquals(lcdt.convertNumbersToLCDDigits(9), LCDIntegerConstants.NINE);
	}
		
	
}

