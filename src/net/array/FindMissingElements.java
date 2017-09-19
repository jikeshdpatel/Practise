package net.array;

public class FindMissingElements {

	public static void main(String[] args) {
		/*int array[] = new int[3];
		array[0] = 4;
		array[1] = 3;
		//array[2] = 0;
		//array[3] = 2;
		array[2] = 1;
		findMissingElements(array, 2);*/
		
		int a=5,b=7;
		a = a + b - (b =a);
		System.out.println(a + "&" + b);
	}

	public static void findMissingElements(int[] array, int missingElementsCount){
		int tempArray[] = new int[array.length + missingElementsCount];
		for (int i = 0; i < array.length; i++) {
			tempArray[array[i]]++;
		}
		for (int i = 0; i < tempArray.length; i++) {
			if(tempArray[i] == 0)
				System.out.println(i);
		}
		//System.out.println(tempArray[0]);
	}
}
