package net.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindSumPairs {
	
    public static void main (String[] args)
    {
        int A[] = {5,5,5,-1,6,0,12,-7,7,8,3,2};
        int n = 5;
        List<String> resultPairs = findPair(A, n);
        List<String> expected = new ArrayList<String>();
        expected.add("5:0");
        expected.add("-1:6");
        expected.add("12:-7");
        expected.add("3:2");
        
        System.out.println(resultPairs);
        if(isValidPairs(resultPairs, expected))
        	System.out.println("VALID PAIRS");
        else
        	System.out.println("INVALID PAIRS");
    }
    
    public static boolean isValidPairs(List<String> actual, List<String> expected){
    	if(actual.size() != expected.size())
    		return false;
    	
    	int size = actual.size();
    	try {
			for (int i = 0; i < size; i++) {
				if(!expected.contains(actual.get(i)))
					return false;
				expected.remove(actual.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    	return true;
    }
    public static List<String> findPair(int[] intArray, int sum){
    	List<String> resultPairs = new ArrayList<String>(intArray.length/2 + 1);
    	
    	//If empty array then return empty resultPairs
    	if(intArray.length == 0){
    		return resultPairs;
    	}
    	
    	//Map to lookup missing pair in constant time complexity. This map holds the int vs nr of times present in the array
    	Map<Integer, Integer> pairLkup = new HashMap<Integer, Integer>(intArray.length);
    	for (int i = 0; i < intArray.length; i++) {
			pairLkup.put(intArray[i], pairLkup.get(intArray[i]) != null ? pairLkup.get(intArray[i]) + 1: 1);
		}
    	
    	for (int i = 0; i < intArray.length; i++) {
    		int otherPair = sum - intArray[i]; //Find the missing pair
			if(pairLkup.containsKey(otherPair)){//Found the pair, it can be itself
				int pairCount = pairLkup.get(otherPair);
				if(intArray[i] == otherPair){
					//If the missing pair is itself then correct the counter by reducing by 1 (by itself)
					pairCount--;
					if(pairCount > 0){ 
						//If still the value present then it's the missing pair
						
						//put in the result list
						resultPairs.add(intArray[i] + ":" +otherPair);
						
						//Reduce the lookup & missing pair so the next iteration will not count it again. Unless all the possible pairs require
						pairLkup.put(otherPair, pairLkup.get(otherPair) - 2);
					}
				}else{
					if(pairCount > 0 //missing element must be present in map
							&& !resultPairs.contains(otherPair+ ":" + intArray[i])){ //If the reverse of the different elements present then don't consider else it will show two same pairs like (a,b) (b,a)
						
						//put in the result list
						resultPairs.add(intArray[i] + ":" +otherPair);
						
						//Reduce the lookup & missing pair so the next iteration will not count it again. Unless all the possible pairs require
						pairLkup.put(intArray[i], pairLkup.get(intArray[i]) - 1);
						pairLkup.put(otherPair, pairLkup.get(otherPair) - 1);
					}
				}
				
			}
		}
    	
    	return resultPairs;
    }
   
}
