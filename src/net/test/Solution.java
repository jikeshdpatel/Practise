package net.test;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Solution {
	
	Map<String, Integer> dayIndex = new HashMap<String, Integer>();
	Map<String, Integer> monthIndex = new HashMap<String, Integer>();
	Map<String, Integer> monthLength = new HashMap<String, Integer>();
	int[] monthLenght = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public int solution(int Y, String A, String B, String W) {
        // write your code in Java SE 8
		
		if(Y < 2001 || Y > 2099){
			return 0;
		}
		
		Calendar cal = Calendar.Builder();
		cal.set(Y, A);
		
    }
	
	
}
