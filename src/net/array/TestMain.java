package net.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class TestMain {

	public static void main(String[] args) {
		
		/*char a = 'A', b = 'a';
		System.out.println((char) (b - 32));
		
		List<CloneMe> cloneMeTest = new ArrayList<CloneMe>();
		CloneMe cloneMe = new CloneMe();
		Map<String, String> extraParam = new HashMap<>();
		extraParam.put("key", "1");
		cloneMe.cloneMeMap.put("exMp", extraParam);
		cloneMe.cloneMeMap1.put("key1", "1");
		int i = 0;
		while (i++ < 4){
			CloneMe cloned = cloneMe.clone();
			cloned.cloneMeMap.get("exMp").put("key", String.valueOf(i));
			cloned.cloneMeMap1.put("key1", String.valueOf(i));
			cloneMeTest.add(cloned);
		}
		System.out.println(cloneMeTest);
		
		System.out.println(isAnagram("geeksforgeeks","forgeeksgeeks"));*/
		
		/*printFirstNonRep("MoMoo");
		char[] chars = "abcdefg".toCharArray();
		char[] resultChars = new char[chars.length];
		reverseStringRec(chars, resultChars, 0, chars.length - 1);
		System.out.println(chars);
		System.out.println(resultChars);
		reverseStringIterative("abcdefg");
		reverseString("abcdefg");
		
		System.out.println("123434".matches(".*[^0-9].*"));*/
		
		//printAllPermutations("abc");
		/*permutation("abc");
		printReverseSentence("This is a sentence reverse");
		urlify("Mr John Smith    ");
		urlifyInPlace("Mr John Smith    ", 13);
		System.out.println(isPalindrome("abba"));
		removeDups("bananas");*/
		//System.out.println(isShuffled("abc","def","cdabef"));
		/*System.out.println(indexOf("adsabc","abc"));
		
		highestOccurance("aaaaaaaaaaaaaaaaabbbbcddddeeeeeebbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
		String a = "abcdadbba";
		char[] result = new char[a.length()];
		char ch = 'b';
		removeChar(a.toCharArray(),result,0,0,ch);
		System.out.println(a);
		System.out.println(result);
		result = new char[a.length()];
		ch = 'b';
		removeChar(a.toCharArray(),result,ch);
		System.out.println(result);
		
		List<String> array = Arrays.asList("asva","asdasd","as");
		sortArray(array);*/
		
		/*int[] array = new int[4];
		array[0] = 0;
		array[1] = 3;
		array[2] = 2;
		array[3] = 3;
		findDuplicate(array);
		
		findMissingNr(new int[]{11,22,33,40,50,60,100}, 21);
		findLarSm(new int[]{12,32,10,1,2,60});
		sortStringOnLen(Arrays.asList("ada","adasfd","as","a"));*/
		
		/*Map<Integer, Boolean> map = new HashMap<>();
		map.put(-12, true);
		map.put(12, true);
		System.out.println(map.size());
		findPairs(new int[]{1,-1,-12,0,12,0,11,13,14,15}, 12);*/
		/*findKthSmallest(new int[]{1,0,2,4,3}, 3);
		System.out.println(findKthLargest(new int[]{1,0,12,0,11,13,14,15}, 3));*/
		/*findCommonElements(new int[]{1, 5, 10, 20, 40, 80}, new int[]{6, 7, 20, 80, 100}, new int[]{3, 4, 15, 20, 30, 70, 80, 120});
		findFirstRep(new int[]{10, 5, 3, 4, 3, 5, 6});*/
		//removeDupsArray(new int[]{1,1,1,2,2,2,3,4,5,5,5});
		
		//removeElementArray(new int[]{1,1,1,2,2,3,4},1);
		
		//int[] result = mergeSortedArray(new int[]{12,34,45,66}, new int[]{10,23,34,45,88});
		/*findMaxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
		findMaxSubArray1(new int[]{-2,1,-3,4,-1,2,1,-5,4});
		findMaxSubArray2(new int[]{-12,-23,-1});
		findMaxSubProd(new int[]{-12,-23,-1});*/
		findMinValueUnSorted(new int[]{2,4,5,6,7,0,1},0,7,2);
		//binarySearchRec(new int[]{1,2,3,4,5,6,7},0,7,7);
		
	}
	
	/*public static void findKthLargest(int[] array, int k){
		PriorityQueue<Integer> a = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i: array){
			a.offer(i);
		}
		System.out.println(a);
		
		while(!a.isEmpty() && k-- > 0)
			a.poll();
		k.
		System.out.println(a.peek());
	}*/
	
	/*public static Integer findSmallestNotSubSet(int[] a){
		int i = 1,j=0;
		while(j < a.length && i==a[j]){
			i++;
			j++;
		}
	}*/
	
	//This is not correct solution
	public static void findMinValueUnSorted(int[] a, int i, int j, int min){
		int mid = (i+(j-1))/2;
		
		if(a[mid] < min){
			min = a[mid];
		}
		
		if(i > j){
			findMinValueUnSorted(a,i,mid-1,min);
			findMinValueUnSorted(a,mid+1,j,min);
		}
		System.out.println(min);
		return;
	}
	
	public static void binarySearchRec(int[] a, int l, int r, int x){
		if(l < r){
			int mid = (l + (r-1))/2;
			if(a[mid] == x){
				System.out.println(mid);
				return;
			}else if (a[mid] > x){
				r = mid - 1;
			}else
				l = mid + 1;
			binarySearchRec(a,l,r,x);
		}
		return;
	}
	public static void findMaxSubProd(int[] a){
		long maxSoFar = Long.MIN_VALUE, maxToThis = 1;
		int s=0,start=0,end=0;
		for(int i =0; i < a.length; i++){
			maxToThis *= a[i];
			if(maxToThis > maxSoFar){
				maxSoFar = maxToThis;
				start =s;
				end = i;
			}
			if(maxToThis < 1){
				maxToThis = 1;
				s = i;
			}
		}
		
		System.out.println(maxSoFar);
		System.out.println(start +"-"+ end);
	}
	
	public static void findMaxSubArray1(int[] a){
		int[] sub = new int[a.length];
		int max = a[0];
		sub[0] = max;
		int i=1;
		int k=0,j=0;
		for(; i<a.length;i++){
			if(a[i] + sub[i-1] < a[i]){
				j = i;
			}
			sub[i] = Math.max(a[i],sub[i-1] + a[i]);
			max = Math.max(max, sub[i]);
			if(sub[i] > max)
				k=i;
		}
		System.out.println(max);
		System.out.println(j + " - " + k);
	}
	
	public static void findMaxSubArray2(int[] a){
		int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        int start =0, end=0,s=0;
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here){
                max_so_far = max_ending_here;
                start = s;
                end=i;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
                s = i + 1;
            }
        }
        System.out.println(max_so_far);
        System.out.println(start + "-" + end);
	}
	
	public static void findMaxSubArray(int[] a){
		int max = a[0];
		int cur = 0;
		int[] sub = new int[]{0,1};
		for(int i=0;i<a.length;i++){
			cur = a[i];
			if(cur > max){
				sub[0] = i;
				sub[1] = 1;
			}
			if(i+1<a.length){
				for(int j=i+1; j<a.length;j++){
					cur += a[j];
					if(cur > max){
						sub[0] = i;
						sub[1] = j;
						max = cur;
					}
				}
			}
		}
		for(int a0:sub)
			System.out.println(a0);
	}
	
	public static int[] mergeSortedArray(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		if(a.length == 0){
			c = b;
			return c;
		}
		if(b.length == 0){
			c =a;
			return c;
		}
		
		int i = 0;
		if(a[a.length - 1] < b[0]){
			for(int a0 : a)
				c[i++] = a0;
			for(int b0 : b)
				c[i++] = b0;
			
			return c;
		}else if(b[b.length - 1] < a[0]){
			for(int b0 : b)
				c[i++] = b0;
			for(int a0 : a)
				c[i++] = a0;
			
			return c;
		}
		
		//int len = a.length > b.length ? b.length : a.length;
		i = 0;
		int j = 0, k =0;
		while(j < a.length && k < b.length){
			if(a[j] < b[k]){
				c[i] = a[j++];
			}else{
				c[i] = b[k++];
			}
			i++;
		}
		
		/*System.out.println(i + " "+ j + " " + k);
		for(int c0 : c)
			System.out.print(c0 + " ");*/
		
		while(j < a.length){
			c[i++] = a[j++];
		}
		
		while(k < b.length){
			c[i++] = b[k++];
		}
		
		//System.out.println(" ");
		
		for(int c0 : c)
			System.out.print(c0 + " ");
		
		return c;
	}
	
	public static void removeElementArray(int[] a, int e){
		int newlen = a.length;
		for(int a0: a){
			if(a0 == e)
				newlen--;
		}
		
		int[] temp = new int[newlen];
		int i =0;
		for(int a0: a){
			if(a0!=e)
				temp[i++] = a0;
		}
		a = temp;
		System.out.println(a.length);
		for(int a0 : a)
			System.out.print(a0 + " ");
	}
	
	//Runner's approach
	public static void removeDupsArray(int[] a){
		int prev = a[0];
		int i = 1, j= 1;
		for(;j<a.length;){
			if(prev == a[j]){
				while(j < a.length){
					if(prev != a[j]){
						prev = a[j];
						a[j] = a[j] + a[i] - (a[i] = a[j]);
						j++;
						i++;
						break;
					}
					j++;
				}
			}else{
				prev = a[j];
				a[j] = a[j] + a[i] - (a[i] = a[j]);
				i++;
				j++;
			}
			//System.out.println(" ");
			/*for(int k : a)
				System.out.print(k + " ");
			System.out.println(i + " " + j + "- " + prev);*/
		} 
		while(i < a.length){
			a[i++] = '\0';
		}
		for(int a0 : a)
			System.out.print(a0 + " ");
	}
	
	public static List<Integer> rearrangeArray(int[] a){
		int[] result = new int[a.length];
		int i=0,pi=0,ni=0;
		List<Integer> pos = new ArrayList<Integer>(a.length);
		List<Integer> neg = new ArrayList<Integer>(a.length);
		for(int a0 : a){
			if(a0 >= 0)
				pos.add(a0);
			else
				neg.add(a0);
		}
		for(int a0 : pos)
			System.out.print(a0 + " ");
		for(int a0 : neg)
			System.out.print(a0 + " ");
		
		i=0;pi = 0; ni = 0;
		while(i<result.length){
			if(ni < neg.size() && neg.get(ni) != null){
				result[i++] = neg.get(ni++);
			}else
				break;
			if(pi < pos.size() && pos.get(pi) != null){
				result[i++] = pos.get(pi++);
			}else
				break;
		}
		
		while(ni < neg.size() && neg.get(ni) != null)
			result[i++] = neg.get(ni++);
		while(pi < pos.size() && pos.get(pi) != null)
			result[i++] = pos.get(pi++);
		
		System.out.println("");
		List<Integer> res = new ArrayList<>();
		for(int a0:result){
			System.out.print(a0 + " ");
			res.add(a0);
		}
		
		return res;
	}
	
	public static String findTopTwo(int[] a){
		int max1=0; int max2=0;
		for(int i:a){
			if(i > max1){
				max2 = max1;
				max1 = i;
			}else if(i > max2)
				max2 = i;
		}
		String result = max1 + " " + max2;
		return result;
	}
	public static void findFirstRep(int[] a){
		Map<Integer, Integer> map = new HashMap<>();
		for(int i: a){
			if(map.containsKey(i)){
				map.put(i, map.get(i) + 1);
			}else
				map.put(i,1);
		}
		
		for(int i : a){
			if(map.get(i) > 1){
				System.out.println(i);
				break;
			}
		}
	}
	public static void findCommonElements(int[] a, int[] b, int[] c){
		int i=0,j=0,k=0,l=0;
		int[] common = new int[a.length > b.length ? (a.length > c.length ? a.length : c.length) : b.length];
		while(i < a.length && j < b.length && k < c.length){
			if(a[i]==b[j] && b[j]==c[k]){
				common[l++] = a[i];
				i++;
				j++;
				k++;
			}else{
				while((a[i] < b[j] || a[i] < c[k]) && i < a.length)
					i++;
				while((b[j] < a[i] || b[j] < c[k]) && j < b.length)
					j++;
				while((c[k] < b[j] || c[k] < a[i]) && k < c.length)
					k++;
			}
		}
		for(int a0: common)
			System.out.print(a0 + " ");
	}
	
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, Collections.reverseOrder());
	    for(int i: nums){
	        q.offer(i);
	    }
	 
	    while(k-- > 1){
	    	System.out.print(q.poll() + " ");
	    }
	    return q.peek();
	}
	
	public static void findKthSmallest(int[] array, int k){
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		for(int i: array){
			q.add(i);
		}
		
		if(k > q.size())
			return;
		
		while(k-- > 1){
	    	System.out.print(q.poll() + " ");
		}
		System.out.println("");
		System.out.println(q.peek());
	}
	
	public static void overloadedCheck(int a){
		
	}
	
	public static void overloadedCheck(Integer a){
		
	}
	
	public static void findPairs(int[] array, int sum){
		int expected = 0;
		List<Integer> exp = new LinkedList<Integer>();
		for(int i=0;i<array.length;i++)
			exp.add(array[i]);
		List<int[]> result = new ArrayList<int[]>();
		for(int i : array){
			expected = sum - i;
			Iterator<Integer> itr = exp.iterator();
			while(itr.hasNext()){
				int expInt = itr.next();
				if(expected == expInt){
					result.add(new int[]{i, expected});
					System.out.println(i + "-" + expected);
					itr.remove();
					break;
				}
			}
			//System.out.println(exp);
		}
	}
	public static void findLarSm(int[] array){
		int smallest = array[0], largest = array[0];
		for(int i: array){
			if(i < smallest)
				smallest = i;
			if(i > largest)
				largest  = i;
		}
		System.out.println(smallest);
		System.out.println(largest);
	}
	
	public static int binarySearchIterative(int[] array, int missing){
		int r = array.length - 1;
		int l = 0;
		while(l <= r){
			int x = (l + r)/2;
			if(array[x] == missing){
				System.out.println("Found at " + x);
				return x;
			}
			if(array[x] > missing)
				r=x -1;
			else
				l=x+1;
		}
		return -1;
	}
	public static void binarySearch(int[] array, int missing){
		int index =0 ;
		int si = 0;
		int ei = array.length;
		while((index = (si+ei)/2) > 0){
			if(array[index] == missing){
				System.out.println(index);
				return;
			}else if(array[index] < missing){
				si = index;
			}else
				ei = index;
		}
		if(array[index] == missing){
			System.out.println(index);
			return;
		}
		System.out.println(-1);
	}
	
	public static void sortStringOnLen(List<String> strings){
		System.out.println(strings);
		/*strings.sort(new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()) return -1;
				else if(o1.length() == o2.length()) return 0;
				else return 1;
			}
		});*/
		
		/*Collections.sort(strings, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o2.length() - o1.length();
			}
		});*/
		
		strings.sort((String o1, String o2) -> o2.length() - o1.length());
		
		System.out.println(strings);
	}
	public static void findDuplicate(int[] array){
		int[] result = new int[array.length];
		for(int i: array){
			result[i]++;
		}
		
		for(int i = 0; i < result.length; i++){
			if(result[i] > 1)
				System.out.println(i);
		}
	}
	
	public static void sortArray(List<String> a){
		//java.util.BitSet 
		PriorityQueue<String> q = new PriorityQueue<String>(a.size(), new Comparator<String>(){
			public int compare(String th, String ne){
				if(th.length() > ne.length()) return -1;
				else if(th.length() == ne.length()) return 0;
				else return 1;
			}
		});
		
		a.forEach(str -> {
			q.add(str);
		});
		
		System.out.println(q);
		
		/*a.clear();
		
		q.forEach(str -> {
			a.add(str);
		});
		
		System.out.println(a);*/
	}
	
	public static void removeChar(char[] a, char[] result, char c){
		int j = 0;
		for(char ch : a){
			if(ch != c){
				result[j++] = ch;
			}
		}
	}
	
	public static void removeChar(char[] a, char[] result, int i, int j, char c){
		if(i >= a.length)
			return;
		if(a[i] != c){
			result[j] = a[i];
			j++;
		}
		removeChar(a,result,++i,j,c);
	}
	
	public static void highestOccurance(String a){
		char cha = 0;
		Map<Character, Integer> map = new HashMap<>();
		int max = 0;
		for(char c : a.toCharArray()){
			if(map.containsKey(c)){
				map.put(c, map.get(c) + 1);
				if(map.get(c) > max){
					max = map.get(c);
					cha = c;
				}
			}else{
				map.put(c, 1);
			}
		}
		
		System.out.println(cha);
	}
	public static int indexOf(String a, String b){
		int i = 0;
		for(;i<a.length();i++){
			if(a.charAt(i) == b.charAt(0)){
				if((a.length() - i) < b.length()){
					break;
				}
				String subString = a.substring(i,i + b.length());
				//subString.indexOf("adad")
				if(subString.equals(b)){
					return i;
				}else
					continue;
			}
		}
		return -1;
	}
	public static boolean isShuffled(String a, String b, String c){
		if(a.length() + b.length() != c.length())
			return false;
		
		char[] ca = c.toCharArray();
		int i = 0;
		for(char ch : a.toCharArray()){
			while(i<c.length()){
				if(ca[i] == ch){
					ca[i] = ' ';
					break;
				}
				i++;
			}
		}
		
		i = 0;
		for(char ch : b.toCharArray()){
			while(i<c.length()){
				if(ca[i] == ch){
					ca[i] = ' ';
					break;
				}
				i++;
			}
		}
		
		for(char ch : ca)
			if(ch != ' ')
				return false;
		
		return true;
	}

	public static void removeDups(String a){
		boolean[] chars = new boolean[256];
		
		int i = 0;
		while(i < 256){
			chars[i++] = false;
		}
		StringBuilder strb = new StringBuilder();
		for(char c : a.toCharArray()){
			if(chars[c])
				continue;
			else{
				strb.append(c);
				chars[c] = true;
			}
		}
		System.out.println(strb.toString());
	}
	private static boolean isPalindrome(String a){
		int len = a.length();
		int cnt = 0;
		if(len%2 == 0)
			cnt = len/2;
		else
			cnt = len/2 + 1;
		
		for(int i = 0,j = len - 1; i < cnt; i++,j--){
			if(a.charAt(i) != a.charAt(j))
				return false;
		}
		return true;
	}
	private static void urlifyInPlace(String url, int trueLength){
		int i = trueLength - 1, index = url.length() - 1;
		char[] chars = url.toCharArray();
		while(i >= 0){
			if(chars[i] != ' '){
				chars[index--] = chars[i--];
			}else{
				chars[index--] = '0';
				chars[index--] = '2';
				chars[index--] = '%';
				i--;
			}
		}
		System.out.println(chars);
	}
	
	private static void urlify(String url){
		int sc = 0;
		for(char c : url.toCharArray())
			if(c == ' ')
				sc++;
		
		StringBuilder strb = new StringBuilder();
		int i = 0;
		for(char c : url.toCharArray()){
			if(c != ' '){
				strb.append(c);
			}else{
				strb.append('%');
				strb.append('2');
				strb.append('0');
			}
		}
		System.out.println(strb.toString());
	}
	
	private static void printReverseSentence(String sentence){
		Stack<String> stack = new Stack<String>();
		StringBuilder str = new StringBuilder();
		for(char c : sentence.toCharArray()){
			if(c != ' '){
				str.append(c);
			}else{
				if(str.length() > 0){
					stack.push(str.toString());
					str = new StringBuilder();
				}
			}
		}
		if(str.length() > 0)
			stack.push(str.toString());
		
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + " ");
		}
	}
	
	private static void printAllPermutations(String a){
		int i = 0, len = a.length();
		int cnt = len* (len -1);
		Set<String> permutations = new HashSet<String>(cnt);
		permutations.add(a);
		for(i=0;i<len;i++){
			int j = i + 1;
			for(;j<len;j++){
				char[] chAr = a.toCharArray();
				swap(chAr, i, j);
				permutations.add(String.valueOf(chAr));
			}
		}
		
		permutations.forEach(System.out::println);
	}
	
	private static void permutation(String a){
		Set<String> permutations = new HashSet<String>(a.length() * (a.length() - 1));
		permutaion(permutations, "", a);
		permutations.forEach(System.out::println);
	}
	private static void permutaion(Set<String> result, String prefix, String word){
		if(word.isEmpty()){
			result.add(prefix);
		}else{
			for(int i=0;i<word.length();i++){
				permutaion(result, prefix + word.charAt(i), word.substring(0,i) + word.substring(i+1, word.length()));
			}
		}
	}
	
	public static char[] rotateChars(char[] chars, int rotations){
		int len = chars.length;
		rotations = rotations%len;
		char[] chAr = new char[len];
		for(int i = 0; i < len; i++){
			int ti = (len - rotations + i) % len;
			chAr[ti] = chars[i];
		}
		return chAr;
	}
	
	private static void reverseStringRec(char[] chAr, char[] resultChars, int i, int j){
		if(i>=chAr.length)
			return;
		reverseStringRec(chAr, resultChars, i + 1, j - 1);
		resultChars[j] = chAr[i];
	}
	
	private static void reverseStringIterative(String str){
		Stack<Character> stack = new Stack<Character>();
		//Queue<Character> q = new LinkedList<Character>();
		for(char ch: str.toCharArray())
			stack.push(ch);
		
		char[] chAr = new char[str.length()];
		int i =0;
		while(!stack.isEmpty()){
			chAr[i++] = stack.pop();
		}
		System.out.println(chAr);
	}
	
	private static void reverseString(String str){
		int len = str.length();
		char[] chars = str.toCharArray();
		if(len%2 != 0)
			len = len/2 + 1;
		
		int i=0,ti=str.length() - 1;
		while(i<len){
			swap(chars, i, ti);
			i++;
			ti--;
		}
		
		System.out.println(chars);
	}
	
	private static void swap(char[] chars, int i, int ti){
		chars[i] = (char) (chars[i] + chars[ti] - (chars[ti]=chars[i]));
	}
	private static void printFirstNonRep(String a){
		Map<Character, Integer> chars = new LinkedHashMap<>();
		for(char ch:a.toCharArray()){
			if(chars.containsKey(ch)){
				chars.put(ch, chars.get(ch) + 1);
			}else
				chars.put(ch, 1);
		}
		
		for(char ch : chars.keySet()){
			if(chars.get(ch) == 1){
				System.out.println(ch);
				break;
			}else
				continue;
		}
		
		Iterator<Map.Entry<Character, Integer>> itr = chars.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Character, Integer> entry = itr.next();
			if(entry.getValue() == 1){
				System.out.println(entry.getKey());
				break;
			}
		}
		
	}
	private static boolean isAnagram(String a, String b){
        if(a.length() != b.length())
            return false;
        
        Map<Character, Integer> chars = new HashMap<>(a.length());
        for(Character ch : a.toCharArray()){
            char lowerCase = Character.toLowerCase(ch);
            if(chars.containsKey(lowerCase)){
                chars.put(lowerCase, chars.get(lowerCase) + 1);
            }else{
                chars.put(lowerCase, 1);
            }
        }
        System.out.println(chars);
        
        for(Character ch : b.toCharArray()){
        	char lowerCase = Character.toLowerCase(ch);
        	if(chars.containsKey(lowerCase)){
        		chars.put(lowerCase, chars.get(lowerCase) - 1);
        	}else
        		return false;
        }
        
        for(int i : chars.values()){
        	if(i > 0 || i < 0 )
        		return false;
        }
        return true;
    }
}
