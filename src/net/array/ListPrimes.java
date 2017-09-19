package net.array;

public class ListPrimes {

	public static void main(String[] args) {
		
		listPrimes(20);
		System.out.println(Math.sqrt(20));
	}

	public static void listPrimes(int n){
		for (int i = 1; i <= n; i++) {
			if(i == 1 || i == 2){
				//System.out.println(i);
				continue;
			}
		
			boolean isPrime = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i % j == 0){
					//System.out.println(i);
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
