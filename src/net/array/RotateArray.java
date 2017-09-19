package net.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Queue;
import java.util.TreeMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class RotateArray {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(14, 5, 14, 34, 42, 63, 17, 25, 39, 61, 97, 55, 33, 96, 62, 32, 98, 77, 35));
		int totalRotation = 56;
		System.out.println(rotateArray(A, totalRotation));
		Queue<String> q = new LinkedBlockingQueue();
		Queue<String> q1 = new PriorityBlockingQueue<>();
		//LinkedHashMap<K, V>
	}
	
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>(A.size());
		B = A.size() - Math.floorMod(B, A.size());
		
		if(B > 0){
		    for(int i = A.size() - B; i < A.size(); i++){
    			ret.add(A.get(i));
    		}
		}
		
		for (int i = 0; i < A.size() - B; i++) {
			ret.add(A.get(i));
		}
		return ret;
	}

}
