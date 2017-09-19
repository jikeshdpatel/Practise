package net.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution2 {
	
	Map<String, Integer> dayIndex = new HashMap<String, Integer>();
	Map<String, Integer> monthIndex = new HashMap<String, Integer>();
	Map<String, Integer> monthLength = new HashMap<String, Integer>();
	int[] monthLenght = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int solution(int Y, String A, String B, String W) {
        // write your code in Java SE 8
		
		if(Y < 2001 || Y > 2099){
			return 0;
		}
		
		boolean isLeapYear = Y % 4 == 0 ? true : false;
		
		int beginingMonthIndex = monthIndex.get(A);
		int endingMonthIndex = monthIndex.get(B);
		int janDayIndex = dayIndex.get(W);
		
		if(endingMonthIndex < beginingMonthIndex)
			return 0;
		//Total days until begMonth
		int totalDaysBegMonth = 0;
		for (int i = 0; i < beginingMonthIndex - 1; i++) {
			totalDaysBegMonth += monthLength.get(i);
			if(i == 1 && isLeapYear){
				totalDaysBegMonth++;
			}
		}
		
		int nrDaysToSkip;
		
		if(endingMonthIndex == beginingMonthIndex){
			
		}
		//Idendtify the start index of the beginining month
		
		//Indentify the end index of the endingMonth
		
    }
	
	
}
