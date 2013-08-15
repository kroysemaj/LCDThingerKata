package com.kroy.lcdthinger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCDThinger {
	private Map <Integer, String> LCDToIntegerMap = new HashMap();
	
	public LCDThinger() {
		setUpMap();
	}
		
	public String convertDigitToLCDDigit(int i) {
		return LCDToIntegerMap.get(i);
	}
	
	private void setUpMap() {
		LCDToIntegerMap.put(0, LCDIntegerConstants.ZERO);
		LCDToIntegerMap.put(1, LCDIntegerConstants.ONE);
		LCDToIntegerMap.put(2, LCDIntegerConstants.TWO);
		LCDToIntegerMap.put(3, LCDIntegerConstants.THREE);
		LCDToIntegerMap.put(4, LCDIntegerConstants.FOUR);
		LCDToIntegerMap.put(5, LCDIntegerConstants.FIVE);
		LCDToIntegerMap.put(6, LCDIntegerConstants.SIX);
		LCDToIntegerMap.put(7, LCDIntegerConstants.SEVEN);
		LCDToIntegerMap.put(8, LCDIntegerConstants.EIGHT);
		LCDToIntegerMap.put(9, LCDIntegerConstants.NINE);
	}

	public String buildLCD() {
		
		return null;
	}

	public List<Integer> parseDigits(String longNumber) {
		List<Integer> parsedInts = new ArrayList<Integer>();
		for(int i = 0; i < longNumber.length(); i++) {
			Character intChar = longNumber.charAt(i);
			String stringChar = intChar.toString();
			Integer singleInt = Integer.parseInt(stringChar);
			parsedInts.add(singleInt);
		}
		
		return parsedInts;
	}

	public List<String> fetchLCDForDigit(List<Integer> intList) {
		List<String> convertedDigits = new ArrayList<String>();
		
		for(Integer singleInt : intList) {
			convertedDigits.add(convertDigitToLCDDigit(singleInt));
		}
		return convertedDigits;
	}
	

}
