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

	public List<ArrayList<String>> breakDownLCDDigits(List<String> lcds) {
		List<ArrayList<String>> sortedLCDs = new ArrayList<ArrayList<String>>();
		List<String> line1 = new ArrayList<String>(); 
		List<String> line2 = new ArrayList<String>(); 
		List<String> line3 = new ArrayList<String>(); 
		for(String lineOfDigit : lcds){
			line1.add(lineOfDigit.substring(0, 3));
			line2.add(lineOfDigit.substring(3, 6));
			line3.add(lineOfDigit.substring(6));
		}
		sortedLCDs.add((ArrayList<String>) line1);
		sortedLCDs.add((ArrayList<String>) line2);
		sortedLCDs.add((ArrayList<String>) line3);
		return sortedLCDs;
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

	public List<String> assemblePrintableLCD(List<ArrayList<String>> splitLCDs) {
		
		List<String> resortedLCDs = new ArrayList<String>();
		
		for(ArrayList<String> lineOfDigit : splitLCDs){
			StringBuilder appendedLine = new StringBuilder();
			for(String lineSegment : lineOfDigit) {
				appendedLine.append(lineSegment);
			}
			resortedLCDs.add(appendedLine.toString());
		}
		
		return resortedLCDs;
	}
	
	public String printLCD(List<String> resortedLCDs) {
		StringBuilder printableString = new StringBuilder();
		
		for(String lines : resortedLCDs){
			printableString.append(lines);
		}
		
		return printableString.toString();
		
	}

	

}
