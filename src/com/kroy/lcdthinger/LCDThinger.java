package com.kroy.lcdthinger;

public class LCDThinger {

	public String convertNumbersToLCDDigits(int i) {
		if (i == 0) {
			return LCDIntegerConstants.ZERO;
		} else if (i == 1) {
			return LCDIntegerConstants.ONE;
		} else if (i == 2) {
			return LCDIntegerConstants.TWO;
		} else if (i == 3) {
			return LCDIntegerConstants.THREE;
		} else if (i == 4) {
			return LCDIntegerConstants.FOUR;
		} else if (i == 5) {
			return LCDIntegerConstants.FIVE;
		} else if (i == 6) {
			return LCDIntegerConstants.SIX;
		} else if (i == 7) {
			return LCDIntegerConstants.SEVEN;
		} else if (i == 8) {
			return LCDIntegerConstants.EIGHT;
		} else if (i == 9) {
			return LCDIntegerConstants.NINE;
		} else {
			return null;
		}
	}

}
