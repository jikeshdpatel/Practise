package net.math;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {

	public static void main(String[] args){
		/*System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(12));
		System.out.println(isPalindrome(2147447412));*/
		
		/*for (int i = 1; i < 10; i++) {
			System.out.println(i + "-" +isPrime(i));
		}*/
		try{
			System.out.println("test");
		}catch(Exception ex){
			System.out.println("catched");
		}finally{
			int i = 1/0;
		}
		System.out.println(primesum(16777214));
	}
	
	public static ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> result = new ArrayList<>();
		if(a<4)
			return result;
		
		List<Boolean> isPrimeList = primeList(a);	
		/*
		for (int i = 0; i < isPrimeList.size(); i++) {
		System.out.println(i + "-" + isPrime(i));
	}*/
		
		for (int i = 2; i < a; i++) {
			if(isPrimeList.get(i)){
				if(isPrimeList.get(a - i)){
					result.add(i);
					result.add(a - i);
					return result;
				}
			}
		}
		
		return result;
	}
	
	public static List<Boolean> primeList(int a){
		List<Boolean> isPrimeList = new ArrayList<>(a);
		for (int i = 0; i < a; i++) {
			isPrimeList.add(true);
		}
		
		for (int i = 2; i < Math.sqrt(a); i++) {
			if(isPrimeList.get(i)){
				int j = 2;
				while(i*j < a){
					isPrimeList.set(i*j,false);
					j++;
				}
			}
		}
		return isPrimeList;
	}
	
	/*public static ArrayList<Integer> primesum(int a) {
		ArrayList<Integer> result = new ArrayList<>();
		if(a<4)
			return result;
		
		int original = a;
		int med = a/2;
		
		List<Integer> smallPrimes = new ArrayList<>();
		List<Integer> largePrimes = new ArrayList<>();
		for (int i = 2; i <= med; i++) {
			if(isPrime(i))
				smallPrimes.add(i);
		}
		for (int i = med; i < original; i++) {
			if(isPrime(i))
				largePrimes.add(i);
		}
		
		for (int s : smallPrimes) {
			for (int l : largePrimes) {
				if(s+l == original){
                    result.add(s);
                    result.add(l);
                    return result;
                }
			}
		}
		return result;
	}*/
	
	/*public static ArrayList<Integer> primesum(int a) {
        ArrayList<Integer> result = new ArrayList<>();
        if(a<4)
            return result;
        
        int original = a;
        int med = a/2;
        a = 2;
        int b = med;
        
        while(a <= med){
            if(isPrime(a)){
                int c = b;
                while(c < original){
                    if(isPrime(c)){
                        if(a+c == original){
                            result.add(a);
                            result.add(b);
                            return result;
                        }
                    }
                    c++;
                }
            }
            a++;
        }
        
        return result;
    }*/
	public static boolean isPrime(int a){
        for(int i=2; i <= Math.sqrt(a); i++){
            if(a%i == 0)
                return false;
        }
        return true;
    }
	
	public static boolean isPalindrome(int a) {
	    int b=0;
	    int c=10;
	    int temp = a;
	    while(a > 0){
	        b = (c * b) + (a%10);
	        a = a/10;
	    }
	    System.out.println(b);
	    if(b == temp)
	        return true;
	    else
	        return false;
	}
}

